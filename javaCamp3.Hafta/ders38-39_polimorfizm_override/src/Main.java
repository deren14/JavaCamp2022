public class Main {
    public static void main(String[] args) {
        SalaryRaising[] salaryRaising = new SalaryRaising[]{new InternSalary(),new JuniorSalary(),new SeniorSalary()};
        for (SalaryRaising salary:salaryRaising){
                System.out.println(salary.Calculate(600));

        }

    }
}