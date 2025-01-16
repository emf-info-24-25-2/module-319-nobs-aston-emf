import java.util.Random;

public class devoir07 {

    public static final int TAILLE_TABLEAU = 10;
    public static final int MIN_NOMBRE = -8;
    public static final int MAX_NOMBRE = 8;
    public static final int VALEUR_RECHERCHEE = 7;

    public static void main(String[] args) {
 
        int[] tableau = genererValeursAleatoires(TAILLE_TABLEAU, MIN_NOMBRE, MAX_NOMBRE);
        int position = positionValeur(tableau, VALEUR_RECHERCHEE);
        

        System.out.println("Devoir 07 du module 319");
        System.out.println("---------------------------------------");
        System.out.println("Le tableau d'entiers généré contient : " + TAILLE_TABLEAU + " valeurs");
        System.out.println("Les deux premières/dernières valeurs sont : [" + tableau[0] + "][" + tableau[1] + "] ... [" + tableau[TAILLE_TABLEAU - 2] + "][" + tableau[TAILLE_TABLEAU - 1] + "]");
        
        if (position != -1) {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " figure à la position N°" + position + " du tableau !");
        } else {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " n'a pas été trouvée dans le tableau.");
        }
        
        System.out.println("Voici le contenu du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Tableau[" + i + "] = " + tableau[i]);
        }
    }

    public static int[] genererValeursAleatoires(int taille, int min, int max) {
        int[] tableau = new int[taille];
        Random random = new Random();
        
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(max - min + 1) + min;  
        }
        
        return tableau;
    }

    public static int positionValeur(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                return i;  
            }
        }
        return -1;  
    }
}
