public class Factory {
	private int cost;
	private int input;
	private int output;
	private int researchCost;

	public Factory() {
		 cost = 2000;
		input = 8;
		output = 1;
		researchCost = 1;
	}

	public void Upgrade() {
		//change building appearance
		output+=2;
		cost*=2;
		researchCost *=2;


	}
	public int getCost() {
		return cost;
	}

	public int getInput() {
		return input;
	}

	public int getOutput() {
		return output;
	}

	public int getResearchCost() {
		return researchCost;
	}
}


