package es.cic.taller.ejercicio02;

import static org.junit.Assert.*;

import org.junit.Test;

public class Roberto_Kappa_test
{

	@Test
	public void test() {
		Roberto_Kappa sut=new Roberto_Kappa();
	     assertEquals(2,sut.juas());
	}

}
