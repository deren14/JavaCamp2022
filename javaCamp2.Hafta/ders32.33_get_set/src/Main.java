public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.set_name("Sally");
        person1.set_eyeColor("Brown");
        person1.set_hairColor("Black");
        person1.set_height(165);
        person1.set_weight(52);

        FamilyCreator familyCreator = new FamilyCreator();
        familyCreator.add(person1);

        System.out.println(person1.get_name() + " has got " + person1.get_eyeColor() + " eyes");


    }
}