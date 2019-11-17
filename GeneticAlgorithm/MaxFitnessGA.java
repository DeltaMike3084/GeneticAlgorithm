package GeneticAlgorithm;

import GeneticAlgorithm.Chromosome.ChildChromosomeSPC;
import GeneticAlgorithm.Chromosome.Chromosome;
import GeneticAlgorithm.Chromosome.MutantChromosome;
import GeneticAlgorithm.Selector.RankSelector;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MaxFitnessGA extends GeneticAlgorithm {
    Random random = new Random(System.currentTimeMillis());

    public MaxFitnessGA(List genes, Integer chromosomeLength, Integer populationSize, Integer maxGenerationCount) {
        super(genes, chromosomeLength, populationSize, maxGenerationCount, new RankSelector(new SortByMaxFitness()), new SortByMaxFitness());
    }

    public MaxFitnessGA(List genes, ArrayList<Chromosome> currentPopulation, Integer maxGenerationCount) {
        super(genes, currentPopulation, maxGenerationCount, new RankSelector(new SortByMinFitness()), new SortByMinFitness());
    }

    @Override
    protected ArrayList<Chromosome> createNextGeneration(ArrayList<Chromosome> breeders) {
        ArrayList<Chromosome> nextGen = new ArrayList<>();
        int parent1Index = 0;
        int parent2Index = 0;

        for (int i = 0; i < this.populationSize; i++) {
            do {
                parent1Index = random.nextInt(breeders.size());
                parent2Index = random.nextInt(breeders.size());
            } while (parent1Index == parent2Index);

            Chromosome newIndividual = new ChildChromosomeSPC(breeders.get(parent1Index), breeders.get(parent2Index));

            if (random.nextFloat() > 0.99)
                newIndividual = new MutantChromosome(newIndividual, this.genome);

            nextGen.add(newIndividual);
        }
        return nextGen;
    }

    @Override
    void evaluateFitness() {
        long max = 2147483647;
        max = max * 2;
        max++;
        long totalFitness;
        for (Chromosome i : this.currentGeneration) {
            totalFitness = 0;
            ArrayList geneSequence = i.getGeneSequence();
            for (int j = 0; j < geneSequence.size(); j++) {
                totalFitness += ((long)Math.pow(2, j) * (long)geneSequence.get(j));
            }
            i.setFitnessValue((float)totalFitness/max);
        }
    }

    @Override
    boolean isTerminationCriteriaMet() {
        boolean keepGoing = super.isTerminationCriteriaMet();
        if ((getBestFitness()) > 0.99999) {
            keepGoing = false;
            System.out.println("Generation :" + currentGenerationCount);
        }

        return keepGoing;
    }
}
