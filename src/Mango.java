public class Mango extends Fruit{
    public Mango(int weight, int sugarContent, int waterContent, boolean seed, boolean peel) {
        super(weight, sugarContent, waterContent, seed, peel);
        this.peel=true;
        this.seed=true;
    }
    public boolean hasSeed() {
        return this.seed;
    }
    public void removeSeed() {
        if(hasSeed())
            this.seed=false;

    }
    public boolean hasPeel() {
        return this.peel;
    }
    public void peelOff() {
        if(hasPeel())
            this.peel=false;
    }
}
