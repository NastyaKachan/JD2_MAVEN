package homework3;

public class Student {
    private final String name;
    private final StudentType studentType;
    private double talent;
    Types types;

    public Student(String name, Types types) {
        this.name = name;
        this.studentType = ChooseType.getType(types);
        this.talent = TalentRandom.getRandomTalent();
    }

    public String getName() {
        return name;
    }

    public StudentType getStudentType() {
        return studentType;
    }

    public double getTalent() {
        return talent;
    }

    public void setTalent(double talent) {
        this.talent = talent;
    }
}
