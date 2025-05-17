package activity.selection.problem;

import java.util.*;

public class ASPMain {
	
	public static void selectionOfActivities(ArrayList<ActivitySelectionProblem> list)
	{
	 int lastFinishTime=-1;
	 System.out.println("Selected Activities are :");
	 for(ActivitySelectionProblem i : list)
	 {
		if(i.getStart()>=lastFinishTime) 
		{
			System.out.print(i.getActivity()+" ");
			lastFinishTime=i.getFinish();
		}
	 }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
  ActivitySelectionProblem activity1= new ActivitySelectionProblem();
  activity1.setActivity("A1");
  activity1.setStart(0);
  activity1.setFinish(6);
  
  
  ActivitySelectionProblem activity2= new ActivitySelectionProblem();
  activity2.setActivity("A2");
  activity2.setStart(3);
  activity2.setFinish(4);
  
  ActivitySelectionProblem activity3= new ActivitySelectionProblem();
  activity3.setActivity("A3");
  activity3.setStart(1);
  activity3.setFinish(2);
  
  ActivitySelectionProblem activity4= new ActivitySelectionProblem();
  activity4.setActivity("A4");
  activity4.setStart(5);
  activity4.setFinish(9);
  
  ActivitySelectionProblem activity5= new ActivitySelectionProblem();
  activity5.setActivity("A5");
  activity5.setStart(5);
  activity5.setFinish(7);
  
  ActivitySelectionProblem activity6= new ActivitySelectionProblem();
  activity6.setActivity("A6");
  activity6.setStart(8);
  activity6.setFinish(9);
  
  ArrayList<ActivitySelectionProblem> List=new ArrayList<>();
  List.add(activity1);
  List.add(activity2);
  List.add(activity3);
  List.add(activity4);
  List.add(activity5);
  List.add(activity6);
  
  Collections.sort(List,new ASPComparator());
  selectionOfActivities(List);
	

}
}
