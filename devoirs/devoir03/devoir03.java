public class devoir03 {
    public static void main(String[] args) {
            
        int jour;
        int mois;
        int annee;
        int fevrier;   
        
        switch (mois)   {
                 case 1:
                    System.out.println("le" + jour + "/" + mois + "/" + annee +  " est le jour " + jour + " de l'An");
                    break;
            case 2:
                System.out
                        .println("le" + jour + "/" + mois + "/" annee + " est le jour " + (jour + 31) + " de l'An");
            break;
            case 3:
            System.out.println( "le" + jour + "/" + mois + "/" + annee + " est le jour" + (jour + fevrier +31) + " de l'An");
            break;
            case 4:
            System.out.println("le " + jour + "/" + mois + "/" + annee + "est le jour"
                    + (jour + fevrier + (31 * 2)) + " de l'An"); 
            break;
            case 5:
            System.out.println("le "+ jour + "/" + mois + "/" + annee + " est le jour "
                    + (jour + fevrier + (31*2)+30) + "de l'An");
            break;
            case 6:
            System.out.println("le" + jour + "/" + mois + "/" + annee + " est le jour "
            + (jour + fevrier + (31 * 3) + 30) + "de 1'An");
            break;
            case 7:
            System.out.println("le" + jour + "/" + mois + "/" + annee + "est le jour"
            + (jour + fevrier + (31 * 3) + (30*2)) + " de l'An");
            break;
            case 8:
            System.out.println("le " + jour + "/" + mois + "/" + annee + " est le jour " 
            + (jour + fevrier + (31 * 4) + (30*2))+ " de l'An");
            break;
            case 9 :
            System.out.println("le" + jour + "/" + mois + "/" + annee + "est le jour "
            + (jour + fevrier + (31 * 5) + (30*2)) + "de l'An");
            break;
            case 10:
            System.out.println("le " + jour + "/" + mois + "/" + annee + " est le jour"
            + (jour + fevrier + (31 * 5) + (30 * 3)) + "de 1'An");
            break;
            case 11:
            System.out.println("le" + jour + "/" + mois + "/" + annee + "est le jour"
            + (jour + fevrier + (315) + (304)) + " de l'An");
            break;
            default:
            System.out.println("le " + jour + "/" + mois + "/" + annee + "est le jour"
            + (jour + fevrier + (316) + (30*4)) + " de l'An");
            break;
    }
    }
}
