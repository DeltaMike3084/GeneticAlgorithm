package GeneticAlgorithm.Chromosome;

public abstract class ChromosomeDecorator extends Chromosome {
    Chromosome ancestor;
    protected abstract void buildChromosome();
}
