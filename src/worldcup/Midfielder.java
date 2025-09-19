package worldcup;

/**
 * Class to define the midfielder
 */
public class Midfielder extends Player {
	private boolean vision;

	/**
	 * @return the vision
	 */
	public boolean isVision() {
		return vision;
	}

	/**
	 * @param vision the vision to set
	 */
	public void setVision(boolean vision) {
		this.vision = vision;
	}

	
	/** In this class we only need to change a little error, we change the word "print1n" to "println"*/
	public void organize() {
		System.out.println("organizing");
	}
}
