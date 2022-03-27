package task4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String NAME_READ_FILE = "person.txt";
    public static final int LIMIT_AGE = 21;

    public static void main(String[] args) {

        Generator generator = new Generator();
        List<Person> people = generator.generatePerson();

        System.out.println("Вывод всех Person, возраст которых меньше 21");
        List<Person> personList = people.stream()
                .filter(p -> p.getAge() < LIMIT_AGE).toList();
        personList.forEach(person -> System.out.println(person.getName() + " " + person.getSurname() + " " + person.getAge()));

        System.out.println("Cортировка по фамилии, а потом по имени -> убираем дубли");
        List<Person> distinctPerson = personList.stream()
                .sorted(new SurnameComparator().thenComparing(new NameComparator()))
                .distinct().toList();

        //запись в файл
        Person.writePersonToFile(distinctPerson);

        //чтение из файла
        List<Person> personFromFile = Person.readPersonFromFile(NAME_READ_FILE);

        //создание коллекции из name и surname
        List<String> finalPerson = personFromFile.stream()
                .map(person -> person.getName() + " " + person.getSurname()).toList();

        System.out.println("Коллекция из name и surname");
        finalPerson.forEach(System.out::println);
    }
}
