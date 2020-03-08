package MachineLearning;

import DataSet.DataSet;

public interface MachineLearningAlgorithm {
    void induce(DataSet dataSet);
    void predict();
    void calculateMeasures();
}
