package Q4.VirtualPetLab;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomCatImg());
    }
    // cats may have a higher increase in happiness when played with but also get hungrier faster.
    @Override
    public void feed() {
        // TODO: Implement feeding behavior for Cat
        setEnergy(getEnergy() + 10); 
        setHunger(getHunger() - 10); 
        updateStatus();
    }

    @Override
    public void play() {
        // TODO: Implement playing behavior for Cat
        setHappiness(getHappiness() + 20); 
        setEnergy(getEnergy() - 10); 
        setHunger(getHunger() + 20); 
        updateStatus();
    }

    @Override
    public void sleep() {
        // TODO: Implement sleeping behavior for Cat
        setEnergy(getEnergy() + 10); 
        setHunger(getHunger() - 5); 
        setHappiness(getHappiness() + 5); 
        updateStatus();
    }
}
