package com.company;

import GeneticAlgorithm.MaxFitnessGA;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Long> genes = new ArrayList<>();
        genes.add((long)0);
        genes.add((long)1);
        MaxFitnessGA ga = new MaxFitnessGA(genes, 32, 10, 100000);
        ga.execute();
    }
}
