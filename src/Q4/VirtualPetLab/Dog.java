package Q4.VirtualPetLab;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomDogImg());
    }
    // Dogs might gain more energy from sleeping but also require more food when fed
    @Override
    public void feed() {
        // TODO: Implement feeding behavior for Dog
        setEnergy(getEnergy() + 10); 
        setHunger(getHunger() - 5); 
        updateStatus();
    }

    @Override
    public void play() {
        // TODO: Implement playing behavior for Dog
        setHappiness(getHappiness() + 10); 
        setEnergy(getEnergy() - 10); 
        setHunger(getHunger() + 10); 
        updateStatus();
    }

    @Override
    public void sleep() {
        // TODO: Implement sleeping behavior for Dog
        setEnergy(getEnergy() + 20); 
        setHunger(getHunger() - 1); 
        setHappiness(getHappiness() + 5); 
        updateStatus();
    }
}
