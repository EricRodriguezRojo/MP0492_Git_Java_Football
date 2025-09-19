package worldcup;

/**
 * Class to define the coach
 */
public class Coach extends Person {
	public Coach(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	String style;

	public void train() {
		System.out.println("train");
	}

	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * @param style the style to set
	 */
	public void setStyle(String style) {
		this.style = style;
	}

}
