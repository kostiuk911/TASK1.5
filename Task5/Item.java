public class Item {
    private int id;
    private double length;
    private double width;
    private double weight;
    private String description;

    public Item(int id, double length, double width, double weight, String description) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }
}
