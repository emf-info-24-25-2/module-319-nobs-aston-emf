public class teste {
    public class ExempleTableau {
        public static void main(String[] args) {
            // Déclaration et création
            int[] nombres = new int[4];
            
            // Remplissage du tableau
            nombres[0] = 10;
            nombres[1] = 20;
            nombres[2] = 30;
            nombres[3] = 40;
    
            // Afficher les valeurs du tableau
            for (int i = 0; i < nombres.length; i++) {
                System.out.println("nombres[" + i + "] = " + nombres[i]);
            }
    
            // Afficher la taille du tableau
            System.out.println("Taille du tableau : " + nombres.length);
        }
    }
    
}
