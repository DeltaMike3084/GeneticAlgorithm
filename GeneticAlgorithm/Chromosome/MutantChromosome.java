package GeneticAlgorithm.Chromosome;

import GeneticAlgorithm.Genome;

import java.util.ArrayList;
import java.util.Random;

public class MutantChromosome extends ChromosomeDecorator {
    Chromosome baseChromosome;
    private Genome genome;

    public MutantChromosome (Chromosome baseChromosome, Genome genome) {
        this.baseChromosome = baseChromosome;
        this.setAncestry(true);
        this.genome = genome;
        this.setGeneSequence(this.baseChromosome.getGeneSequence());
        this.setFitnessValue(0);
        this.buildChromosome();
    }

    @Override
    protected void buildChromosome() {
        int chromosomeLength = this.getLength();
        ArrayList genes = genome.getGenes();
        int numberOfGenes = genes.size();

        Random random = new Random(System.currentTimeMillis());
        // mutate a random percentage of genes in the chromosome (range of 0% to 100%)
        int numberOfGenesToMutate = (int) (genome.getChromosomeLength() * random.nextFloat());

        for (int i = 0; i < numberOfGenesToMutate; i++)
        {
            this.genes.set(random.nextInt(chromosomeLength), genes.get(random.nextInt(numberOfGenes)));
        }
    }

    public Chromosome getAncestralHero() {
        return this;
    }
}
