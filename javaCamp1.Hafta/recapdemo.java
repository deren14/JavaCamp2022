public class recapdemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;

        int maxNum = 10;

        if(maxNum < num1){
            maxNum = num1;
        }else{
            maxNum = num2;
        }
        System.out.println("Maximum number is "+maxNum);
    }
}