package GeneticAlgorithm;

public class MaximizeFitnessCommand implements Command {
    // I was playing around with making a Command implementation
    // This idea needs more thought
    GeneticAlgorithm GA;

    public MaximizeFitnessCommand(GeneticAlgorithm GA) {
        this.GA = GA;
    }

    @Override
    public void execute() {
        //GA.maximize();
    }
}
