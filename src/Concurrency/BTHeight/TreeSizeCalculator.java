package Concurrency.BTHeight;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    private Node root;
    private ExecutorService executorService;

    public TreeSizeCalculator(Node root, ExecutorService executorService){
        this.root = root;
        this.executorService = executorService;
    }

    @Override
    public Integer call() throws Exception {
        if(root==null)
        {
            return 0;
        }
        Future<Integer> leftTree=executorService.submit(new TreeSizeCalculator(root.left,executorService));
        Future<Integer> rightTree=executorService.submit(new TreeSizeCalculator(root.right,executorService));
        return leftTree.get()+rightTree.get()+1;
    }
}
