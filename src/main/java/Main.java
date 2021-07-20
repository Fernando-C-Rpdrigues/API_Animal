import model.Animal;
import model.Cat;
import model.Dog;

public class Main {

    public static void main(String[] args) {
        System.out.println("Seja Bem Vindo");


        Animal animal = new Animal();
        animal.setName("Nome do animal");
        System.out.println(animal);

        Dog dog = new Dog();
        dog.setName("Tobby");
        dog.setAge(5);
        dog.setNumberPaws(4);
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setName("Leonidas");
        cat.setAge(300);
        cat.setNumberPaws(4);
        System.out.println(cat);
    }


}