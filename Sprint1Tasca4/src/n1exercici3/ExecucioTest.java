package n1exercici3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExecucioTest {
	
	@Test
	@DisplayName("Provoca ArrayIndexOutOfBoundsException Esperat")
    void exceptionTest() {
		
		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
				{Execucio.mostrar();
	}, "Fora de rang esperat");}

}
