package GeneticAlgorithm.Chromosome;

import GeneticAlgorithm.Genome;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Comparator;
import java.util.Random;

public class Chromosome implements Cloneable {
    protected ArrayList genes;
    private int length;
    private float fitnessValue;
    private boolean hasAncestor;

    public Chromosome (Chromosome chromosome) {
        this.genes = new ArrayList(chromosome.getGeneSequence());
        length = this.genes.size();
        fitnessValue = 0;
    }

    public Chromosome() {
        this.genes = new ArrayList<>();
        this.length = 0;
        this.fitnessValue = 0;
        this.hasAncestor = false;
    }

    public ArrayList getGeneSequence() {
        return this.genes;
    }

    public int getLength() {
        return this.length;
    }

    public float getFitnessValue() {
        return this.fitnessValue;
    }

    public void setGeneSequence(ArrayList geneSequence) {
        this.genes = new ArrayList<>(geneSequence);
        this.length = genes.size();
    }

    public boolean hasAncestor() {
        return hasAncestor;
    }

    protected void setAncestry (boolean doesHaveAncestor) {
        this.hasAncestor = doesHaveAncestor;
    }

    public void setFitnessValue(float fitnessValue) {
        this.fitnessValue = fitnessValue;
    }

    public Chromosome clone() throws CloneNotSupportedException {
        Chromosome base = (Chromosome)super.clone();

        Chromosome clone = new Chromosome();
        clone.setGeneSequence(base.getGeneSequence());
        clone.setFitnessValue(base.getFitnessValue());
        clone.setAncestry(base.hasAncestor());

        return clone;
    }
}
