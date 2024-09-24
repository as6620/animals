public class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("fly");
    }
    @Override
    public void makeSound() {
        System.out.println("The bird tweets");
    }
    @Override
    public void eat(){
        System.out.println("bird's food");
    }
}
