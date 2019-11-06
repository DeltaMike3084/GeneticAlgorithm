package GeneticAlgorithm.Chromosome;

import GeneticAlgorithm.Genome;

public class ChromosomeFactory {
    Genome genome;

    // Candidate constructor
    public ChromosomeFactory(Genome genome) {
        this.genome = genome;
    }
    // Templated from "Building a simple pizza factory" from chapter 4
    // We can probably figure out a better parameter type than string to choose
    //  a chromosome sub-type

    public Chromosome buildChromosome(String type) {
        Chromosome chromosome = null; // definitely need better way to initialize

        if (type.equals("child"))
            chromosome = new SPCrossoverChromosome();
        else if (type.equals("mutant"))
            chromosome = new MutantChromosome();
        else {
            // made the base case random so we don't accidentally pass a null chromosome
            //  there is probably a better way to do this
            chromosome = new RandomChromosome();
        }

        return chromosome;
    }

}
