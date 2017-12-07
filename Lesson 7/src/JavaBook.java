public class JavaBook {

    public static void main(String[] arg) {

        int tRSF = 0;
        double learned = 0;
        double learning = 0;

        while (learned < 0.95){
            tRSF = tRSF + 1;
            learning = 0.10 * (1 - learned);
            learned = learning + learned;
        }
        int years = tRSF / 12;
        int months = tRSF - (12 * years);
        System.out.println("It would take Kevin " + (years) + " years and " + (months) + " months to learn Java.");
    }

}
