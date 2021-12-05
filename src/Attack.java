import java.util.Random;

public class Attack extends State {

    public Attack(State state) {
        context=state.context;
        monster=state.monster;
        distance=state.distance;
        System.out.println("目标进入攻击范围，发动攻击");
    }

    @Override
    public void Handle() {
        Random rd=new Random();
        if(distance<monster.attackrange)
            System.out.println("继续攻击");
        else context.setState(new Chase(this));
    }
}
