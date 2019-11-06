package GeneticAlgorithm;

public class MinimizeFitnessCommand implements Command {
    // I was playing around with making a Command implementation
    // This idea needs more thought
    GeneticAlgorithm GA;

    public MinimizeFitnessCommand (GeneticAlgorithm GA) {
        this.GA = GA;
    }

    @Override
    public void execute() {
        //GA.minimize();
    }
}
