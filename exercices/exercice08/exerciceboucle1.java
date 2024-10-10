public class exerciceboucle1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Boucle for, itération " + i);
        }
        int i = 1;

        // Boucle while
        while (i <= 5) {
            System.out.println("Boucle while, itération " + i); // Affichage
            i++; // Incrémentation
        
            i = 1;

            // Boucle do-while
            do {
                System.out.println("Boucle do-while, itération " + i);
                i++; // Incrémentation
            } while (i <= 5);
   
   
   
            for (i = 1; i <= 5; i++) {
                if (i == 3) {
                    continue;
                    
                }
                System.out.println("Boucle for, itération " + i);
        }
    }

     i = 1;

    // Boucle while
    while (i <= 5) {
        
        System.out.println("Boucle while, itération " + i); // Affichage
        if (i == 3) {
            break; // Arrêter après l'itération 3
        }
        i++; // Incrémentation


        // Boucle for
        System.out.println("Boucle for:");
        for ( i = 5; i >= 1; i--) { // On commence à 5 et on décrémente
            System.out.println(i); // Affiche i
        }
        System.out.println("Décollage !!"); // Message final

    }}}

