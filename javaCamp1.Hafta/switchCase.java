public class switchCase {
    public static void main(String[] args) {
        char grade = 'D';

        switch (grade) {
            case 'A' -> System.out.println("Perfect. You passed.");
            case 'B' -> System.out.println("Very well. You passed.");
            case 'C' -> System.out.println("Well, You passed.");
            case 'D' -> System.out.println("Not bad, you passed.");
            case 'F' -> System.out.println("unfortunately, you passed.");
            default -> System.out.println("Value Error.");
            }
        }
}