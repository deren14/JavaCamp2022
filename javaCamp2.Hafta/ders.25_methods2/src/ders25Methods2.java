public class ders25Methods2 {
    public static void main(String[] args) {
        int addition = addition(6,12);
        String message = message("Girilen iki sayının toplamı: ");
        System.out.println(message+addition);


}    public static int addition(int num1,int num2){
        return num1+num2;
    }public static String message(String text){
        return text;
    }
}