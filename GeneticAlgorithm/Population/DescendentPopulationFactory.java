package GeneticAlgorithm.Population;

import GeneticAlgorithm.Chromosome.Chromosome;
import GeneticAlgorithm.Selector.Selector;

import java.util.ArrayList;

public abstract class DescendentPopulationFactory extends PopulationFactory {
    Selector selector;

    protected ArrayList<Chromosome> getElites(ArrayList<Chromosome> basePopulation, Integer numberOfElites) {
        ArrayList<Chromosome> elites = new ArrayList<>();

        elites.addAll(selector.select(basePopulation, (numberOfElites/basePopulation.size())));

        return elites;
    }
}
