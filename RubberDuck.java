public class RubberDuck extends Duck{
    public RubberDuck(){
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();
        swimBehaviour = new Float();
    }
    @Override
    void display() {
        System.out.println("Looks like a Rubber duck.");
    }
}
