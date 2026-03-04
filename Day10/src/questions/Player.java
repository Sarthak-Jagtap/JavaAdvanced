package questions;

public class Player {
	String name;
	int jerNo;
	int runs;
	
	Player(String name, int jerNo, int runs){
		this.name = name;
		this.jerNo = jerNo;
		this.runs = runs;
	}
	
	@Override
    public String toString() {
        return name + " jerNo=" + jerNo + ", runs=" + runs;
    }
}
