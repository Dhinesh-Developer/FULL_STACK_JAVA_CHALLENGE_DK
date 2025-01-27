package com.Dhinesh_Developer;

class userThread extends Thread{
	public void run() {
		System.out.println("user Thread is executing");
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("User Thread is completed");
		}
	}
}

class daemonThread extends Thread{
	public void run() {
		for(;;){
			System.out.println("Daemon thread is executing");
			try {
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Daemon thread is completed");
		}
	}
}

public class DAY44 {

	public static void main(String[] args) {
		System.out.println("Main started executing");
//			userThread ut = new userThread();
//			daemonThread dt = new daemonThread();
//			dt.setDaemon(true);
//			ut.start();
//			dt.start();
//			System.out.println("Main completed execution");
		
			userThread ut = new userThread();
			String name = Thread.currentThread().getName();
			ut.setName("Developer Thread");
			ut.start();
			
			
	}

}
