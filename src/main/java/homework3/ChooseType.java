package homework3;

public class ChooseType {

    public static StudentType getType(Types types){
        return switch (types) {
            case Type_1 -> new FirstStudentType();
            case Type_2 -> new SecondStudentType();
            case Type_3 -> new ThirdStudentType();
        };
    }
}
