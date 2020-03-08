package MachineLearning.DecisionTree;

import MachineLearning.Exceptions.MachineLearningAlgorithmNotFoundException;
import MachineLearning.Exceptions.MachineLearningAlgorithmNotImplementedException;
import MachineLearning.MachineLearningLibrary;

public class DecisionTreeFactory {
    public static DecisionTree getDecisionTree(MachineLearningLibrary library) throws MachineLearningAlgorithmNotImplementedException, MachineLearningAlgorithmNotFoundException {
        switch (library){
            case BASIC:
                return new DecisionTreeBasic();
            case TENSOR_FLOW:
                return new DecisionTreeTensorFlow();
            case WEKA:
                throw new MachineLearningAlgorithmNotImplementedException("Decision Tree Weka");
            default:
                throw new MachineLearningAlgorithmNotFoundException(String.format("Decision Tree %s",library));
        }
    }
}
