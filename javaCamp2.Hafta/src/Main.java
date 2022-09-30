public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Sally";
        person1.eyeColor ="Brown";
        person1.hairColor="Black";
        person1.height = 165;
        person1.weight = 52;

        FamilyCreator familyCreator = new FamilyCreator();
        familyCreator.add(person1);


    }
}