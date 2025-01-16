import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class devoir09 {

    // Déclaration des constantes
    public static final int NBRE_CHIFFRES = 6;  // Nombre de chiffres dans un tirage
    public static final int MIN = 0;            // Valeur minimale d'un chiffre
    public static final int MAX = 42;           // Valeur maximale d'un chiffre

    public static void main(String[] args) {
        // Générer un tirage
        int[] tirage = genereTirage(NBRE_CHIFFRES, MIN, MAX);
        
        // Afficher le tirage
        System.out.println("Tirage du loto :");
        for (int i = 0; i < tirage.length; i++) {
            System.out.println(tirage[i]);
        }
    }

    // Méthode pour générer un tirage de loto
    public static int[] genereTirage(int nbreChiffres, int min, int max) {
        Random random = new Random();
        Set<Integer> tirageSet = new HashSet<>();
        
        // Générer des chiffres uniques
        while (tirageSet.size() < nbreChiffres) {
            int chiffre = random.nextInt(max - min + 1) + min;
            tirageSet.add(chiffre);
        }
        
        // Convertir le Set en tableau
        int[] tirageArray = new int[nbreChiffres];
        int i = 0;
        for (Integer num : tirageSet) {
            tirageArray[i++] = num;
        }
        
        return tirageArray;
    }
}
