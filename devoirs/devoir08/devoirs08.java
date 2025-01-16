package devoirs.devoir08;

public class GenerateurMotDePasse {

    public static final String[] CARACTERES = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

    public static final int NBR_ESSAI = 5;
    public static final int TAILLE_MOT_DE_PASSE = 15;

    public static String genereMotDePasse(int taille) {
        String resultat = "";
        Random rand = new Random();

        while (resultat.length() < taille) {
            int index = rand.nextInt(CARACTERES.length);
            resultat += CARACTERES[index];
        }

        return resultat;
    }

    public static void main(String[] args) {
        for (int i = 0; i < NBR_ESSAI; i++) {
            String motDePasse = genereMotDePasse(TAILLE_MOT_DE_PASSE);
            System.out.println(motDePasse);
        }
    }
}