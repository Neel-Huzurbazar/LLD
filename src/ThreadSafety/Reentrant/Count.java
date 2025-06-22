package ThreadSafety.Reentrant;

public class Count {
    public int val=0;

    public synchronized void add(int x)
    {
        val+=x;
    }

    public synchronized void subtract(int x)
    {
        val-=x;
    }
}
