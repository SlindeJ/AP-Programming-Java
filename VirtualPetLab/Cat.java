package VirtualPetLab;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomCatImg());
    }
    // cats may have a higher increase in happinesss when played with but also get hungrier faster. 
    @Override
    public void feed() {
        // TODO: Implement feeding behavior for Cat
        Cat.setEnergy(Cat.getEnergy() + 10); 
        Cat.setHunger(Cat.getHunger() - 10); 
        Cat.statusUpdate();
    }

    @Override
    public void play() {
        // TODO: Implement playing behavior for Cat
        Cat.setHappiness(Cat.getHappiness() + 20); 
        Cat.setEnergy(Cat.getEnergy() - 10); 
        Cat.setHunger(Cat.getHunger() + 20); 
        Cat.statusUpdate();
    }

    @Override
    public void sleep() {
        // TODO: Implement sleeping behavior for Cat
        Cat.setEnergy(Cat.getEnergy() + 10); 
        Cat.setHunger(Cat.getHunger() - 5); 
        Cat.setHappiness(Cat.getHappiness() + 5); 
        Cat.statusUpdate();
    }
}
