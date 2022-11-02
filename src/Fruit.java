import java.util.Scanner;

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
    public static Fruit[] readFruit(int n)
    {
        Fruit[] f= new Fruit[n];

        for(int i=0; i<n;i++){
            System.out.println("Enter what fruit you want");
            Scanner fruit = new Scanner(System.in);
            if(fruit.equals("Apple")){
                System.out.println("Enter weight");
                Scanner weight = new Scanner(System.in);
                String name=weight.next();
                int w = Integer.valueOf(name);

                System.out.println("Enter sugarContent");
                Scanner sugarContent = new Scanner(System.in);
                String name0=sugarContent.next();
                int sc = Integer.valueOf(name0);

                System.out.println("Enter waterContent");
                Scanner waterContent = new Scanner(System.in);
                String name1=waterContent.next();
                int wc = Integer.valueOf(name1);
                f[i]= new Apple(w,sc,wc,true,true);
            }
            if(fruit.equals("Banana")){
                System.out.println("Enter weight");
                Scanner weight = new Scanner(System.in);
                String name=weight.next();
                int w = Integer.valueOf(name);

                System.out.println("Enter sugarContent");
                Scanner sugarContent = new Scanner(System.in);
                String name0=sugarContent.next();
                int sc = Integer.valueOf(name0);

                System.out.println("Enter waterContent");
                Scanner waterContent = new Scanner(System.in);
                String name1=waterContent.next();
                int wc = Integer.valueOf(name1);
                f[i]= new Banana(w,sc,wc,false,true);
            }
            if(fruit.equals("Mango")){
                System.out.println("Enter weight");
                Scanner weight = new Scanner(System.in);
                String name=weight.next();
                int w = Integer.valueOf(name);

                System.out.println("Enter sugarContent");
                Scanner sugarContent = new Scanner(System.in);
                String name0=sugarContent.next();
                int sc = Integer.valueOf(name0);

                System.out.println("Enter waterContent");
                Scanner waterContent = new Scanner(System.in);
                String name1=waterContent.next();
                int wc = Integer.valueOf(name1);
                f[i]= new Mango(w,sc,wc,false,true);
            }
        }
        return f;
    }
    public void computeWeight(Fruit[] fruits){
        int weight=0;
        for(int i=0;i<fruits.length;i++){
            weight=weight+fruits[i].weight;
        }
        System.out.println(weight);
    }
    public void computeSugarContent(Fruit[] fruits){
        int sugarContent=0;
        for(int i=0;i<fruits.length;i++){
            sugarContent=sugarContent+fruits[i].sugarContent;
        }
        System.out.println(sugarContent);
    }
    public void prepareFruit(Fruit[] fruits){
        for(int i=0;i<fruits.length;i++){
        }
    }
}


