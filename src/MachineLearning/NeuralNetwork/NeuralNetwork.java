package MachineLearning.NeuralNetwork;

import MachineLearning.MachineLearningAlgorithm;

public abstract class NeuralNetwork implements MachineLearningAlgorithm {
    protected int nbNodes;
    protected int nbLayers;
    protected ActivationFunction activationFunction;

    public NeuralNetwork(){}

    public ActivationFunction getActivationFunction(){
        return activationFunction;
    }

    public int getNbNodes(){
        return nbNodes;
    }

    public void setNbNodes(int nbNodes){
        this.nbNodes = nbNodes;
    }

    public int getNbLayers(){
        return nbLayers;
    }

    public void setNbLayers(int nbLayers){
        this.nbLayers = nbLayers;
    }
}
