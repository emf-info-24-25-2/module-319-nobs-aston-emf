public class ExerciceCondition4 {
    public static void main(String[] args) {

        int temperature = -2;
        if (temperature < -10) {
            System.out.println("il fait très froid");

        } else if (temperature >= -10 && temperature < 0) {
            System.out.println("il fait très froid");

        } else if (temperature >= 0 && temperature < 25) {
            System.out.println("il fait normale");

        } else if (temperature >= 25 && temperature <= 35) {
            System.out.println("il fait très froid");

        } else if (temperature > 35) {
            System.out.println("il fait très chaud");
            // &&=et
            // ||=ou
        }
    }
}