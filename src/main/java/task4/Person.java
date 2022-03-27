package task4;

import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Person implements Serializable {
    public static final String FILE_NAME = "person.txt";
    private String name;
    private String surname;
    private Integer age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static void writePersonToFile(List<Person> personList){
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            personList.forEach(person -> {
                try {
                    oos.writeObject(person);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Person> readPersonFromFile(String file){
        List<Person> personFromFile = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true){
                try {
                    personFromFile.add((Person) ois.readObject());
                } catch (EOFException e){
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return personFromFile;
    }

}
