package Concurrency.PrintN;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayCreator arr=new ArrayCreator(n);
        FutureTask<ArrayList> future=new FutureTask<>(arr);
        Thread t=new Thread(future);
        t.start();
        System.out.println(future.get());
    }
}
