package GeneticAlgorithm.Chromosome;

import java.util.ArrayList;
import java.util.Random;

public class ChildChromosomeSPC extends ChildChromosome {

    public ChildChromosomeSPC(Chromosome parent1, Chromosome parent2) {
        this.parent1 = parent1;
        this.parent2 = parent2;
        buildChromosome();
    }

    @Override
    protected ArrayList crossover() {
        Chromosome childChromosome = new Chromosome();
        ArrayList newGeneSequence = childChromosome.getGeneSequence();
        ArrayList parent1GeneSequence = parent1.getGeneSequence();
        ArrayList parent2GeneSequence = parent2.getGeneSequence();

        Random random = new Random(System.currentTimeMillis());

        int chromosomeLength = parent1.getLength();
        int singlePointCrossoverIndex = random.nextInt(chromosomeLength);

        newGeneSequence.addAll(parent1GeneSequence.subList(0,singlePointCrossoverIndex));
        newGeneSequence.addAll(parent2GeneSequence.subList(singlePointCrossoverIndex, chromosomeLength));

        return newGeneSequence;
    }

    @Override
    protected void setAncestry() {
        if (parent1.getFitnessValue() >= parent2.getFitnessValue())
            this.ancestor = parent1;
        else
            this.ancestor = parent2;
    }

    @Override
    protected void buildChromosome() {
        setFitnessValue(0);
        this.setGeneSequence(crossover());
        this.setAncestry();
    }
}
