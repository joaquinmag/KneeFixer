package rules;

import java.util.List;

import lesiones.TipoLesion;

import sintomas.Diagnostico;
import sintomas.Sintoma;

public class ControladorReglas {

	private List<Sintoma> sintomas;
	
	public ControladorReglas(List<Sintoma> sintomas) {
		this.sintomas = sintomas;
	}

	/**
	 * Analiza las reglas y determina las posibles lesiones.
	 */
	public List<TipoLesion> ejecutar(){
		String path = "rules/ReglasSintomas.drl";
		Drools drools = new Drools(path);
		
		Diagnostico diagnostico = new Diagnostico();
		drools.setVariableGlobal("lesion", diagnostico);

		for (Sintoma sintoma : sintomas)
			drools.insertarEnBase(sintoma);
		
		drools.analizarReglas();
		
		return diagnostico.getPosibleLesiones();
	}
}
