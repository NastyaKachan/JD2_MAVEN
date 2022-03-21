package homework3;

import lombok.Getter;
import lombok.Setter;

/**
 * делают практическую часть, разбор
 */
@Getter
@Setter
public class SecondStudentType implements StudentType {

    private double allSkillTime;
    private double skillTime;
    public static final int COUNT_TYPE_ACTIVITIES = 2;

    @Override
    public String getTimeStudy(Student student) {
        allSkillTime = Math.round(Skills.SKILL_JAVA_CORE / student.getTalent() * 10) / 10.0;
        skillTime = Math.round(allSkillTime / COUNT_TYPE_ACTIVITIES * 10) / 10.0;
        String outStr = "\t" + "2 типа с талантом " + student.getTalent() + " затратил на освоение навыка " + allSkillTime + "ч, в т.ч.:" + "\n"
                + "\t\t" + "на разбор - " + skillTime + " ч, " + "на практику - " + skillTime + " ч";
        return outStr;
    }

}
