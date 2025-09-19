package worldcup;

/**

 * Class to define the Player
 */

/*All the class Player created*/


public class Player extends Person{
	String position;

	public Player(int age, String position) {
		super(age);
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public void passBall() {
		System.out.println("The ball goes to ");
	}
}