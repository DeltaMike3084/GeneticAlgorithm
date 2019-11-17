package GeneticAlgorithm.Chromosome;

import GeneticAlgorithm.Genome;

import java.util.ArrayList;
import java.util.Random;

public class ChromosomeExNihilo extends Chromosome {
    private Genome genome;

    public ChromosomeExNihilo (Genome genome) {
        this.genome = genome;
        this.buildChromosome();
        this.setAncestry(false);
    }

    protected void buildChromosome() {
        // Build a random chromosome from scratch

        ArrayList<Object> genes = genome.getGenes();
        ArrayList<Object> newGeneSequence = new ArrayList<>();
        int numberOfGenes = genes.size();

        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < genome.getChromosomeLength(); i++)
        {
            newGeneSequence.add(genes.get(random.nextInt(numberOfGenes)));
        }

        this.setGeneSequence(newGeneSequence);
    }

    public Chromosome getAncestralHero() {
        return this;
    }
}
