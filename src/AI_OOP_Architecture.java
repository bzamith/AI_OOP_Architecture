import DataSet.DataSet;
import Exceptions.ArgNotFoundException;
import Exceptions.ArgRequiredException;
import FileReader.Exceptions.FileNotFoundException;
import FileReader.Exceptions.FileReaderNotImplementedException;
import FileReader.FileReader;
import FileReader.FileReaderFactory;
import MachineLearning.Exceptions.MachineLearningAlgorithmNotFoundException;
import MachineLearning.Exceptions.MachineLearningAlgorithmNotImplementedException;
import MachineLearning.MachineLearningAlgorithm;
import MachineLearning.MachineLearningFactory;
import MachineLearning.MachineLearningType;
import MachineLearning.MachineLearningLibrary;

public class AI_OOP_Architecture {
    private static MachineLearningType algorithmType = MachineLearningType.NEURAL_NETWORK;
    private static MachineLearningLibrary algorithmLibrary = MachineLearningLibrary.BASIC;
    private static FileReader fileReader;

    public static void main(String[] args) throws Exception {
        parseArgs(args);
        printInfo();
        runML();
    }

    public static void printInfo(){
        System.out.println(String.format("Running %s %s algorithm for input file %s",algorithmType,algorithmLibrary,fileReader.getFileName()));

    }

    private static void runML() throws MachineLearningAlgorithmNotImplementedException, MachineLearningAlgorithmNotFoundException{
        DataSet trainingData = fileReader.parseFile();
        MachineLearningAlgorithm machineLearningAlgorithm = MachineLearningFactory
                .getMachineLearningAlgorithm(algorithmType, algorithmLibrary);
        machineLearningAlgorithm.induce(trainingData);
        machineLearningAlgorithm.predict();
        machineLearningAlgorithm.calculateMeasures();
    }

    private static void parseArgs(String[] args) throws ArgNotFoundException, MachineLearningAlgorithmNotFoundException,
                                                FileReaderNotImplementedException, FileNotFoundException, ArgRequiredException {
        for(String arg:args){
            if(arg.length()>=6) {
                arg = arg.toUpperCase();
                String command = arg.substring(0,6);
                String parameter = arg.substring(6,arg.length());
                switch (command){
                    case "-TYPE:":
                        parseAlgorithmType(parameter);
                        break;
                    case "-LIBR:":
                        parseAlgorithmLibrary(parameter);
                        break;
                    case "-FILE:":
                        fileReader = FileReaderFactory.getFileReader(parameter);
                        break;
                    default:
                        throw new ArgNotFoundException(arg);
                }
            }
            else{
                throw new ArgNotFoundException(arg);
            }
        }
        if(fileReader==null){
            throw new ArgRequiredException("-file");
        }
    }

    private static void parseAlgorithmType(String type) throws MachineLearningAlgorithmNotFoundException{
        switch(type){
            case "NEURALNETWORK":
                algorithmType = MachineLearningType.NEURAL_NETWORK;
                break;
            case "DECISIONTREE":
                algorithmType = MachineLearningType.DECISION_TREE;
                break;
            default:
                throw new MachineLearningAlgorithmNotFoundException(type);
        }
    }

    private static void parseAlgorithmLibrary(String library) throws MachineLearningAlgorithmNotFoundException{
        switch(library){
            case "BASIC":
                algorithmLibrary = MachineLearningLibrary.BASIC;
                break;
            case "WEKA":
                algorithmLibrary = MachineLearningLibrary.WEKA;
                break;
            case "TENSORFLOW":
                algorithmLibrary = MachineLearningLibrary.TENSOR_FLOW;
                break;
            default:
                throw new MachineLearningAlgorithmNotFoundException(library);
        }
    }
}


