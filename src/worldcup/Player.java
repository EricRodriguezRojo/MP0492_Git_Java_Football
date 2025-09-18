package worldcup;

/**
 * Class to define the midfielder
 */

/*All the class Player created*/

public class Player{
	String name;
	String nickname;
	int age;
	String position;
	
	public Player(String name, String nickname, int age, String position) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.age = age;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
}