package MachineLearning.DecisionTree;

import MachineLearning.MachineLearningAlgorithm;

public abstract class DecisionTree implements MachineLearningAlgorithm {
    protected int nbNodes;
    protected int nbLevels;

    public DecisionTree(){}

    public abstract void pruneTree();

    public int getNbNodes(){
        return nbNodes;
    }

    public void setNbNodes(int nbNodes){
        this.nbNodes = nbNodes;
    }

    public int getNbLayers(){
        return nbLevels;
    }

    public void setNbLayers(int nbLayers){
        this.nbLevels = nbLayers;
    }
}
