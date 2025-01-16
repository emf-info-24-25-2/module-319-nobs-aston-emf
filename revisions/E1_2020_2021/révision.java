import java.util.Random;

public class révision {
    
    // Constantes
    public static final int LIBRE = 0;
    public static final int OCCUPEE = 1; 
    public static final int TOUCHEE = 2;
    
    public static final int TAILLE_GRILLE = 20;
    public static final int NBRE_BATEAUX = 5;
    
    public static void main(String[] args) {
        // Appel de la méthode choisirIndexAleatoire avec des valeurs min et max
        int min = 5;
        int max = 15;
        int indexAleatoire = choisirIndexAleatoire(min, max);
        System.out.println("Index aléatoire entre " + min + " et " + (max - 1) + " : " + indexAleatoire);
        
        // Appel de la méthode pour générer la grille
        int[][] grille = genererGrille(TAILLE_GRILLE, NBRE_BATEAUX);
        
        // Affichage de la grille générée
        afficherGrille(grille);
    }

    // Méthode qui choisit un index aléatoire entre min et max (min inclus, max exclus)
    public static int choisirIndexAleatoire(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }
        // Méthode qui génère une grille avec des bateaux placés aléatoirement
        public static int[][] genererGrille(int taille, int nbBateaux) {
            // Créer une grille vide de la taille spécifiée
            int[][] grille = new int[taille][taille];

                    // Créer un objet Random pour générer des nombres aléatoires
        Random rand = new Random();
        
        // Placer les bateaux dans la grille
        int bateauxPlaces = 0;
        
        while (bateauxPlaces < nbBateaux) {
            // Générer des indices aléatoires pour la position du bateau
            int x = rand.nextInt(taille);  // Indice aléatoire pour la ligne
            int y = rand.nextInt(taille);  // Indice aléatoire pour la colonne
            
            // Vérifier si un bateau est déjà placé à cette position
            if (grille[x][y] == 0) {  // Si la case est vide
                grille[x][y] = OCCUPEE;  // Placer un bateau
                bateauxPlaces++;  // Incrémenter le nombre de bateaux placés
            }
        }
        
        // Retourner la grille générée
        return grille;
    }
    
    // Méthode pour afficher la grille
    public static void afficherGrille(int[][] grille) {
        for (int i = 0; i < grille.length; i++) {
            for (int j = 0; j < grille[i].length; j++) {
                System.out.print(grille[i][j] + " ");  // Afficher chaque case de la grille
            }
            System.out.println();  // Nouvelle ligne pour la grille
        }
    
    }

}