package Q3.Prog702p;

public class wallies extends Animal {
    private int steps;

    public wallies(String name, String word, int steps) {
        super(name, word);
        this.steps = steps;
    }

    public int getSteps() { return steps; }
}
