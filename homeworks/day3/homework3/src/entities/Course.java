package entities;

public class Course extends Entity{
    private int educatorId;
    private String name;
    private double price;

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getEducatorId() {
        return educatorId;
    }
    public void setEducatorId(int educatorId) {
        this.educatorId = educatorId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
