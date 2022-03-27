package task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {

    public static final int COUNT_PERSON = 100;
    Random r = new Random();
    private final String[] arrayName = {"Ivan", "Petr", "Andrey", "Sergey", "Anton"};
    private final String[] arraySurname = {"Ivanov", "Petrov", "Kuznetsov", "Sergeev", "Andreev"};
    private final List<Person> personList = new ArrayList<>();

    public List<Person> generatePerson() {
        for (int i = 0; i < COUNT_PERSON; i++) {
            personList.add(new Person(arrayName[r.nextInt(arrayName.length)],arraySurname[r.nextInt(arraySurname.length)],
                    r.nextInt(30) + 15));
        }
        return personList;
    }
    }

