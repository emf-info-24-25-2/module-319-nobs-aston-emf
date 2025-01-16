import java.util.Random;

public class MonteCarloPI {
    public static void main(String[] args) {
        final int NBRE_ESSAIS = 100000;  
        Random random = new Random();
        int pointsDansLeCercle = 0; 
        for (int i = 0; i < NBRE_ESSAIS; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            
            if (x * x + y * y <= 1) {
                pointsDansLeCercle++;
            }
        }
        
        double piEstime = 4.0 * pointsDansLeCercle / NBRE_ESSAIS;
        
        System.out.println("pi =~ " + piEstime);
    }
}
