public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int addition = calculator.addition(2,5,7);
        int extraction = calculator.extraction(3,4);
        int multiple = calculator.multiple(2,5,8);
        int division = calculator.division(8,2);
        System.out.println(division);
    }
}