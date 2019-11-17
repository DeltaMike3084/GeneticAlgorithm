package GeneticAlgorithm.Population;

import GeneticAlgorithm.Chromosome.Chromosome;
import GeneticAlgorithm.Genome;

import java.util.ArrayList;

public abstract class PopulationFactory {
    Genome genome;

    public abstract ArrayList<Chromosome> createPopulation(ArrayList<Chromosome> basePopulation, int size);
}
