
public class Alert extends State{

    public Alert(State state) {
        context=state.context;
        monster=state.monster;
        distance=state.distance;
        System.out.println("发现动静，正在警戒");
    }

    @Override
    public void Handle() {
        if(distance<monster.attackrange)context.setState(new Attack(this));
        else context.setState(new Chase(this));
    }
}
