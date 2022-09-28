public class VariableArgument {
    public static void main(String[] args) {
        int numbers = multiple(1,3,6,7);
        System.out.println("Multiple of numbers is "+numbers);
    }
    public static int multiple(int... nums){
        int total=1;
        for (int num:nums){
            total *= num;
        }return total;

    }
}