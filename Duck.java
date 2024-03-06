abstract public class Duck{
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;
    SwimBehaviour swimBehaviour;

    public void setSwimBehaviour(SwimBehaviour sb) {
        swimBehaviour = sb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }
    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }
    abstract void display();
    public void performFly(){ //extra encapsulation happens here
        flyBehaviour.fly();
    }
    public void performSwim(){ //extra encapsulation happens here
        swimBehaviour.swim();
    }
    public void performQuack(){ //extra encapsulation happens here
        quackBehaviour.quack();
    }
}
