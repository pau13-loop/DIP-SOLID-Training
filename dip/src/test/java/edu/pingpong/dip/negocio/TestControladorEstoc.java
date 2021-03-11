package edu.pingpong.dip.negocio;

import org.junit.Assert;
import org.junit.Test;

import edu.pingpong.dip.bbdd.InventarioBBDD;

public class TestControladorEstoc {

	@Test
	public void test_control_estoc() {
		ControladorEstoc controlador = new ControladorEstoc(new InventarioBBDD());
		
		Assert.assertFalse(controlador.necesitaReponer("tienda norte", "mesa"));
		Assert.assertTrue(controlador.necesitaReponer("tienda norte", "lampara"));

	}

}
