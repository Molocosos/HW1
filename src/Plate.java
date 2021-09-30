public class Plate {
    private int food;
    private int volume;


    Plate(int food, int volume) {
        this.food = food;
        this.volume = volume;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void add(int food) {
        if (this.food + food <= volume) {
            this.food += food;
        }
    }

    @Override
    public String toString() {
        return "plate: " + food;
    }
}
