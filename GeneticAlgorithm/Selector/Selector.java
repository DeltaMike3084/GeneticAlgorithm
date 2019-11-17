package GeneticAlgorithm.Selector;

import GeneticAlgorithm.Chromosome.Chromosome;
import GeneticAlgorithm.GeneticAlgorithm;
import GeneticAlgorithm.Population.Population;

import java.util.ArrayList;

public interface Selector {
    // Selection Techniques:
    // Rank (Fittest individuals carry through and are the basis for the next generation)
    // Tournament (Select best of n randomly selected individuals from the current population)
    // Roulette (Select with probability proportional to fitness)
    public ArrayList<Chromosome> select(ArrayList<Chromosome> population, double percentage);
}
