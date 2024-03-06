public class DecoyDuck extends Duck{
    public DecoyDuck(){
        quackBehaviour = new Mute();
        flyBehaviour = new FlyNoWay();
        swimBehaviour = new Drown();
    }
    @Override
    void display() {
        System.out.println("Looks like a Decoy duck.");
    }
}
