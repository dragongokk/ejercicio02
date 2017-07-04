package es.cic.taller.ejercicio02;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testOperar() {
		Roberto_Kappa sut=new Roberto_Kappa();
	     assertEquals(2,sut.juas());
	}

}
