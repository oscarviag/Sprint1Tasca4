package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculoDniTest {

	@ParameterizedTest
	@ValueSource(strings = { "42804826D", "12345678Z", "87654321X", "1357924G", "98765432M", "35936478J", "5434534W", "5434534W", "72439415H", "28401674D"})
	void dniComprobacio(String dni) {
		
		assertEquals(CalculoDni.calcularLletra((dni.substring(0, dni.length()-1))), dni.charAt(dni.length() - 1));
	}

}
