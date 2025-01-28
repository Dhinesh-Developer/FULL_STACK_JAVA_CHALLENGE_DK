package com.Dhinesh_Developer;

class Family implements Runnable{
	String resources1 = "play station";
	String resources2 = "controller";

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("kumar")== true) {
			kumarAcquiredResources();
		}else {
			dhineshAcquiredResources();
		}
				
	}

	private void dhineshAcquiredResources() {
		synchronized (resources1) {
			System.out.println("dhinesh acquired play station");
			try {
				Thread.sleep(2000);
				synchronized (resources2) {
					System.out.println("dhinesh acquired controller");
					Thread.sleep(2000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void kumarAcquiredResources() {
		synchronized (resources2) {
			System.out.println("Kumar acquired controller");
			try {
				Thread.sleep(2000);
				synchronized (resources1) {
					System.out.println("kumar acquires controller");
					Thread.sleep(2000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}

public class DAY45 {

	public static void main(String[] args) {
		Family f = new Family();
		Thread t1 = new Thread(f);
		Thread t2 = new Thread(f);
		
		t1.setName("kumar");
		t2.setName("dhinesh");
		
		t1.start();
		t2.start();
	}

}
