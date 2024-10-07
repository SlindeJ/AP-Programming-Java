package CS220.week5;

public class die {
    private int sides; 
    private int value; 
    
    public void Die(int sides) {
        this.sides = sides;
        value = 0;
    }
    public void roll() {
        value = (int) (Math.random() * sides + 1);
    }
    public int getValue() { return this.value; }
    public int getSides() { return this.sides; }
}
