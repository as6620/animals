public class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("walk like a cat");
    }
    @Override
    public void makeSound() {
        System.out.println("meow like cat");
    }
    @Override
    public void eat(){
        System.out.println("eat like cat");
    }
}
