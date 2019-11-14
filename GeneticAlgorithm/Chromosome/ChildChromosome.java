package GeneticAlgorithm.Chromosome;

import java.util.ArrayList;

public abstract class ChildChromosome extends ChromosomeDecorator {
    Chromosome parent1;
    Chromosome parent2;

    protected abstract ArrayList crossover();
    protected abstract void setAncestry();
}
