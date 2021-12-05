public class Chase extends State{


    public Chase(State state) {
        context=state.context;
        monster=state.monster;
        distance=state.distance;
        System.out.println("目标逃离，进行追击");
    }

    @Override
    public void Handle() {
        if(distance-monster.alertrange>monster.speed*5)context.setState(new Homing(this));
        else System.out.println("继续追击");
    }
}
