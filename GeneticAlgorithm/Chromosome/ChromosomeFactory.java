package GeneticAlgorithm.Chromosome;

import GeneticAlgorithm.Genome;

import java.util.ArrayList;
import java.util.Random;

public class ChromosomeFactory {
    Genome genome;
    Random random = new Random(System.currentTimeMillis());

    // Candidate constructor
    public ChromosomeFactory(Genome genome) {
        this.genome = genome;
    }

//    public Chromosome buildChromosome() {
        // Build a random chromosome from scratch

//        Chromosome randomChromosome = new Chromosome();
//        ArrayList<Object> genes = genome.getGenes();
//        ArrayList<Object> newGeneSequence = new ArrayList<>();
//        int numberOfGenes = genes.size();
//
//        for (int i = 0; i < genome.getChromosomeLength(); i++)
//        {
//            newGeneSequence.add(genes.get(random.nextInt(numberOfGenes)));
//        }
//
//        randomChromosome.setGeneSequence(newGeneSequence);
//
//        return randomChromosome;
//    }
//
//    public Chromosome buildChromosome(Chromosome chromosomeToBeMutated) {
//        // Mutate an existing chromosome

//        Chromosome mutatedChromosome = new Chromosome(chromosomeToBeMutated);
//        ArrayList newGeneSequence = mutatedChromosome.getGeneSequence();
//
//        int chromosomeLength = genome.getChromosomeLength();
//        ArrayList genes = genome.getGenes();
//
//        // mutate 10% of the genes in the chromosome (could make this variable in the future)
//        int numberOfGenesToMutate = genome.getChromosomeLength() / 10;
//
//        for (int i = 0; i < numberOfGenesToMutate; i++)
//        {
//            newGeneSequence.set(random.nextInt(chromosomeLength), genes.get(random.nextInt()));
//        }
//
//        mutatedChromosome.setGeneSequence((newGeneSequence));
//
//        return mutatedChromosome;
//    }

//    public Chromosome buildChromosome(Chromosome parent1, Chromosome parent2) {
        // Build a child chromosome using single point crossover on two parent chromosomes

//        Chromosome childChromosome = new Chromosome();
//        ArrayList newGeneSequence = childChromosome.getGeneSequence();
//        ArrayList parent1GeneSequence = parent1.getGeneSequence();
//        ArrayList parent2GeneSequence = parent2.getGeneSequence();
//
//        int chromosomeLength = genome.getChromosomeLength();
//        int singlePointCrossoverIndex = random.nextInt(chromosomeLength);
//
//        newGeneSequence.add(parent1GeneSequence.subList(0,singlePointCrossoverIndex));
//        newGeneSequence.add(parent2GeneSequence.subList(singlePointCrossoverIndex, genome.getChromosomeLength()));
//
//        childChromosome.setGeneSequence(newGeneSequence);
//
//        return childChromosome;
//    }

}
