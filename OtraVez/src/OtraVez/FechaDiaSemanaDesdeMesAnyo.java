package OtraVez;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class FechaDiaSemanaDesdeMesAnyo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el mes y año (YYYY-MM)");
		YearMonth anyoMes = YearMonth.parse(sc.next());
		
		System.out.println("Introduce el día del mes: ");
		int diaMes = sc.nextInt();
		
		LocalDate fecha = anyoMes.atDay(diaMes);
		DayOfWeek diaSemana = fecha.getDayOfWeek();
		
		System.out.println("El "+diaMes+ " de "+ anyoMes.format(DateTimeFormatter.ofPattern("MMMM yyyy")+
				 " es un "+diaSemana.getDisplayName(TextStyle.FULL, Locale.getDefault())));
		
	}

}
