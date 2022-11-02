public abstract class Fruit {
    int weight, sugarContent, waterContent;
    Color color;
    boolean seed, peel;
    public Fruit(int weight, int sugarContent, int waterContent, boolean seed, boolean peel) {
        this.weight = weight;
        this.sugarContent = sugarContent;
        this.waterContent = waterContent;

    }
     public enum Color {
        red,
        yellow,
        purple,
        green,
        blue
    }
}
