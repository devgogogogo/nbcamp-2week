package challenge_task;

public class MenuItem {
    private String name;
    private Integer price;
    private String description;

    public MenuItem(String name, Integer price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
