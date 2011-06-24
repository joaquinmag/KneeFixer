package tests;

import junit.framework.Assert;
import junit.framework.TestCase;
import lesiones.*;
import sintomas.*;

public class Test extends TestCase {
	public void testCompararLesionConInflamacionAltoConSintomaInflamacionAlto(){
		Diagnostico l = new Diagnostico();
		try {
			l.setInflamacion(new Inflamacion(Sintoma.Valor.ALTO));
			Sintoma sintoma = new Inflamacion(Sintoma.Valor.ALTO);
			Assert.assertTrue(l.getInflamacion().equals(sintoma));
		} catch (ValorIncorrectoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testCompararLesionConInflamacionAltoConSintomaDolorAlto(){
		Diagnostico l = new Diagnostico();
		try {
			l.setInflamacion(new Inflamacion(Sintoma.Valor.ALTO));
			Sintoma sintoma = new Dolor(Sintoma.Valor.ALTO);
			Assert.assertFalse(l.getInflamacion().equals(sintoma));
		} catch (ValorIncorrectoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testInflamacionTomaValorIncorrecto(){
		Diagnostico l = new Diagnostico();
		try {
			l.setInflamacion(new Inflamacion(Sintoma.Valor.ANTERIOR));
			
		} catch (ValorIncorrectoException e) {
			Assert.assertTrue(true);
		}
	}
}
