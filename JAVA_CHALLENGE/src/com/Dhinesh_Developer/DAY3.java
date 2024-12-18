package com.Dhinesh_Developer;

/* DAY 3
 *  OBJECT ORIENTATION
 *  orientation :
 	way of lokking or perspective.
 *  Object orientation :
 *  	object orientation is an perspective of looking at the world as 
 *  	a collection of object.
 *  
 *  classes (type) are imaginary. class is an state or property [has part]  -> data types.
 *  object (action) are real.  object is an behaviour   [does part]  -> methods.

   to create a object.
     Activatiing a jvm  to create a object   using a  "new " keyword.
 */

class car{
	String name;
	int cost;
	String brand;
	
	void start() {
		System.out.println("car started");
	}
	void acclerate() {
		System.out.println("car running");
	}
	void stop() {
		System.out.println("car stopped");
	}
}
public class DAY3 {
	public static void main(String[] args) {
		
		car car = new car();
		car.start();
		car.acclerate();
		car.stop();
		
	}

}
