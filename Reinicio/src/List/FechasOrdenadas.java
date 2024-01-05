package List;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FechasOrdenadas {

	public static void main(String[] args) {
		List<LocalDate> fechas = new ArrayList<>();
		fechas.add(LocalDate.of(2023, 1, 15));
		fechas.add(LocalDate.of(2023, 3, 8));
		fechas.add(LocalDate.of(2023, 2, 1));
		
		Collections.sort(fechas);
		
		System.out.println("Fechas ordenadas: "+fechas);
		
	}

}
