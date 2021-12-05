public class Homing extends State {

    public Homing(State state) {
        context=state.context;
        monster=state.monster;
        distance=state.distance;
        System.out.println("目标过远，放弃追击");
    }

    @Override
    public void Handle() {
        if(distance<monster.alertrange+40) System.out.println("目标仍在附近，驻足");
        else context.setState(new Patrol(this));
    }
}
