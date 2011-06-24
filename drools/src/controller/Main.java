package controller;

import lesiones.Lesion;
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
		try {
			String path = "rules/ReglasLesiones.drl";
			ControladorReglas drools = new ControladorReglas(path);
			
			Lesion lesion = new Lesion();
			Sintoma dolor = new Dolor(Sintoma.Valor.ALTO);
			Sintoma ruido = new Ruido(Sintoma.Valor.CRUJIENTE);
			Sintoma zona = new Zona(Sintoma.Valor.ANTERIOR);
			Sintoma rigidez = new Rigidez(Sintoma.Valor.MEDIO);
			Sintoma estabilidad = new Estabilidad(Sintoma.Valor.BAJO);
			Sintoma inflamacion = new Inflamacion(Sintoma.Valor.ALTO);
			
			drools.setVariableGlobal("lesion", lesion);
			drools.insertarEnBase(dolor);
			drools.insertarEnBase(ruido);
			drools.insertarEnBase(zona);
			drools.insertarEnBase(rigidez);
			drools.insertarEnBase(estabilidad);
			drools.insertarEnBase(inflamacion);
			
			drools.analizarReglas();
			
			System.out.println(lesion.getLesiones());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
