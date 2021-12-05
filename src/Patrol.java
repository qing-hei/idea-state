
public class Patrol extends State{
    public Patrol(Context context,Monster monster) {    //接收环境对象，第一次构造时调用,初始距离设为0
        this.context=context;
        this.monster=monster;
        distance=0;
        System.out.println("正在巡逻");
    }

    public Patrol(State state) {
        context=state.context;
        monster=state.monster;
        distance=state.distance;
        System.out.println("正在巡逻");
    }

    @Override
    public void Handle(){
        if(this.distance<monster.alertrange)context.setState(new Alert(this));
        else System.out.println("未发现异常，继续巡逻");
    }
}
