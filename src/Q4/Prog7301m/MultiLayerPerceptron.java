//package Q4.Prog7301m;
//
//public class MultiLayerPerceptron {
//    private double fLearningRate;
//    private Layer[] fLayers;
//    private Activations.Activation fActivation;
//
//    public MultiLayerPerceptron(int[] layers, double learningRate, Activations.Activation activation) {
//        fLearningRate = learningRate;
//        fActivation = activation;
//        fLayers = new Layer[layers.length];
//        for (int i = 0; i < layers.length; i++) {
//            fLayers[i] = (i == 0) ? new Layer(layers[i], 0)
//                    : new Layer(layers[i], layers[i-1]);
//        }
//    public double[] feedForward(double[] x) {
//            double result;
//            double[] output = new double[fLayers[fLayers.length-1].Size()];
//
//            for (int i = 0; i < fLayers[0].Size; i++) {
//                fLayers[0].Neurons[i].Value = x[i];
//                for (int k = 1; k < fLayers.length; k++) {    // starts at first hidden layer
//                    for (int i = 0; i < fLayers[k].Size; i++) {
//                        result = 0.0;
//                        for (int j = 0; j < fLayers[k-1].Size; j++) {
//                            result += fLayers[k].Neurons[i].Weights[j] * fLayers[k-1].Neurons[j].Value;
//                        }
//                        result += fLayers[k].Neurons[i].Bias;
//                        fLayers[k].Neurons[i].Value = fActivation.activate(result);
//                    }
//                }
//            }
//            for (int i = 0; i < fLayers[fLayers.length-1].Size; i++) {
//                output[i] = fLayers[fLayers.length-1].Neurons[i].Value;
//            }
//            return output;
//        }
//
//        public double backProgagate(double[] x, double[] output) {
//            double[] result = feedForward(x);
//            double error = 0.0;
//            int outputSize = fLayers[fLayers.length-1].Size;
//
//            for (int i = 0; i < outputSize; i++) {
//                error = output[i] - result[i];      // error is predicted minus actual
//                fLayers[fLayers.length-1].Neurons[i].Delta = error * fActivation.activateDeriv(result[i]);
//            }
//            for (int k = fLayers.length-1; k >= 0; k--) {
//                for (int i = 0; i < fLayers[k].Size; i++) {
//                    error = 0;
//                    for (int j = 0; j < fLayers[k+1].Size; j++) {
//                        error += fLayers[k+1].Neurons[j].Delta *
//                                fLayers[k+1].Neurons[j].Weights[i];
//                        fLayers[k].Neurons[i].Delta = error * fActivation.activateDeriv(fLayers[k].Neurons[i].Value);
//                    }
//                    for (int i = 0; i < fLayers[k+1].Size; i++) {
//                        fLayers[k+1].Neurons[i].Weights[j] += fLearningRate *
//                                fLearningRate[k+1].Neurons[i].Delta * fLayers[k].Neurons[j].Value;
//                        fLayers[k+1].Neurons[i].Bias += fLearningRate *
//                                fLearningRate[k+1].Neurons[i].Delta;
//                    }
//                }
//            }
//            error = 0.0;
//            for (int i = 0; i < output.length; i++) {
//                error += Math.abs(result[i]-output[i]);
//                return error / output.length;
//            }
//            public double[] predict(double[] X) { return feedForward(X); }
//
//            public double accuracy(double[][] X, double[][] output) {
//                for (int i = 0; i < X.length; i++) {
//                    double[] result = feedForward(X[i]);
//                    for (int j = 0; j < output[i].length; j++) {
//                        error += Math.abs(result[j] - output[i][j]);
//                    }
//                }
//                return 1 - error / (X.length * output[0].length);
//            }
//
//            public void train(double[][] X_train, double[][] y_train, int epoch) {
//                for (int epoch = 0; epoch < epochs; epoch++) {
//                    double loss = 0;
//                    for (int i = 0; i < X_train.length; i++) {
//                        loss += backProgagate(X_train[i], y_train[i]);
//                    }
//                    loss /= X_train.length;
//                    System.out.printf("Epoch %d:\tLoss: %.6f\t\tAccuracy: %.6f\n", (epoch+1), loss, accuracy(X_train) ); // not done
//                }
//            }
//        }
//    }
//}
