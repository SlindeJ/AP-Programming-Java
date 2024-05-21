package Q4.Prog7300p;
import java.util.function.Function;
import java.util.*;

public class Perceptron {
    private double learning_rate;
    private int epochs;
    private double[] weights;
    private double bias;
    private Function<Double, Double> activation;

    private Double unit_step(Double x) { return x > 0 ? 1.0 : 0.0; }    // if x > 0, return 1.0, else return 0.0

    public Perceptron(double learning_rate, int epochs) {
        this.learning_rate = learning_rate;
        this.epochs = epochs;
        bias = 1;
        activation = this::unit_step;   // this is function unit step
    }

    public double[] getWeights()    {  return weights; }
    public double getBias()         { return bias; }

    public double forward(double[] x) { // calculate the dot product
        double dot_product = bias;
        for (int i = 0; i < x.length; i++) {
            dot_product += x[i] * weights[i];
        }
    return activation.apply(dot_product);
    }

    public double[] predict(double[][] x_test) {
        double[] predictions = new double[x_test.length];
        for (int i = 0; i < x_test.length; i++) {
            predictions[i] = forward(x_test[i]);
        }
    return predictions;
    }

    public void fit(double[][] x_train, double[] y_train) {
        weights = new double[x_train[0].length];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = Math.random() - .5;
        }
        int n_samples = x_train.length;
        for (int epoch = 0; epoch < epochs; epoch++) {
            double loss = 0;
            for (int i = 0; i < n_samples; i++) {
                double y_pred = forward(x_train[i]); // find y-hat value
                double error = y_train[i] - y_pred;
                loss = Math.pow(error, 2);
                for (int j = 0; j < weights.length; j++) {
                    weights[j] += learning_rate * error * x_train[i][j];
                    bias += learning_rate * error;
                }
                System.out.println("Epoch " + (epoch+1) + ": Loss: " + (loss/n_samples));
            }
        }
    }
}
