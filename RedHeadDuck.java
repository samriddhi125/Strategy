public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
        swimBehaviour = new Swim();
    }
    @Override
    void display() {
        System.out.println("Looks like a RedHead duck.");
    }
}
