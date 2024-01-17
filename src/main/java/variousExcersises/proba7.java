public class proba7 {
    public static void main(String[] args) {
        int i = 43;
        Integer intAsObject = Integer.valueOf(i);//obiekt reprezentujący zmienną i
        int i2 = intAsObject.intValue();
        int d1 = 3.13;
        Double dd = d1; //autoboxing - zamiana wartości na obiekt
        double dd2 = dd; //autounboxing - wyciągnięcie wartości z obiektu
    }
}
