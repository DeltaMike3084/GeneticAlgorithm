package GeneticAlgorithm.Selector;

import GeneticAlgorithm.Chromosome.Chromosome;

import java.util.ArrayList;
import java.util.Comparator;

public class RankSelector implements Selector {
    Comparator comparator;

    public RankSelector (Comparator comparator) {
        this.comparator = comparator;
    }

    @Override
    public ArrayList<Chromosome> select(ArrayList<Chromosome> basePopulation, double percentage) {
        int totalNumberSelected = (int)(basePopulation.size()*percentage);
        basePopulation.sort(comparator);
        return new ArrayList<Chromosome>(basePopulation.subList(0, totalNumberSelected));
    }
}
