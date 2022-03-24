package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MesosTest {
	
	@Test
	@DisplayName("Comprovar 12 Mesos")
	public void comprovarMesos() {
		
		Mesos any = new Mesos();		
		assertEquals(12, any.getMes().size());
	}
	
	@Test
	@DisplayName("Comprovar Null")
	void comprovarNull() {
		
		Mesos any = new Mesos();	
		assertNotNull(any.getMes());
	}
	
	@Test
	@DisplayName("Comprovar Agost mes 8")
	void comprovarAgost() {
		
		Mesos any = new Mesos();
		assertEquals("Agost", any.getMes().get(7));
	}

}
