package Threads;

class MyThread1 extends Thread{
	public void run() {
		int sum = 0;
		try {
			sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i<50; i++) {
			
			sum+= i;
		}
		System.out.println(this.getName());

		System.out.println(sum);
	}
}

class MyThread2 extends Thread{
	public void run() {
		int prod = 1;
		try {
			sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 1; i<50; i++) {
			
			prod*= i;
		}
		System.out.println(this.getName());

		System.out.println(prod);
	}
}

public class ThreadDemo {
	
	static void sum() {
		int sum = 0;
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i<50; i++) {
			
			sum+= i;
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(sum);
	}
	
	static void prod() {
		int prod = 1;
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 1; i<50; i++) {
			
			prod*= i;
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(prod);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Thread th1 = new MyThread1();
		Thread th2 = new MyThread2();
		
		th1.start();
		th2.start();
		
		sum();
		prod();
		
		System.out.println("Main Program Completed...");
	}
}
