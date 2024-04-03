package VirtualPetLab;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomDogImg());
    }
    // Dogs might gain more energy from sleeping but also require more food when fed
    @Override
    public void feed() {
        // TODO: Implement feeding behavior for Dog
        Dog.setEnergy(Dog.getEnergy() + 10); 
        Dog.setHunger(Dog.getHunger() - 5); 
        Dog.statusUpdate(); 
    }

    @Override
    public void play() {
        // TODO: Implement playing behavior for Dog
        Dog.setHappiness(Dog.getHappiness() + 10); 
        Dog.setEnergy(Dog.getEnergy() - 10); 
        Dog.setHunger(Dog.getHunger() + 10); 
        Dog.statusUpdate();
    }

    @Override
    public void sleep() {
        // TODO: Implement sleeping behavior for Dog
        Dog.setEnergy(Dog.getEnergy() + 20); 
        Dog.setHunger(Dog.getHunger() - 1); 
        Dog.setHappiness(Dog.getHappiness() + 5); 
        Dog.statusUpdate();
    }
}
