package worldcup;

public class Ball {

    private String material;

   
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Ball(String material) {
        super();
        this.material = material;
    }

    public void move() {
        System.out.println("The ball made of " + material + " is moving");
    }

}


