public class devoir04 {
    public static void main(String[] args) {
        int year = 2024;
        int month = 10;
        int day = 8;

        if (year < 0 || year > 9999) {
            System.out.println("L'année [" + year + "] est hors limites !");
            return;
        }

        if (month < 1 || month > 12) {
            System.out.println("Le mois [" + month + "] est hors limites !");
            return;
        }
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                && (day < 1 || day > 31)) {
            System.out.println("Le jour [" + day + "] est hors limites !");
            return;
        }

        if ((month == 4 || month == 6 || month == 9 || month == 11) && (day < 1 || day > 30)) {
            System.out.println("Le jour [" + day + "] est hors limites !");
            return;
        }

        if (month == 2) {
            // Vérifier si c'est une année bissextile
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                if (day < 1 || day > 29) {
                    System.out.println("Le jour [" + day + "] est hors limites !");
                    return;
                }
            } else {
                if (day < 1 || day > 28) {
                    System.out.println("Le jour [" + day + "] est hors limites !");
                    return;
                }
            }
        }

        // Afficher la date avec le mois en texte
        String moisTexte = "";
        switch (month) {
            case 1:
                moisTexte = "janvier";
                break;
            case 2:
                moisTexte = "février";
                break;
            case 3:
                moisTexte = "mars";
                break;
            case 4:
                moisTexte = "avril";
                break;
            case 5:
                moisTexte = "mai";
                break;
            case 6:
                moisTexte = "juin";
                break;
            case 7:
                moisTexte = "juillet";
                break;
            case 8:
                moisTexte = "août";
                break;
            case 9:
                moisTexte = "septembre";
                break;
            case 10:
                moisTexte = "octobre";
                break;
            case 11:
                moisTexte = "novembre";
                break;
            case 12:
                moisTexte = "décembre";
                break;
        }

        // Afficher la date si elle est valide
        System.out.println("La date formatée est le " + day + " " + moisTexte + " " + year);
    }
}
