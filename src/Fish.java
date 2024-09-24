public class Fish extends Animal {
    @Override
    public void move() {
        System.out.println("swim");
    }
    @Override
    public void makeSound() {
        System.out.println("blop blop");
    }
    @Override
    public void eat(){
        System.out.println("fish's food");
    }
}
