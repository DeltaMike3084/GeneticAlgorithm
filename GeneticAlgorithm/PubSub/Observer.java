package GeneticAlgorithm.PubSub;

import java.util.ArrayList;

public interface Observer {
	public void update(ArrayList geneSequence, float fitnessValue);
}
