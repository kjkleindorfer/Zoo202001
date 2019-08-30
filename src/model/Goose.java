package model;

/**
 * @author Robert Hoehle
 */
public class Goose {

    private int age;
    private String color;
    private int weight;

    public Goose() {
        super();
    }

    public Goose(int age, String color, int weight) {
        super();
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String speak() {
        return "Honk MoFo! HONK!";
    }

}
