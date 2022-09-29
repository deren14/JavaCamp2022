public class Calculator {
    public int addition(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;

        }
        return total;
    }

    public int extraction(int number1, int number2) {
        return (number1 - number2);

    }
    public int multiple(int...numbers){
        int total = 1;
        for (int number:numbers){
            total*=number;
        }return total;
    }
    public int division(int number1,int number2){
        return number1/number2;
    }
}