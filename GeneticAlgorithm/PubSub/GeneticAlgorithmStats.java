package GeneticAlgorithm.PubSub;

import java.util.ArrayList;

public class GeneticAlgorithmStats implements Subject{
	private ArrayList<Observer> observers;
	private ArrayList geneSequence;
	private float fitnessValue;
	
	public GeneticAlgorithmStats() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0 )
			observers.remove(i);
	}
	
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(geneSequence, fitnessValue);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setStatistics(ArrayList geneSequence, float fitnessValue) {
		this.geneSequence = geneSequence;
		this.fitnessValue = fitnessValue;
		measurementsChanged();
	}

}
