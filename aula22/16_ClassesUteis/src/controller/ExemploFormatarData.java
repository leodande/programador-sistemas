package controller;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ExemploFormatarData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date data = new Date();
		System.out.println("Data " + data);
		
		@Deprecated
		Date dataInserida = new Date(2001, 9, 14);
		System.out.println("Data Inserida " + dataInserida);
		
		Calendar data2 = new GregorianCalendar();
		System.out.println("Data: " + data2);
		
		data2.set(2011, 3, 19);
		System.out.println("Mês : " + data2.get(Calendar.MONTH));
		System.out.println("Dia da Semana: " + data2.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("Dia do Mês: " + data2.get(Calendar.DAY_OF_WEEK));
		System.out.println("Dia do Ano: " + data2.get(Calendar.DAY_OF_WEEK));
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL);
		Calendar data3 = new GregorianCalendar();
		data3.set(2010, 8, 25);
		
		System.out.println("Data 3 (FULL) : " + df3.format(data3.getTime())); 
		
	}

}
