
public class printTankInfo {

	public static void main(String[] args) {
		Tank[] tanks = new Tank[3];
		tanks[0] = new Tank("color1",4,100);
		tanks[1] = new Tank("color2",5,200);
		tanks[2] = new Tank("color3",3,150);
		printTankInfo(tanks);

	}
	
	static void printTankInfo(Tank[] tanks) {
		for(int i = 0; i < 3; i++) {
		System.out.println("Tank" + (i + 1) + "\n" + "Color: " + tanks[i].color + " Crew: " + tanks[i].crew + 
				" maxSpeed: " + tanks[i].maxSpeed);
		}
	}

}
