public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
        swimBehaviour = new Swim();
    }
    @Override
    void display() {
        System.out.println("Looks like a Mallard duck.");
    }
}
