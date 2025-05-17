package activity.selection.problem;

import java.util.Comparator;


public class ASPComparator implements Comparator<ActivitySelectionProblem> {

	@Override
	public int compare(ActivitySelectionProblem a1, ActivitySelectionProblem a2) {
		// TODO Auto-generated method stub
		return a1.getFinish()-a2.getFinish();
	}

}

