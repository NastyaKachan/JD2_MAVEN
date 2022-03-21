package homework3;

import lombok.Getter;
import lombok.Setter;

/**
 * делают разбор, практическую часть, находятся в потоке
 */
@Getter
@Setter
public class FirstStudentType implements StudentType {

    private double allSkillTime;
    private double skillTime;
    public static final int COUNT_TYPE_ACTIVITIES = 3;

    @Override
    public String getTimeStudy(Student student) {
        allSkillTime = Math.round(Skills.SKILL_JAVA_CORE / student.getTalent() * 10) / 10.0;
        skillTime = Math.round(allSkillTime / COUNT_TYPE_ACTIVITIES * 10) / 10.0;
        String outStr = "\t" + "1 типа с талантом " + student.getTalent() + " затратил на освоение навыка " + allSkillTime + " ч, в т.ч.:" + "\n"
                + "\t\t" + "на разбор - " + skillTime + " ч, " + "на практику - " + skillTime + " ч, " + "на нахождение в потоке - " + skillTime + " ч";
        return outStr;

    }

}
