package GeneticAlgorithm;

import GeneticAlgorithm.Chromosome.Chromosome;

import java.util.ArrayList;

public interface TerminationCriteria {
    public boolean evaluate(ArrayList<Chromosome> population);
}
