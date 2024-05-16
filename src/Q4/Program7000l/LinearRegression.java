package Q4.Program7000l;
import java.util.*;

public class LinearRegression {
    private double theta0;          // y-intercept
    private double theta1;          // Slope
    private double alpha;           // learning Rate
    private double tolerance;       // cost threshold
    private double[] objective;     // cost per epoch

    public LinearRegression(double thetaOne, double thetaZero, double learningRate, double tol) {
        theta0 = thetaZero;
        theta1 = thetaOne;
        alpha = learningRate;
        tolerance = tol;
    }

    public void fit(double[][] x_train, double[] y_train, int epochs) {
        int m = x_train.length;
        objective = new double[epochs];
        double[] error = new double[m];
        for (int epoch = 0; epoch < epochs; epoch++) {
            if (epoch > 0) {
                double temp0 = 0, temp1 = 0;
                // right hand side of gradient decent
                for (int i = 0; i < m; i++) {     // loop for each point
                    // predicted label - actual label
                    double temp = (theta1 * x_train[i][0] + theta0) - y_train[i];
                    temp0 += temp;
                    temp1 += x_train[i][0];
                }
                // left side of gradient decent
                theta0 -= (1.0/m) * alpha * temp0;
                theta1 -= (1.0/m) * alpha * temp1;
            }
            // TODO: calculate error/cost and repeat
        }
    }
    public String toString() {
        return "Regression line: y = " + theta1 + " * x + " + theta0 + "\nObjective: " + Arrays.toString(objective) +
                "\nMin. Objective: " + (double)Arrays.stream(objective).min().getAsDouble();
    }

    public double getIntercept() {
        return theta0;
    }
    public double getSlope() {
        return theta1;
    }
    public double predict(double x) {
        return theta1 * x + theta0;
    }

}