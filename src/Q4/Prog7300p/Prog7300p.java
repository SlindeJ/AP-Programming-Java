package Q4.Prog7300p;

import java.util.*;

public class Prog7300p {
    public static void main(String[] args) {
        // AND NEURON
        double[][] x_train = {
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        double[] y_train = {0, 0, 0, 1};
        // fitting the model
        System.out.println("AND Neuron");
        var model = new Perceptron(0.1, 15);
        model.fit(x_train, y_train);

        // Predict using the trained model
        double[] y_pred = model.predict(x_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        // print out weights and bias
        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());

        // make neurons for OR, NOT, NAND, and NOR

        // NOT dataset
        x_train = new double[][]{
                {0}, {1}
        };
        y_train = new double[]{1, 0};
    }
}

