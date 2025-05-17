package fractional.knapsack.problem;


import java.util.Comparator;

public class FNPComparator implements Comparator<FractionalKnapsack> {

	@Override
	public int compare(FractionalKnapsack o1, FractionalKnapsack o2) {
		// TODO Auto-generated method stub
		double r1=(double)o1.getProfits()/o1.getWeights();
		double r2=(double)o2.getProfits()/o2.getWeights();
		
		if(r1<r2)
		     return 1;
		else if (r1>r2)
			return -1;
		else 
			return 0;
				
	}
	

}

