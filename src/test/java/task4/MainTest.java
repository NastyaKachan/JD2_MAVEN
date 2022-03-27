package task4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class MainTest {
    private static final String FILE = "test.txt";
    private static final String NAME_1 = "Ivan";
    private static final String NAME_2 = "Petr";
    private static final String SURNAME_1 = "Ivanov";
    private static final String SURNAME_2 = "Petrov";
    public static final Integer AGE_IVAN = 21;
    public static final Integer AGE_PETR = 35;

    @BeforeClass
    public static void before() {
        try {
            Person personIvan = new Person(NAME_1, SURNAME_1, AGE_IVAN);
            Person personPetr = new Person(NAME_2, SURNAME_2, AGE_PETR);

            FileOutputStream fos = new FileOutputStream(FILE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(personIvan);
            oos.writeObject(personPetr);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void after(){
        new File(FILE).delete();
    }

    @Test
    public void testSerialization() {
        try {
            FileInputStream fis = new FileInputStream(FILE);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person Ivan = (Person) ois.readObject();
            Person Petr = (Person) ois.readObject();
            ois.close();

            assertEquals(Ivan.getName(), NAME_1);
            assertEquals(Ivan.getSurname(), SURNAME_1);
            assertEquals(Ivan.getAge(), AGE_IVAN);
            assertEquals(Petr.getName(), NAME_2);
            assertEquals(Petr.getSurname(), SURNAME_2);
            assertEquals(Petr.getAge(), AGE_PETR);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
