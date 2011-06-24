package lesiones;

import java.util.HashMap;

import sintomas.Sintoma;

public class Lesion {

	private Sintoma dolor;
	private Sintoma ruido;
	private Sintoma zona;
	private Sintoma rigidez;
	private Sintoma estabilidad;
	private Sintoma inflamacion;

	public enum TipoLesion {
		LCA, LCP, LCAP, TENDINITIS, MENISCOS, ARTRITIS
	}

	private HashMap<TipoLesion, Integer> lesiones = new HashMap<TipoLesion, Integer>();

	public Lesion() {
	}

	public Lesion(Sintoma dolor, Sintoma ruido, Sintoma zona, Sintoma rigidez,
			Sintoma estabilidad, Sintoma inflamacion) {

		setDolor(dolor);
		setRuido(ruido);
		setZona(zona);
		setRigidez(rigidez);
		setEstabilidad(estabilidad);
		setInflamacion(inflamacion);
	}

	public void setDolor(Sintoma dolor) {
		this.dolor = dolor;
	}

	public Sintoma getDolor() {
		return dolor;
	}

	public void setRuido(Sintoma ruido) {
		this.ruido = ruido;
	}

	public Sintoma getRuido() {
		return ruido;
	}

	public void setZona(Sintoma zona) {
		this.zona = zona;
	}

	public Sintoma getZona() {
		return zona;
	}

	public void setRigidez(Sintoma rigidez) {
		this.rigidez = rigidez;
	}

	public Sintoma getRigidez() {
		return rigidez;
	}

	public void setEstabilidad(Sintoma estabilidad) {
		this.estabilidad = estabilidad;
	}

	public Sintoma getEstabilidad() {
		return estabilidad;
	}

	public void setInflamacion(Sintoma inflamacion) {
		this.inflamacion = inflamacion;
	}

	public Sintoma getInflamacion() {
		return inflamacion;
	}

	public HashMap<TipoLesion, Integer> getLesiones() {
		return lesiones;
	}

	/**
	 * Cuando se cumple una regla, es decir que hay un síntoma en particular
	 * presente, se incrementa en uno la cantidad de reglas cumplidas en la
	 * lesión correspondiente.
	 * 
	 * Por ejemplo: Si se cumple la regla DolorMuyAlto, se llama a este método
	 * indicando que LCAP debe ser incrementado en uno.
	 * 
	 */
	public void agregarNivelLesion(TipoLesion tipolesion) {
		int nuevoValor = 1;
		
		if (this.lesiones.containsKey(tipolesion))
			nuevoValor = this.lesiones.get(tipolesion).intValue() + 1;

		this.lesiones.put(tipolesion, nuevoValor);
	}
}
