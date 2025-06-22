package Concurrency.PrintN;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<ArrayList> {
    private ArrayList<Integer> list;
    private int n;

    public ArrayCreator(int n) {
        this.list = new ArrayList<>(n);
        this.n=n;
    }

    @Override
    public ArrayList call() throws Exception {
        for(int i=1;i<=this.n;i++)
        {
            this.list.add(i);
        }
        return list;
    }
}
