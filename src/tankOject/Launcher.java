package tankOject;

public class Launcher {

	public static void main(String[] args) {
		Tank destroyer = new Tank("red", 2, 90);
		System.out.println ("Tank destroyer: color " + destroyer.color + ", crew " + destroyer.crew +
				", maxSpeed " + destroyer.maxSpeed);

	}

}
