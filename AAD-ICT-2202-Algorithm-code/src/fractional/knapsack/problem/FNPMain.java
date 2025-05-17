package fractional.knapsack.problem;

import java.util.*;

public class FNPMain {
	
	public static double getMaxvalue(ArrayList<FractionalKnapsack>list,int capacity)
	{
		double totalprofit=0.0;
		
		for(FractionalKnapsack i : list)
		{
			int currwt=i.getWeights();
			int currprofit=i.getProfits();
			
			if(capacity>=currwt)
			{
				capacity=capacity-currwt;
				totalprofit=totalprofit+currprofit;
			}
			
			else
			{
				double fraction=(double)capacity/currwt;
				totalprofit+= (fraction)*currprofit;
				break;
			}
					
		}
		return totalprofit;
	}
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
 FractionalKnapsack item1=new FractionalKnapsack();
 item1.setObjects(1);
 item1.setProfits(12);
 item1.setWeights(3);

 FractionalKnapsack item2=new FractionalKnapsack();
 item2.setObjects(2);
 item2.setProfits(5);
 item2.setWeights(1);


 FractionalKnapsack item3=new FractionalKnapsack();
 item3.setObjects(3);
 item3.setProfits(16);
 item3.setWeights(4);
 
 FractionalKnapsack item4=new FractionalKnapsack();
 item4.setObjects(4);
 item4.setProfits(7);
 item4.setWeights(2);
 
 FractionalKnapsack item5=new FractionalKnapsack();
 item5.setObjects(5);
 item5.setProfits(9);
 item5.setWeights(9);

 
 FractionalKnapsack item6=new FractionalKnapsack();
 item6.setObjects(6);
 item6.setProfits(11);
 item6.setWeights(4);
 
 FractionalKnapsack item7=new FractionalKnapsack();
 item7.setObjects(7);
 item7.setProfits(6);
 item7.setWeights(3);
 
 ArrayList <FractionalKnapsack> List=new ArrayList<>();
 

List.add(item1);
List.add(item2);
List.add(item3);
List.add(item4);
List.add(item5);
List.add(item6);
List.add(item7);

Collections.sort(List,new FNPComparator());

int capacity=15;
double maxprofit=getMaxvalue(List,capacity);

System.out.println("Maximum profit = " + maxprofit + " TK");

	}

}

