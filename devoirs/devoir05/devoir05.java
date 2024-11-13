import java.util.Scanner;

public class devoir05 {
    public static void main(String[] args) {
        // Générer un nombre aléatoire entre 1 et 100
        int nombreSecret = (int) (Math.random() * 100) + 1;

        // Créer un scanner pour lire les entrées
        Scanner scanner = new Scanner(System.in);
        int tentative = 0;
        boolean trouve = false;

        // Boucle jusqu'à ce que le nombre soit trouvé
        while (!trouve) {
            // Demander d'entrer une valeur
            System.out.print("Entrez un nombre entre 1 et 100 : ");
            tentative = scanner.nextInt();

            // Comparer la tentative avec le nombre secret
            if (tentative < nombreSecret) {
                System.out.println("Trop petit");
            } else if (tentative > nombreSecret) {
                System.out.println("Trop grand");
            } else {
                // RIF: C'est juste! il manque seulement le décompte du nombre de tentatives
                System.out.println("Bravo, trouvé !");
                trouve = true;
            }
        }

        // Fermer le scanner
        scanner.close();
    }
}
