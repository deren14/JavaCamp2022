public class Main {
    public static void main(String[] args) {
        CustomerManager database = new CustomerManager();
        database.baseManager = new Oracle();
        database.getCustomer();
    }
}