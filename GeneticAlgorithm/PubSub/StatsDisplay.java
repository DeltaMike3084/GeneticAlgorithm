package GeneticAlgorithm.PubSub;

import java.util.ArrayList;

public class StatsDisplay implements Observer, DisplayElement{
	private ArrayList geneSequence;
	private float fitnessValue;
	private Subject GeneticAlgorithmStats;
	
	public StatsDisplay(Subject GeneticAlgorithmStats) {
		this.GeneticAlgorithmStats = GeneticAlgorithmStats;
		GeneticAlgorithmStats.registerObserver(this);
	}
	
	public void update(ArrayList geneSequence, float fitnessValue) {
		this.geneSequence = geneSequence;
		this.fitnessValue = fitnessValue;
		display();
	}
	
	public void display() {
		System.out.println("Gene Sequence: " + geneSequence);
		System.out.println("Fitness Value: " + fitnessValue);
		System.out.println("*******************************");
	}

}
