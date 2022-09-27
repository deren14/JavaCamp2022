public class vowels {
    public static void main(String[] args) {
        char harf = 'A';

        switch(harf){
            case 'o':
            case 'u':
            case 'a':
            case 'ı':
            case 'A' :
            case 'I' :
            case 'U' :
            case 'O' :
                System.out.println("Kalın Harf...");
                break;
            case 'E' :
            case 'İ' :
            case 'Ü' :
            case 'Ö' :
                System.out.println("İnce Harf...");
                break;
            default:
                System.out.println("Geçersiz harf...");
        }
    }
    }
