package devoirs.devoir06;

public class devoir06 {
    public static final int TAILLE_TABLEAU = 20;
    public static final int VALEUR_MIN = 0;
    public static final int VALEUR_MAX = 50;
    public static final int VALEUR_RECHERCHEE = 7;

    public static void main(String[] args) {
        int[] monTableauExemple = genereTableau(3, 67, 5);
        System.out.println(rechercheMIN(monTableauExemple));
    }

    public static int[] genereTableau(int min, int max, int taille) {
        int[] tab = new int[taille];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * (max - min + 1)) + min;
        }

        return tab;
    }

    public static int rechercheMIN(int[] tableauEntiers) {

        int resultat= VALEUR_MAX;
        for (int i = 0; i < tableauEntiers.length; i++) {
            if (tableauEntiers[i] < resultat) {
                resultat = tableauEntiers[i];
            }
        }

        return resultat;
    }

}
