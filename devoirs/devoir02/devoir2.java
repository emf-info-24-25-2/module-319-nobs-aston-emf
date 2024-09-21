public class Devoir02 {

    public static void main(String[] args) {
        
        int CAPACITE_RESERVOIR_A = 3;
        int CAPACITE_RESERVOIR_B = 5;

        
        int reservoirA = 0;
        int reservoirB = 0;
        int remplissage;

       
        Random random = new Random();
        remplissage = random.nextInt(CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B + 1); 

        
        System.out.println("Il y a " + remplissage + " litres à remplir.");

        
        while (reservoirA + reservoirB < remplissage) {
            if (reservoirA < CAPACITE_RESERVOIR_A) {
                reservoirA++;
                System.out.println("Remplissage du réservoir A...");
            } else if (reservoirB < CAPACITE_RESERVOIR_B) {
                reservoirB++;
                System.out.println("Remplissage du réservoir B...");
            }

           
            System.out.println("Le réservoir A : " + reservoirA + ", le réservoir B : " + reservoirB);
        }

    
        System.out.println("Remplissage terminé!");
    }
}
//majoritairement fais avec chatgpt a cause de mon problem ci dessou
//lorsque je code j'ai les sujestion (ex: main, public, sout) mais lorsque j'entre celle-ci la suite ne s'écrit pas et je ne peux pas debug