public class Context {
    private State state;
    //定义环境类的初始状态
    public Context() {
        //构造环境类，传入怪物对象
        this.state = new Patrol(this,new Monster(30,50,6));
    }
    //设置新状态
    public void setState(State state) {
        this.state = state;
    }
    //读取状态
    public State getState() {
        return (state);
    }
    //对请求做处理
    public void Changedistance(int distance) {
        state.ChangeDistance(distance);
    }
}
