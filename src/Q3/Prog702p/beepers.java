package Q3.Prog702p;

public class beepers extends Animal {
    private String xWord;

    public beepers(String name, String word, String xWord) {
        super(name, word);
        this.xWord = xWord;
    }

    public String getxWord() { return xWord; }
}
