package worldcup;

public abstract class Person {
	private int age;
	
	public Person(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void run(){
        System.out.println("running");
    }
}
