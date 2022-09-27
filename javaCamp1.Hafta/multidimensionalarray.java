public class multidimensionalarray {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];

        cities[0][0] = "London";
        cities[0][1] = "Ibiza";
        cities[0][2] = "Istanbul";
        cities[1][0] = "Kars";
        cities[1][1] = "Ankara";
        cities[1][2] = "Samsun";
        cities[2][0] = "Ağrı";
        cities[2][1] = "Lizbon";
        cities[2][2] = "California";


        for(int i = 0; i <= 2; i++){
            System.out.println("--------------------------");
            for(int j = 0; j <= 2; j++){
                System.out.println(cities[i][j]);
            }
        }
    }
}