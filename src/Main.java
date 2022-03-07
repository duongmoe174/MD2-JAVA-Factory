public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        IAnimal husky = animalFactory.createAnimal("dog");
        System.out.println("My husky said: " + husky.makeSound());

        IAnimal berus = animalFactory.createAnimal("cat");
        System.out.println("berus said: " + berus.makeSound());
    }
}
