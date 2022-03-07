public class AnimalFactory {
    public IAnimal createAnimal (String type) {
        if ("cat".equals(type)) {
            return new Cat();
        } else {
            return new Dog();
        }
    }
}
