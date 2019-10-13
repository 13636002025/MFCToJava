package matrixtest;

import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MatrixTest {
		static int Length;
	
		static public int [][]array1;
		static public int [][]array2;
		static public int [][]resultMatrix;
		static int flag=0;
		
		
		public static class Calculation implements Runnable{
			private int n;
			private int num;
			 private int m;

			Calculation(int m) {
				this.m=m;
				n=0;
				num=0;
			}
			

			@Override
			public void run() {
				// TODO Auto-generated method stub
				//System.out.println(Thread.currentThread().getName()+"          m="+m);//查看线程名称
					for(n=0;n<resultMatrix[0].length;n++)
					{
						for(num=0;num<array2.length;num++)
						{
							resultMatrix[m][n]=resultMatrix[m][n]+array1[m][num]*array2[num][n];
						}
					}
					flag++;
					//System.out.println("flag="+flag);
			}
			
		}

		
		public static void SingleThread(){//单线程
			long startTime=System.currentTimeMillis();
			for(int m=0;m<resultMatrix.length;m++)
			{
				for(int n=0;n<resultMatrix[0].length;n++)
				{
					for(int num=0;num<array2.length;num++)
					{
						resultMatrix[m][n]=resultMatrix[m][n]+array1[m][num]*array2[num][n];
					}
				}
			}
			long endTime=System.currentTimeMillis();
			System.out.println("单线程所用时间为："+(endTime-startTime));
		}
		
		public static void Multithreading() throws InterruptedException {//多线程
			
			Calculation thread;
			Thread thread1;
			
			long startTime=System.currentTimeMillis();
			for(int m=0;m<resultMatrix.length;m++) 
			{
				thread = new Calculation(m);
				thread1 = new Thread(thread);
				thread1.start();
			}
			
			long endTime=System.currentTimeMillis();
			
			System.out.println("多线程所用时间为："+(endTime-startTime));
		}
		
		public static void ThreadPool(){//线程池
			
			Calculation thread;
			
			Executor executor=Executors.newFixedThreadPool(1000);
			long startTime=System.currentTimeMillis();
			for(int m=0;m<resultMatrix.length;m++) 
			{
				thread = new Calculation(m);
				executor.execute(thread);
			}
			
			long endTime=System.currentTimeMillis();
			
			System.out.println("线程池所用时间为："+(endTime-startTime));
			
		}
	
		
		
	public static void main(String[] args) throws InterruptedException {
		
		
		Scanner sc = new Scanner(System.in); 
	    System.out.println("请输入矩阵长度：");
	    int length = sc.nextInt(); 
	    
	    Length=length;
	    
	    
		
	    array1 = new int[Length][Length];
	    array2 = new int[Length][Length];
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1[0].length;j++)
			{
				array1[i][j]=array2[i][j]=2;
			}
		}
		
		resultMatrix = new int[array1.length][array2[0].length];//结果数组
		
		
		SingleThread();
		Multithreading();
		ThreadPool();
		
		/*while(true) {
			System.out.print("");
			if(flag==Length) {
				for(int i=0;i<Length;i++)
				{
					for(int j=0;j<Length;j++)
					{
						System.out.print(resultMatrix[i][j]+" ");
					}
					System.out.println();
				}
				break;
			}
		}*/
	
	}

}
