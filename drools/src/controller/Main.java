package controller;

import java.util.ArrayList;
import java.util.List;

import rules.ControladorReglas;
import sintomas.Dolor;
import sintomas.Estabilidad;
import sintomas.Inflamacion;
import sintomas.Rigidez;
import sintomas.Ruido;
import sintomas.Sintoma;
import sintomas.Zona;

public class Main {

	public static void main(String[] args) {

		List<Sintoma> sintomas = new ArrayList<Sintoma>();
		
		sintomas.add(new Dolor(Sintoma.Valor.ALTO));
		sintomas.add(new Ruido(Sintoma.Valor.CRUJIENTE));
		sintomas.add(new Zona(Sintoma.Valor.ANTERIOR));
		sintomas.add(new Rigidez(Sintoma.Valor.MEDIO));
		sintomas.add(new Estabilidad(Sintoma.Valor.BAJO));
		sintomas.add(new Inflamacion(Sintoma.Valor.ALTO));
		
		ControladorReglas reglas = new ControladorReglas(sintomas);
	}
}
