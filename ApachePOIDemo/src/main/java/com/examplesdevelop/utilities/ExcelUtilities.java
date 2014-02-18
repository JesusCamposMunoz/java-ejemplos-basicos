package com.examplesdevelop.utilities;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;

public final class ExcelUtilities {
	//Esta clase ha de ser final para que nadie nos la modifique y debe tener constructor privado.
	
	private ExcelUtilities(){
		
	}
	
	public static byte[] createTestExcel(boolean isXLSX) throws IOException{
		
		Workbook excel = isXLSX ?  new XSSFWorkbook() :  new HSSFWorkbook();
		//Nos creamos el libro de trabajo de EXCEL.
		//Apunto de forma polim�rfica al objeto con la interficie a la que pertenece.
//		Workbook excel = new XSSFWorkbook();
		//Si queremos fabricarlos en otro formato s�lo hay que poner:
		//Workbook excel = new XSSFWorkbook();
		//y no cambiar�a nada de c�digo.
		
		//Le agregamos al libro las hojas de c�lculo.
		//Al crear el libro de manera HSSF nos crear� la hoja de ese tipo.
		Sheet sheet1 = excel.createSheet("Hoja de c�lculo 1");
		Sheet sheet2 = excel.createSheet("Hoja de c�lculo 2");
		Sheet sheet3 = excel.createSheet("Hoja de c�lculo 3");
		
		
		//Nos creamos los estilos a usar en las celdas.
			//Libro EXCEL, me quiero crear una fuente.
		Font headerFont = excel.createFont();
		headerFont.setFontHeightInPoints((short)10); //Tama�o en puntos en lugar de p�xels.
//		headerFont.setColor(HSSFColor.WHITE.index);
		headerFont.setColor(HSSFColor.BRIGHT_GREEN.index);
		headerFont.setItalic(true);
		headerFont.setBoldweight(Font.BOLDWEIGHT_BOLD);
		
		CellStyle headerStyle = excel.createCellStyle();
		headerStyle.setAlignment(CellStyle.ALIGN_CENTER);
//		headerStyle.setFillBackgroundColor(HSSFColor.BLACK.index);//Aunque sea HSSFColor, tambi�n vale para XSSFColor.
		//El black es un formato raro por eso hay que indicarle index.
//		headerStyle.setFillBackgroundColor(HSSFColor.RED.index);
		headerStyle.setFillForegroundColor(HSSFColor.CORAL.index);
		//Te dicen que los dos te hacen los mismo, pero se usa el foreground.
		headerStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);//Formato de relleno y color de fondo.
		headerStyle.setFont(headerFont); //Primero debemos haber creado una fuente.
		
		//Luego hay que ir celda por celda aplicando el estilo.
		
		
		
		//En la hoja de c�lculo 1 montamos su tabla de datos.
		int rowNum = 0;
		
		//Fabricamos la fila rowNum.
		Row row = sheet1.createRow(rowNum);
		//Nos devuelve el objeto fila asociado.
		
		Cell cell = row.createCell(0);
		//Nos devuelve el objeto celda.
		
		//Y ahora ponemos un valor a la celda.
		cell.setCellValue("Header 1");
		
		//Ahora le aplico el estilo a la celda.
		cell.setCellStyle(headerStyle);
		
		//Como te los deja refernciados en la variable row, podemos ir machacando la variable cell.
		//Entrar�amos en sheet.getRow(int x).-> Por eso no lo perdemos y nos vale con una variable que apunte a todo.
		cell = row.createCell(1);
		cell.setCellValue("Header 2");
		cell.setCellStyle(headerStyle);
		
		cell = row.createCell(2);
		cell.setCellValue("Header 3");
		cell.setCellStyle(headerStyle);
		
		cell = row.createCell(3);
		cell.setCellValue("Header 4");
		cell.setCellStyle(headerStyle);
		
		//Rellenamos el resto de datos.
		for (rowNum = 1; rowNum < 10; rowNum++){
			//Vamos a dar de alta una serie de filas hardcodeadas.
			row = sheet1.createRow(rowNum);
			
			cell = row.createCell(0);
			cell.setCellValue(Math.random());
			
			cell = row.createCell(1);
			cell.setCellValue(Math.random());
			
			cell = row.createCell(2);
			cell.setCellValue(Math.random());
			
			cell = row.createCell(3);
			cell.setCellValue(Math.random());
		}
		
		//Hemos montado el documento. Hay que decirle el ancho de las celdas.
		sheet1.autoSizeColumn(0);	//Que se ajuste el tama�o al contenido.
		sheet1.autoSizeColumn(1);
		sheet1.autoSizeColumn(2);
		sheet1.autoSizeColumn(3);
		
		//Obtenemos la representaci�n en bytes del documento EXCEL.
		ByteArrayOutputStream excelBinary = new ByteArrayOutputStream();
		
		excel.write(excelBinary);	//esta operaci�n puede lanzar una IOException.
		
		return excelBinary.toByteArray();	//Le pedimos que nos devuelva la representaci�n binaria.
		
	}
}
