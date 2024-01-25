package Q3.Prog702p;

public class hiccas extends Animal {
    private Double fur;

    public hiccas(String name, String word, Double fur) {
        super(name, word);
        this.fur = fur;
    }

    public Double getFur() { return fur; }
}
