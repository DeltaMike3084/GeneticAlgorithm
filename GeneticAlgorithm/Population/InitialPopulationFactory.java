package GeneticAlgorithm.Population;

import GeneticAlgorithm.Chromosome.Chromosome;
import GeneticAlgorithm.Chromosome.ChromosomeExNihilo;
import GeneticAlgorithm.Genome;

import java.util.ArrayList;

public class InitialPopulationFactory extends PopulationFactory {

    public InitialPopulationFactory (Genome genome) {
        this.genome = genome;
    }

    @Override
    public ArrayList<Chromosome> createPopulation(ArrayList<Chromosome> basePopulation, int size) {

        for (int i = 0; i < size; i++) {
            basePopulation.add(new ChromosomeExNihilo(this.genome));
        }
        return basePopulation;
    }
}
