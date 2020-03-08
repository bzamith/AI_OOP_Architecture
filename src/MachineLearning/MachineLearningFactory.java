package MachineLearning;

import MachineLearning.DecisionTree.DecisionTreeFactory;
import MachineLearning.Exceptions.MachineLearningAlgorithmNotFoundException;
import MachineLearning.Exceptions.MachineLearningAlgorithmNotImplementedException;
import MachineLearning.NeuralNetwork.NeuralNetworkFactory;

public class MachineLearningFactory {
    public static MachineLearningAlgorithm getMachineLearningAlgorithm(MachineLearningType type, MachineLearningLibrary library) throws MachineLearningAlgorithmNotImplementedException, MachineLearningAlgorithmNotFoundException {
        switch (type){
            case DECISION_TREE:
                return DecisionTreeFactory.getDecisionTree(library);
            case NEURAL_NETWORK:
                return NeuralNetworkFactory.getNeuralNetwork(library);
            default:
                throw new MachineLearningAlgorithmNotFoundException(String.format("%s %s", type,library));
        }
    }
}
