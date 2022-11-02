public class Banana extends Fruit{

    public Banana(int weight, int sugarContent, int waterContent, boolean seed, boolean peel) {
        super(weight, sugarContent, waterContent, seed, peel);
        this.peel=true;
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

