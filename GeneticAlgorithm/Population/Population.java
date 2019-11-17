package GeneticAlgorithm.Population;

import GeneticAlgorithm.Chromosome.Chromosome;
import GeneticAlgorithm.Genome;

import java.util.ArrayList;

public class Population {
    private ArrayList<Chromosome> individuals;
    private Genome genome;
    long bestfitness;

    public Population() {
        this.individuals = new ArrayList<Chromosome>();
    }

    public void addIndividual(Chromosome newIndividual) {
        individuals.add(newIndividual);
    }

    public void addMany(ArrayList<Chromosome> newIndividuals) {
        individuals.addAll(newIndividuals);
    }

    public int getPopulationSize() {
        return individuals.size();
    }

}
