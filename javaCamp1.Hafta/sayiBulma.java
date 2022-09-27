public class sayiBulma {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,5,7,9,0};
        int the_num = 5;
        boolean is_in = false;

        for(int num : nums){
            if(num == the_num){
                is_in = true;
                break;
            }
        }
        if(is_in){
            System.out.println("number is inside the list.");
        }else{
            System.out.println("number is not inside the list");
    }
}}