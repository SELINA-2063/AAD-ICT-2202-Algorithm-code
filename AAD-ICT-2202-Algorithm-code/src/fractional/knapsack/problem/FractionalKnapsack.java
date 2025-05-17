package fractional.knapsack.problem;


public class FractionalKnapsack {
	private int objects;
	private int profits;
	private int weights;
	public int getObjects() {
		return objects;
	}
	public void setObjects(int objects) {
		this.objects = objects;
	}
	public int getProfits() {
		return profits;
	}
	public void setProfits(int profits) {
		this.profits = profits;
	}
	public int getWeights() {
		return weights;
	}
	public void setWeights(int weights) {
		this.weights = weights;
	}
	@Override
	public String toString() {
		return "FractionalKnapsack [objects=" + objects + ", profits=" + profits + ", weights=" + weights + "]";
	}
	
	

}

