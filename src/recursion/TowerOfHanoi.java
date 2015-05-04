package recursion;

public class TowerOfHanoi {
	private String moveFrom;
	private String moveTo;
	private String other;
	private int numberOfPegs;
	
	public TowerOfHanoi(String moveFrom, String moveTo, String other, int numberOfPegs) {
		this.moveFrom = moveFrom;
		this.moveTo = moveTo;
		this.other = other;
		this.numberOfPegs = numberOfPegs;
	}
	
	public static void main(String[] args) {
		new TowerOfHanoi("A", "C", "B", 3).move();
	}

	public void move() {
		if (numberOfPegs == 1)
			System.out.println(moveFrom + " -> " + moveTo);
		else {
			new TowerOfHanoi(moveFrom, other, moveTo, numberOfPegs-1).move();
			System.out.println(moveFrom + " -> " + moveTo);
			new TowerOfHanoi(other, moveTo, moveFrom, numberOfPegs-1).move();
		}
	}
}
