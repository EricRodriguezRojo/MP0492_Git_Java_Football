package worldcup;

import java.util.Random;


public class Goalkeeper extends Player {
	public Goalkeeper(String name, String nickname, int age, String position) {
		super(name, nickname, age, position);
		
	}

	boolean globes;

	/**
	 * @return the globes
	 */
	public boolean isGlobes() {
		return globes;
	}

	/**
	 * @param globes the globes to set
	 */
	public void setGlobes(boolean globes) {
		this.globes = globes;
	}

	public void block(Ball ball) {
		String[] effects = { "with success", "without success" };

		Random rand = new Random();
		String effect = effects[rand.nextInt(effects.length)];
		
		System.out.println("catching " + effect);
	}
}
