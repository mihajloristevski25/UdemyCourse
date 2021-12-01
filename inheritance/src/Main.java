public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal" , 1 , 1 , 5 , 5);

        Dog dog = new Dog("Yorkie" , 8 , 20 , 2 , 4, 1, 20,"long silky");
        //dog.eat();
        //dog.walk();
        //dog.run();
        Fish fish = new Fish("Trout" , 4,10,1,2,1);
        fish.swin(2);
    }
}
