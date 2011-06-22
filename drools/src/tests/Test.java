package tests;

import junit.framework.Assert;
import junit.framework.TestCase;
import lesiones.*;
import sintomas.*;

public class Test extends TestCase {
	public void testCompararLesionConInflamacionAltoConSintomaInflamacionAlto(){
		Lesion l = new Lesion();
		try {
			l.setInflamacion(new Inflamacion(Sintoma.Valor.ALTO));
			Sintoma sintoma = new Inflamacion(Sintoma.Valor.ALTO);
			Assert.assertTrue(l.getInflamacion().mismoSintoma(sintoma));
		} catch (ValorIncorrectoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testCompararLesionConInflamacionAltoConSintomaDolorAlto(){
		Lesion l = new Lesion();
		try {
			l.setInflamacion(new Inflamacion(Sintoma.Valor.ALTO));
			Sintoma sintoma = new Dolor(Sintoma.Valor.ALTO);
			Assert.assertFalse(l.getInflamacion().mismoSintoma(sintoma));
		} catch (ValorIncorrectoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testInflamacionTomaValorIncorrecto(){
		Lesion l = new Lesion();
		try {
			l.setInflamacion(new Inflamacion(Sintoma.Valor.ANTERIOR));
			
		} catch (ValorIncorrectoException e) {
			Assert.assertTrue(true);
		}
	}
}
