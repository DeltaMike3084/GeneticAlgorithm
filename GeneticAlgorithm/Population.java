package GeneticAlgorithm;

import GeneticAlgorithm.Chromosome.Chromosome;
import GeneticAlgorithm.Chromosome.ChromosomeFactory;

import java.util.ArrayList;

public class Population {
    ArrayList<Chromosome> population;

    public Population(ChromosomeFactory chromosomeFactory) {
    }

    public Population(ChromosomeFactory chromosomeFactory, Population basePopulation) {
        // build a new population from another population?
    }

    public Chromosome getBest() {
        // This method should probably return a string or something more readable than
        //  a chromosome object
        return this.population.get(0);
    }

    public void rankBest() {
        // do some cool sorting algorithms here
        // this method could be tricky actually, some implementations of GA determine
        //  lower values to be more fit and others use higher values as more fit
        // example: maximizing a 32 binary number (higher value more fit)
        // example: Travelling salesman problem (fewest miles traveled more fit)
    }

    public Population getBestSubset() {
        // this should probably accept a parameter to help decide what size the subset
        //  ought to be
        return this;
    }
}
