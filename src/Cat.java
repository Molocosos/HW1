public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    void setSatiety(boolean status) {
        satiety = status;
    }


    void eat(Plate plate) {
        if (!satiety) {
            satiety = plate.decreaseFood(appetite);

        }
    }

    @Override
    public String toString() {
        return "{name=" + name + ", appetite=" + appetite + ", satiety=" + satiety + "}";
    }
}
