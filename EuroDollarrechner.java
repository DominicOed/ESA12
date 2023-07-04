package school;

public class EuroDollarrechner {

    private static final double KURS = 1.09;

    public double nachEuro(double wert) {
    	
    	if (wert < 0) {
             throw new IllegalArgumentException("Der Wert darf nicht negativ sein.");
         }
         return wert / KURS;
     }

     public double nachUSDollar(double wert) {
         if (wert < 0) {
             throw new IllegalArgumentException("Der Wert darf nicht negativ sein.");
         }
         return wert * KURS;
     }

     public double rundeDouble(double wert, int stellen) {
         if (stellen < 0) {
             throw new IllegalArgumentException("Die Anzahl der Stellen darf nicht negativ sein.");
         }
         int faktor = (int) Math.pow(10, stellen);
         return ((double) Math.round(wert * faktor)) / faktor;
     }
}
     