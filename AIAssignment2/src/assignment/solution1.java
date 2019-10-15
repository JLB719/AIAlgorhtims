package assignment;

public class solution1 {
    private final static int epochs = 10;
    private final static double alpha = 0.00000001;

    public static void main (String[] args) {
        // calls the data store and copies it to an array in the class
        dataStore data = new dataStore(1);
        double[][] storeValues = data.dataStored;

        // initialises the hypothesis function values
        double w0 = 0;
        double w1 = 0;
        double w2 = 0;

        // for loop to run the function multiple times
        for (int i = 0; i < epochs; i++) {
            // initialises the cost
            double cost = 0;
            // cyles through the values
            for (int j = 0; j < storeValues.length; j++) {
                // gets a set of values
                double xj = storeValues[j][0];
                double yj = storeValues[j][1];
                // calculates the prediction value
                double prediction = w0 + (w1 * xj) + (w2 *(xj * xj));

                // updates the values using the learning rate
                w2 += (alpha * (yj - prediction) * xj * xj);
                w1 += (alpha * (yj - prediction) * xj);
                w0 += (alpha * (yj - prediction));
                System.out.println("Final Equation h(x) = " + w2 + " * x^2 + "  + w1 + " * x + " + w0);
                // calculates the cost
                cost += (yj - prediction) * (yj - prediction);
            }
        // System.out.println("Final Equation h(x) = " + w2 + " * x^2 + "  + w1 + " * x + " + w0);
        // prints out the cost
        // System.out.println("Current Cost " + cost);
        }
    // prints the final line
    System.out.println("Final Equation h(x) = " + w2 + " * x^2 + "  + w1 + " * x + " + w0);

    }
}
