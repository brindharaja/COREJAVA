//Exercise:
//Write a program to calculate the sum of integers from 1 to 1,000,000 using the Fork/Join Pool.
//Create a class SumTask that extends RecursiveTask<Long>.
//Split the range of numbers into smaller tasks using the ForkJoinPool.
//Combine the results from subtasks to get the total sum.

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long> {
    private long workLoad;
    long threshold=1000000;
    public SumTask(long workLoad){
        this.workLoad=workLoad;
    }
    protected Long compute(){
        if(workLoad<=threshold){
            long sum=0;
            for(int i=1;i<=workLoad;i++){
                sum=sum+i;
            }
            return sum;
        }else{
            SumTask left=new SumTask(workLoad/2);
            SumTask right=new SumTask(workLoad-(workLoad/2));
            left.fork();
            right.fork();
            long leftres=left.join();
            long rightres=right.join();
            return leftres+rightres;
        }
    }
    public static void main(String[] args){
        ForkJoinPool pool=new ForkJoinPool();
        SumTask sumTask=new SumTask(100000);
        long mergedres=pool.invoke(sumTask);
        System.out.println(mergedres);

    }
}
