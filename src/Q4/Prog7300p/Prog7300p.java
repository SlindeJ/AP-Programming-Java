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
        // OR neuron
        y_train = new double[]{0, 1, 1, 1};
        // fitting the model
        System.out.println("OR Neuron");
        model = new Perceptron(0.1, 15);
        model.fit(x_train, y_train);

        // Predict using the trained model
        y_pred = model.predict(x_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        // print out weights and bias
        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());

        // make neurons for OR, NOT, NAND, and NOR

        // NAND neuron
        y_train = new double[]{1, 1, 1, 0};
        // fitting the model
        System.out.println("NAND Neuron");
        model = new Perceptron(0.1, 15);
        model.fit(x_train, y_train);

        // Predict using the trained model
        y_pred = model.predict(x_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        // print out weights and bias
        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());

        // NOR neuron
        y_train = new double[]{1, 0, 0, 0};
        // fitting the model
        System.out.println("NOR Neuron");
        model = new Perceptron(0.1, 15);
        model.fit(x_train, y_train);

        // Predict using the trained model
        y_pred = model.predict(x_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        // print out weights and bias
        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());


        // NOT dataset
        x_train = new double[][]{
                {0}, {1}
        };
        y_train = new double[]{1, 0};
        // fitting the model
        System.out.println("NOT Neuron");
        model = new Perceptron(0.1, 15);
        model.fit(x_train, y_train);

        // Predict using the trained model
        y_pred = model.predict(x_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        // print out weights and bias
        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());
    }
}
/*
AND Neuron
Epoch 1: Loss: 0.25
Epoch 1: Loss: 0.25
Epoch 1: Loss: 0.25
Epoch 1: Loss: 0.25
Epoch 2: Loss: 0.25
Epoch 2: Loss: 0.25
Epoch 2: Loss: 0.0
Epoch 2: Loss: 0.25
Epoch 3: Loss: 0.25
Epoch 3: Loss: 0.25
Epoch 3: Loss: 0.0
Epoch 3: Loss: 0.25
Epoch 4: Loss: 0.25
Epoch 4: Loss: 0.25
Epoch 4: Loss: 0.0
Epoch 4: Loss: 0.25
Epoch 5: Loss: 0.25
Epoch 5: Loss: 0.0
Epoch 5: Loss: 0.0
Epoch 5: Loss: 0.25
Epoch 6: Loss: 0.25
Epoch 6: Loss: 0.0
Epoch 6: Loss: 0.0
Epoch 6: Loss: 0.0
Epoch 7: Loss: 0.0
Epoch 7: Loss: 0.0
Epoch 7: Loss: 0.0
Epoch 7: Loss: 0.0
Epoch 8: Loss: 0.0
Epoch 8: Loss: 0.0
Epoch 8: Loss: 0.0
Epoch 8: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 15: Loss: 0.0
Epoch 15: Loss: 0.0
Epoch 15: Loss: 0.0
Epoch 15: Loss: 0.0
Predicted: [0.0, 0.0, 0.0, 1.0]
Actual: [0.0, 0.0, 0.0, 1.0]
Weights: [0.0151381331875797, 0.19111494011540978]
Bias: -0.19999999999999987
OR Neuron
Epoch 1: Loss: 0.25
Epoch 1: Loss: 0.0
Epoch 1: Loss: 0.0
Epoch 1: Loss: 0.0
Epoch 2: Loss: 0.25
Epoch 2: Loss: 0.0
Epoch 2: Loss: 0.0
Epoch 2: Loss: 0.0
Epoch 3: Loss: 0.25
Epoch 3: Loss: 0.0
Epoch 3: Loss: 0.0
Epoch 3: Loss: 0.0
Epoch 4: Loss: 0.25
Epoch 4: Loss: 0.0
Epoch 4: Loss: 0.0
Epoch 4: Loss: 0.0
Epoch 5: Loss: 0.25
Epoch 5: Loss: 0.0
Epoch 5: Loss: 0.25
Epoch 5: Loss: 0.0
Epoch 6: Loss: 0.25
Epoch 6: Loss: 0.0
Epoch 6: Loss: 0.0
Epoch 6: Loss: 0.0
Epoch 7: Loss: 0.25
Epoch 7: Loss: 0.0
Epoch 7: Loss: 0.25
Epoch 7: Loss: 0.0
Epoch 8: Loss: 0.25
Epoch 8: Loss: 0.0
Epoch 8: Loss: 0.25
Epoch 8: Loss: 0.0
Epoch 9: Loss: 0.25
Epoch 9: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 15: Loss: 0.0
Epoch 15: Loss: 0.0
Epoch 15: Loss: 0.0
Epoch 15: Loss: 0.0
Predicted: [0.0, 1.0, 1.0, 1.0]
Actual: [0.0, 1.0, 1.0, 1.0]
Weights: [0.24499462817571502, 0.3284113565640914]
Bias: -0.19999999999999987
NAND Neuron
Epoch 1: Loss: 0.0
Epoch 1: Loss: 0.0
Epoch 1: Loss: 0.0
Epoch 1: Loss: 0.25
Epoch 2: Loss: 0.0
Epoch 2: Loss: 0.0
Epoch 2: Loss: 0.0
Epoch 2: Loss: 0.25
Epoch 3: Loss: 0.0
Epoch 3: Loss: 0.0
Epoch 3: Loss: 0.0
Epoch 3: Loss: 0.25
Epoch 4: Loss: 0.0
Epoch 4: Loss: 0.0
Epoch 4: Loss: 0.0
Epoch 4: Loss: 0.25
Epoch 5: Loss: 0.0
Epoch 5: Loss: 0.0
Epoch 5: Loss: 0.0
Epoch 5: Loss: 0.25
Epoch 6: Loss: 0.0
Epoch 6: Loss: 0.25
Epoch 6: Loss: 0.25
Epoch 6: Loss: 0.25
Epoch 7: Loss: 0.0
Epoch 7: Loss: 0.0
Epoch 7: Loss: 0.25
Epoch 7: Loss: 0.25
Epoch 8: Loss: 0.0
Epoch 8: Loss: 0.25
Epoch 8: Loss: 0.0
Epoch 8: Loss: 0.25
Epoch 9: Loss: 0.0
Epoch 9: Loss: 0.25
Epoch 9: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 15: Loss: 0.0
Epoch 15: Loss: 0.0
Epoch 15: Loss: 0.0
Epoch 15: Loss: 0.0
Predicted: [1.0, 1.0, 1.0, 0.0]
Actual: [1.0, 1.0, 1.0, 0.0]
Weights: [-0.31684247312994335, -0.15634413041754383]
Bias: 0.40000000000000013
NOR Neuron
Epoch 1: Loss: 0.0
Epoch 1: Loss: 0.25
Epoch 1: Loss: 0.25
Epoch 1: Loss: 0.25
Epoch 2: Loss: 0.0
Epoch 2: Loss: 0.25
Epoch 2: Loss: 0.25
Epoch 2: Loss: 0.0
Epoch 3: Loss: 0.0
Epoch 3: Loss: 0.25
Epoch 3: Loss: 0.0
Epoch 3: Loss: 0.0
Epoch 4: Loss: 0.25
Epoch 4: Loss: 0.25
Epoch 4: Loss: 0.0
Epoch 4: Loss: 0.0
Epoch 5: Loss: 0.25
Epoch 5: Loss: 0.0
Epoch 5: Loss: 0.0
Epoch 5: Loss: 0.0
Epoch 6: Loss: 0.0
Epoch 6: Loss: 0.0
Epoch 6: Loss: 0.0
Epoch 6: Loss: 0.0
Epoch 7: Loss: 0.0
Epoch 7: Loss: 0.0
Epoch 7: Loss: 0.0
Epoch 7: Loss: 0.0
Epoch 8: Loss: 0.0
Epoch 8: Loss: 0.0
Epoch 8: Loss: 0.0
Epoch 8: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 15: Loss: 0.0
Epoch 15: Loss: 0.0
Epoch 15: Loss: 0.0
Epoch 15: Loss: 0.0
Predicted: [1.0, 0.0, 0.0, 0.0]
Actual: [1.0, 0.0, 0.0, 0.0]
Weights: [-0.18492505435708748, -0.03856788204253189]
Bias: 1.3877787807814457E-16                            (smallest bias ever)
NOT Neuron
Epoch 1: Loss: 0.0
Epoch 1: Loss: 0.5
Epoch 2: Loss: 0.0
Epoch 2: Loss: 0.5
Epoch 3: Loss: 0.0
Epoch 3: Loss: 0.5
Epoch 4: Loss: 0.0
Epoch 4: Loss: 0.5
Epoch 5: Loss: 0.0
Epoch 5: Loss: 0.0
Epoch 6: Loss: 0.0
Epoch 6: Loss: 0.0
Epoch 7: Loss: 0.0
Epoch 7: Loss: 0.0
Epoch 8: Loss: 0.0
Epoch 8: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 15: Loss: 0.0
Epoch 15: Loss: 0.0
Predicted: [1.0, 0.0]
Actual: [1.0, 0.0]
Weights: [-0.634079015991035]
Bias: 0.6000000000000001

Process finished with exit code 0
 */