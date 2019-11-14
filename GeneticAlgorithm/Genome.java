package GeneticAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Genome {
    private ArrayList genes;
    private int chromosomeLength;

    public Genome(List inputGenes, int lengthOfChromosome){
        this.genes = new ArrayList(inputGenes);
        this.chromosomeLength = lengthOfChromosome;
    }

    public ArrayList getGenes()
    {
        return this.genes;
    }

    public int getChromosomeLength()
    {
        return this.chromosomeLength;
    }

}
