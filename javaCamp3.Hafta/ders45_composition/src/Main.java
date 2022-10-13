public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Student student = new Student();
        student.score = 45;
        manager.add(student);

        //Static use
        ScoreValidator.isStudent();
    }
}