package rules;

import java.util.List;

import lesiones.TipoLesion;

import sintomas.Diagnostico;
import sintomas.Sintoma;

public class ControladorReglas {

	public ControladorReglas(List<Sintoma> sintomas) {
		Diagnostico lesion = ejecutarReglasSintomas(sintomas);
		System.out.println(lesion.getLesiones());
	}

	private Diagnostico ejecutarReglasSintomas(List<Sintoma> sintomas) {
		String path = "rules/ReglasSintomas.drl";
		Drools drools = new Drools(path);
		
		Diagnostico lesion = new Diagnostico();
		drools.setVariableGlobal("lesion", lesion);

		for (Sintoma sintoma : sintomas)
			drools.insertarEnBase(sintoma);
		
		drools.analizarReglas();
		
		return lesion;
	}
		
	public TipoLesion getPosiblesLesiones(){
		return null;
	}
}
