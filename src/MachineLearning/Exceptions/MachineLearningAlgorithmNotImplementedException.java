package MachineLearning.Exceptions;

public class MachineLearningAlgorithmNotImplementedException extends Exception {
    public MachineLearningAlgorithmNotImplementedException(String algorithmName) {
        super(String.format("No implementation found for '%s'",algorithmName));
    }
}
