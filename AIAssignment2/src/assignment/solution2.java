package assignment;
import java.lang.Math;
public class solution2 {
    // values of alpha and the number of epochs
    private final static int epochs = 100000;
    private final static double alpha = 0.01;

    public static void main(String[] args) {
        // gets the data needed for the question
        dataStore stored = new dataStore(2);
        double[][] data = stored.dataStored;
        // intialises the w values
        double w0 = 0;
        double w1 = 0;
        double w2 = 0;
        // gets the value of m
        int m = data.length;
        // for loop to perform the alogrithm
        for (int i = 0; i < epochs; i++) {
            // initialises the cost
            double cost = 0;
            for (int j = 0; j < data.length; j++) {
                // calculates the prediction
                double prediction = w0 + (w1 * data[j][0]) + (w2 * data[j][1]);
                // calculates the maincost
                /*
                if (data[j][2] == 1) {
                    cost += (-Math.log(prediction));
                } else if (data[j][2] == 0) {
                    cost += (-Math.log(1 - (prediction)));
                }
                */
                cost += -1 * (data[j][2] * Math.log(prediction) + (1 - data[j][2]) * Math.log(1-prediction));
                // updates the values of w
                w0 += alpha *(data[j][2] - sigmoid(prediction));
                w1 += alpha *(data[j][2] - sigmoid(prediction)) * data[j][0];
                w2 += alpha *(data[j][2] - sigmoid(prediction)) * data[j][1];
            }
            // regularises the cost
            cost = cost / m;
            // prints the cost
            System.out.println("Cost " + cost);
        }
        // outputs the descision boundary
        System.out.println("x2 = -" + w1 + "x1 -" + w0 + " / "+ w2);
        // outputs the w values
        System.out.println("w0 = " + w0);
        System.out.println("w1 = " + w1);
        System.out.println("w2 = " + w2);

    }
    // method to calculate sigmoid
    public static double sigmoid(double x) {
        return 1 / (1 + Math.exp((-1) * x));
    }
}
