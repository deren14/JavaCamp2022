public class StudentManager {
    public void add(Student student) {
        ScoreValidator validator = new ScoreValidator();
        if (validator.isvalid(student)) {
            System.out.println("Student has been added to Succes List.");
        } else {
            System.out.println("Student cannot be added to Succes List");
        }
    }
}
