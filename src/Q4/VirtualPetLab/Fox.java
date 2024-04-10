package Q4.VirtualPetLab;

public class Fox extends Pet {
    public Fox(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomFoxImg());
    }
    // Dogs might gain more energy from sleeping but also require more food when fed
    @Override
    public void feed() {
        setEnergy(getEnergy() + 5);
        setHunger(getHunger() - 10);
        setHappiness((getHappiness() + 2));
        updateStatus();
    }

    @Override
    public void play() {
        setHappiness(getHappiness() + 20);
        setEnergy(getEnergy() - 20);
        setHunger(getHunger() + 20);
        updateStatus();
    }

    @Override
    public void sleep() {
        setEnergy(getEnergy() + 20);
        setHappiness(getHappiness() + 5);
        updateStatus();
    }
}
