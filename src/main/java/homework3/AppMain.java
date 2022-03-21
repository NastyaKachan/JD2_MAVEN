package homework3;

public class AppMain {
    public static void main(String[] args) {
        final String s = "Студент ";

        Student Petr = new Student("Petr", Types.Type_1);
        System.out.println(s + Petr.getName());
        System.out.println(Petr.getStudentType().getTimeStudy(Petr));

        Student Andrey = new Student("Andrey", Types.Type_1);
        System.out.println(s + Andrey.getName());
        System.out.println(Andrey.getStudentType().getTimeStudy(Andrey));

        Student Anna = new Student("Anna", Types.Type_1);
        System.out.println(s + Anna.getName());
        System.out.println(Anna.getStudentType().getTimeStudy(Anna));

        Student Ivan = new Student("Ivan", Types.Type_2);
        System.out.println(s + Ivan.getName());
        System.out.println(Ivan.getStudentType().getTimeStudy(Ivan));

        Student Artem = new Student("Artem", Types.Type_2);
        System.out.println(s + Artem.getName());
        System.out.println(Artem.getStudentType().getTimeStudy(Artem));

        Student Olga = new Student("Olga", Types.Type_2);
        System.out.println(s + Olga.getName());
        System.out.println(Olga.getStudentType().getTimeStudy(Olga));

        Student Sergey = new Student("Sergey", Types.Type_3);
        System.out.println(s + Sergey.getName());
        System.out.println(Sergey.getStudentType().getTimeStudy(Sergey));

        Student Darya = new Student("Darya", Types.Type_3);
        System.out.println(s + Darya.getName());
        System.out.println(Darya.getStudentType().getTimeStudy(Darya));

        Student Kirill = new Student("Kirill", Types.Type_3);
        System.out.println(s + Kirill.getName());
        System.out.println(Kirill.getStudentType().getTimeStudy(Kirill));

    }
}
