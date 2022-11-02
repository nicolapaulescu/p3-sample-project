public class Apple extends Fruit{
    public Apple(int weight, int sugarContent, int waterContent, boolean seed, boolean peel) {
        super(weight, sugarContent, waterContent, seed, peel);
        this.peel=false;
        this.seed=true;
    }
    public boolean hasSeed() {
        return this.seed;
    }


    public void removeSeed() {
        if(hasSeed())
            this.seed=false;

    }
}
