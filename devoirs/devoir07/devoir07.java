package devoir07;

public class devoir07 {
public static final int TAILLE_TABLEAU = 10; 
public static final int MIN_NOMBRE = -8;
public static final int MAX_NOMBRE = 8;
public static final int VALEUR_RECHERCHEE = 7;


public static void main(String[] args) {
    public static int[] genereTableau(int min, int max, int taille) {
        int[] tab = new int[taille];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * (max - min + 1)) + min;
}


int[] monTableauExemple = genereTableau(max=8,min=-8);
System.out.println(VALEUR_RECHERCHEE(monTableauExemple));
}
}
