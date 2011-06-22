package sintomas;

public abstract class Sintoma {
	public Sintoma() throws ValorIncorrectoException{}
	
	private Valor valor;
	
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
		FRONTAL
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
}
