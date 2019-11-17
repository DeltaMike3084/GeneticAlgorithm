package GeneticAlgorithm;

import GeneticAlgorithm.Chromosome.Chromosome;
import GeneticAlgorithm.Chromosome.ChromosomeExNihilo;
import GeneticAlgorithm.Selector.Selector;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class GeneticAlgorithm {
    protected Genome genome;
    //PopulationFactory populationFactory;
    protected Integer populationSize;
    private ArrayList<Chromosome> previousGeneration;
    protected ArrayList<Chromosome> currentGeneration;
    private Selector selector;
    private Comparator comparator;
    protected int currentGenerationCount;
    private int maxGenerationCount;

    public GeneticAlgorithm(
            List genes,
            Integer chromosomeLength,
            Integer populationSize,
            Integer maxGenerationCount,
            Selector selector,
            Comparator comparator)
    {
        this.genome = new Genome(genes, chromosomeLength);
        this.populationSize = populationSize;
        this.maxGenerationCount = maxGenerationCount;
        this.selector = selector;
        this.comparator = comparator;
        //setPopulationFactory(new InitialPopulationFactory(genome));
        currentGenerationCount = 0;
        currentGeneration = new ArrayList<>();
        for (int i = 0; i < populationSize; i++) {
            currentGeneration.add(new ChromosomeExNihilo(this.genome));
        }
    }

    public GeneticAlgorithm(
            List genes,
            ArrayList<Chromosome> currentPopulation,
            Integer maxGenerationCount,
            Selector selector,
            Comparator comparator)
    {
        // this.populationFactory = new PopulationFactory(genome);
        this.genome = new Genome(genes, currentPopulation.size());
        this.currentGeneration = currentPopulation;
        this.populationSize = currentPopulation.size();
        this.maxGenerationCount = maxGenerationCount;
        this.selector = selector;
        this.comparator = comparator;
    }

    public final void execute() {
        // templated method
        evaluateFitness();

        do {
            // Rename the current solutions as old solutions
            previousGeneration = currentGeneration;

            // Rank all the old solutions and identify the best among them
            rankPreviousGeneration();

            ArrayList<Chromosome> bestOfGeneration = selector.select(previousGeneration, 0.25);

            // Generate new solutions
            currentGeneration = createNextGeneration(bestOfGeneration);

            // Evaluate the fitness value of the newly generated solutions
            evaluateFitness();

        } while (isTerminationCriteriaMet());

        // Report best solution or most recently calculated solutions
        // Need to implement Observer pattern here
        //currentGeneration.getBest();
        System.out.println(previousGeneration.get(0).getGeneSequence());
        System.out.printf("%.9f", previousGeneration.get(0).getFitnessValue());
    }

//    private void evaluateFitness(ArrayList<Chromosome> currentGeneration) {
//        // template this method (chapter 8)?
//        // this method should change based on the implementation of the GA
//        //  more exploration should be done here
//    }

    public void setGenome(Genome genome) {
        this.genome = genome;
    }

    public void setPopulationSize(Integer PopulationSize) {
        this.populationSize = populationSize;
    }

    public ArrayList<Chromosome> getCurrentGeneration() {
        return currentGeneration;
    }

    public float getBestFitness() {
        return previousGeneration.get(0).getFitnessValue();
    }

    void rankPreviousGeneration() {
        previousGeneration.sort(comparator);
    }

    // factory method
    abstract protected ArrayList<Chromosome> createNextGeneration (ArrayList<Chromosome> breeders);
    abstract void evaluateFitness();

    //
    boolean isTerminationCriteriaMet() {
        boolean keepGoing = true;
        if (currentGenerationCount < maxGenerationCount)
            currentGenerationCount++;
        else
            keepGoing = false;

        return keepGoing;
    }
}

class SortByMaxFitness implements Comparator<Chromosome> {
    @Override
    public int compare(Chromosome o1, Chromosome o2) {
        return -Float.compare(o1.getFitnessValue(), o2.getFitnessValue());
    }
}

class SortByMinFitness implements Comparator<Chromosome> {
    @Override
    public int compare(Chromosome o1, Chromosome o2) {
        return Float.compare(o2.getFitnessValue(), o1.getFitnessValue());
    }
}