package homework3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

    @Test
    public void createType1() {
        Student first = new Student("first", Types.Type_1);
        first.setTalent(0.9);
        String actualOutput = "Студент " + first.getName() + "\n" + first.getStudentType().getTimeStudy(first);
        String expectedOutput = "Студент " + first.getName() + "\n"
                + "\t" + "1 типа с талантом 0.9 затратил на освоение навыка 220.0 ч, в т.ч.:" + "\n"
                + "\t\t" + "на разбор - 73.3 ч, на практику - 73.3 ч, на нахождение в потоке - 73.3 ч";
        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void createType2() {
        Student second = new Student("second", Types.Type_2);
        second.setTalent(0.7);
        String actualOutput2 = "Студент " + second.getName() + "\n" + second.getStudentType().getTimeStudy(second);

        String expectedOutput2 = "Студент " + second.getName() + "\n"
                + "\t" + "2 типа с талантом 0.7 затратил на освоение навыка 282.9ч, в т.ч.:" + "\n"
                + "\t\t" + "на разбор - 141.5 ч, на практику - 141.5 ч";

        Assert.assertEquals(expectedOutput2, actualOutput2);
    }

    @Test
    public void createType3() {
        Student third = new Student("third", Types.Type_3);
        third.setTalent(0.3);
        String output3 = "Студент " + third.getName() + "\n" + third.getStudentType().getTimeStudy(third);

        String expectedOutput3 = "Студент " + third.getName() + "\n"
                + "\t" + "3 типа с талантом 0.3 затратил на освоение навыка 660.0ч, в т.ч.:" + "\n"
                + "\t\t" + "на практику - 660.0 ч";

        Assert.assertEquals(expectedOutput3, output3);
    }
}
