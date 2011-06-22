package lesiones;

import sintomas.Sintoma;

public class Lesion {
	private Sintoma dolor;
	private Sintoma sonido;
	private Sintoma zona;
	private Sintoma rigidez;
	private Sintoma estabilidad;
	private Sintoma inflamacion;
	
	public Lesion(){}
	
	public Lesion(Sintoma dolor, Sintoma sonido, Sintoma zona, Sintoma rigidez, Sintoma estabilidad, Sintoma inflamacion){
		setDolor(dolor);
		setSonido(sonido);
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
	
	public void setSonido(Sintoma sonido) {
		this.sonido = sonido;
	}
	public Sintoma getSonido() {
		return sonido;
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
}
