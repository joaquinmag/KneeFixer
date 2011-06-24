package sintomas;

import java.util.ArrayList;

public abstract class Sintoma {
	public Sintoma() throws ValorIncorrectoException{
		this.setIncluidoEn(new ArrayList<String>());
	}
	
	public Valor valor;
	
	private ArrayList<String> incluidoEn;
	
	public enum Valor{
		BAJO,
		MEDIO,
		ALTO,
		MUYALTO,
		CRUJIENTE,
		RUIDOSECO,
		NINGUNO,
		ANTERIOR,
		POSTERIOR,
		AMBOS,
		FRONTAL,
        NORMAL,
        MUYBAJO
	}
	
	
	public boolean mismoSintoma(Sintoma sintoma){
		return (this.getValor() == sintoma.getValor() && this.getClass().equals(sintoma.getClass()));
	}


	public void setValor(Valor valor) {
		this.valor = valor;
	}


	public Valor getValor() {
		return valor;
	}


	public void setIncluidoEn(ArrayList<String> incluidoEn) {
		this.incluidoEn = incluidoEn;
	}


	public ArrayList<String> getIncluidoEn() {
		return incluidoEn;
	}
	
	public void AgregarSintomaIncluidoEn(String lesion){
		this.getIncluidoEn().add(lesion);
	}
}
