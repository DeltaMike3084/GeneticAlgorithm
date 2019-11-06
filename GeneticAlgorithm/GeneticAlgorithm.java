package GeneticAlgorithm;

import GeneticAlgorithm.Chromosome.Chromosome;
import GeneticAlgorithm.Chromosome.ChromosomeFactory;

public class GeneticAlgorithm {
    ChromosomeFactory chromosomeFactory;
    Population previousGeneration;
    Population currentGeneration;
    boolean terminate = false;

    public GeneticAlgorithm(Genome genome) {
        this.chromosomeFactory = new ChromosomeFactory(genome);
        currentGeneration = new Population (chromosomeFactory);
        evaluateFitness(currentGeneration);
    }

    public GeneticAlgorithm(Genome genome, Population currentPopulation) {
        this.chromosomeFactory = new ChromosomeFactory(genome);
        this.currentGeneration = currentPopulation;
    }

    public void execute() {
        // is this a facade (chapter 7)?

        do {
            // Rename the current solutions as old solutions
            previousGeneration = currentGeneration;

            // Rank all the old solutions and identify the best among them
            previousGeneration.rankBest();

            Population bestOfGeneration = previousGeneration.getBestSubset();

            // Generate new solutions
            currentGeneration = new Population(chromosomeFactory, previousGeneration);

            // Evaluate the fitness value of the newly generated solutions
            evaluateFitness(currentGeneration);

            // if termination criteria not met do it all again
            terminate = isTerminationCriteriaMet();
        } while (!terminate);

        // Report best solution or most recently calculated solutions
        currentGeneration.getBest();
    }

    private void evaluateFitness(Population currentGeneration) {
        // template this method (chapter 8)?
        // this method should change based on the implementation of the GA
        //  more exploration should be done here
    }

    private boolean isTerminationCriteriaMet() {
        return true;
    }

}
