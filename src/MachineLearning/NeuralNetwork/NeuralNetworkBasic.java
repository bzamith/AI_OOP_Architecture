package MachineLearning.NeuralNetwork;

import DataSet.DataSet;
import MathFunctions.Sigmoid;

public class NeuralNetworkBasic extends NeuralNetwork {
    public NeuralNetworkBasic(){
        super();
        nbNodes = 10;
        nbLayers = 4;
        activationFunction = new Sigmoid();
    }

    @Override
    public void induce(DataSet dataSet){
        int input = 10;
        int output = activationFunction.activationFunction(input);
        // TO-DO
    }

    @Override
    public void predict(){
        // TO-DO
    }

    @Override
    public void calculateMeasures(){
        // TO-DO
    }
}
