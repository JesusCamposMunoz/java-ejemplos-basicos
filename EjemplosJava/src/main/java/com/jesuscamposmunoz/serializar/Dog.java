package com.jesuscamposmunoz.serializar;

import java.io.Serializable;

class Dog implements Serializable {
	   private Collar theCollar;
	   private int dogSize;
	   public Dog(Collar collar, int size) {
	     theCollar = collar;
	     dogSize = size;
	   }
	   public Collar getCollar() { return theCollar; }
	}
