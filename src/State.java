abstract public class State {
    protected int distance;
    protected Context context;
    protected Monster monster;
    public abstract void Handle();
    public void ChangeDistance(int distance){           //改变目标距离，以此改变怪物状态
        this.distance+=distance;
        System.out.println("当前目标距离为"+this.distance);
        Handle();
    }
}
