package MachineLearning.NeuralNetwork;

import MachineLearning.Exceptions.MachineLearningAlgorithmNotFoundException;
import MachineLearning.Exceptions.MachineLearningAlgorithmNotImplementedException;
import MachineLearning.MachineLearningLibrary;

public class NeuralNetworkFactory {
    public static NeuralNetwork getNeuralNetwork(MachineLearningLibrary library) throws MachineLearningAlgorithmNotImplementedException, MachineLearningAlgorithmNotFoundException {
        switch (library){
            case BASIC:
                return new NeuralNetworkBasic();
            case TENSOR_FLOW:
                return new NeuralNetworkTensorFlow();
            case WEKA:
                return new NeuralNetworkWeka();
            default:
                throw new MachineLearningAlgorithmNotFoundException(String.format("Neural Network %s",library));
        }
    }
}
