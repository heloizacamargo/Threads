import java.util.Random;

//Implement a parallel array sum, and compare performance with single thread sum.
class Demo extends Thread{
	
	@Override
	public void run() {		
		Random rd = new Random();
		int[] arr = new int[200000000];				//Create array with 200 million random numbers between 1-10
		int sum = 0;
				
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(0, 11); 				//Storing random integers in an array
			sum += arr[i];			
		}
		
		System.out.println(Thread.currentThread().getName() + " Sum: " + sum + " Time: " + System.nanoTime());
	}
	
}

public class MyClass {
	
	public static void main(String[] args) {	
		Demo thread1 = new Demo();
		thread1.setName("t1");		
		Demo thread2 = new Demo();
		thread2.setName("t2");

		thread1.start();
		thread2.start();	
	}
}
