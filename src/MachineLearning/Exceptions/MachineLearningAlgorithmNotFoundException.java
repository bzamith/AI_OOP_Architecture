package MachineLearning.Exceptions;

public class MachineLearningAlgorithmNotFoundException extends Exception {
    public MachineLearningAlgorithmNotFoundException(String algorithmName) {
        super(String.format("No algorithm found for '%s'",algorithmName));
    }
}
