package com.jesuscamposmunoz.ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteInFile2 {
	public static void main(String[] args) {
        FileWriter fichero = null;
        PrintWriter pw = null;
		try {
            fichero = new FileWriter("ficheroCreadoDesdeJavaProg2.txt");
            pw = new PrintWriter(fichero);
 
            for (int i = 0; i < 10; i++)
            {
                pw.println("Linea " + i);
            }
            fichero.close();
		} catch (Exception e) {
			if(fichero != null){
				try {
					fichero.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			// TODO: handle exception
			System.out.println("ERROR");
		}
	}
}
