/**
 * 
 */
package simulatedannealing.interfaces;

import general.set.Set;

/**
 * @author Phillipp Ohl
 * @version 0.1
 */
public interface SimulatedAnnealingSpec {
	void defineInitialState();
	int computeFitnessValue(Set s1, Set s2);
	void startNeighborhoodSearch() throws Exception;
	void computePossibleSolutions() throws Exception;
	void findMinimum() throws Exception;
	void updateSolution(int indexSubsetOne, int indexSubsetTwo) throws Exception;
	void pickRandomSolution();
	int[] getCurrentSolution() throws Exception;
	Set getSubsetOne();
	Set getSubsetTwo();
	int getFitnessValue();
	int[] getPossibleSolutions();
	void printPossibleSolutions();
}
