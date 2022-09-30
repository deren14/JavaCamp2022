public class Person {

    public Person(String name, String eyeColor, String hairColor, int height, int weight){
        System.out.println("Sistem çalıştı");
        this.name = name;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.height = height;
        this.weight = weight;

    }
    private String name;
    private String eyeColor;
    private String hairColor;
    private int height;
    private int weight;

    public String getName() {
        return name;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
