
public class Single {
	public static void main(String[] args) {
		Demo thread3 = new Demo();
		thread3.setName("t3");	
		thread3.start();		//Compute the sum with only one thread			
	}
}
