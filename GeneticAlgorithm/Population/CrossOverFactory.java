package GeneticAlgorithm.Population;

import GeneticAlgorithm.Chromosome.Chromosome;
import GeneticAlgorithm.Selector.Selector;

import java.util.ArrayList;

public class CrossOverFactory extends DescendentPopulationFactory {

    public CrossOverFactory (Selector selector) {
        this.selector = selector;
    }

    @Override
    public ArrayList<Chromosome> createPopulation(ArrayList<Chromosome> breederPopulation, int size) {
        ArrayList<Chromosome> nextGeneration = new ArrayList<>();

        return nextGeneration;
    }
}
