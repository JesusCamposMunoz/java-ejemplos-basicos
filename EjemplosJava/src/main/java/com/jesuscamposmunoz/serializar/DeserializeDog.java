package com.jesuscamposmunoz.serializar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializeDog {
  public static void main(String [] args) {
	    Collar c = new Collar(0);
	    Dog d = new Dog(c, 0);
	    System.out.println("before: collar size is "
	                       + d.getCollar().getCollarSize());

	    try {
	      FileInputStream fis = new FileInputStream("testSer.ser");
	      ObjectInputStream ois = new ObjectInputStream(fis);
	      d = (Dog) ois.readObject();
	      ois.close();
	    } catch (Exception e) { e.printStackTrace(); }
	 
	    System.out.println("after: collar size is "
	                       + d.getCollar() .getCollarSize());
	  }
}
