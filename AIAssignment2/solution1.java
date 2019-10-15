package assignment;
public class solution1 {

public static void main (String[] args) {
    final int epochs = 1000;
    dataStore data = new dataStore();
    double[][] storeValues = data.solution1Data();
    final int epochs = 1000;
    double w0 = 0;
    double w1 = 0;
    double w2 = 0;
    double alpha = 0.0001;

    for (int i = 0; i < storeValues.length; i++) {
        System.out.println("X " + storeValues[i][0]);
        System.out.println("Y " + storeValues[i][1]);
    }
    /*
    for (int i = 0; i < epochs; i++) {
        double cost = 0;

        for (int j = 0; j < storeValues.length; j++) {
            double xj = storeValues[j][0];
            double yj = storeValues[j][1];

            double prediction = w0 + (w1 * xj) + (w2 *(xj * xj));

        }
    }
    */

}
}
