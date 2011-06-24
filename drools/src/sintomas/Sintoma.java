package sintomas;

public abstract class Sintoma {
	
	public Sintoma() throws ValorIncorrectoException{
	}
	
	public Valor valor;
	
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
	
	@Override
	public boolean equals(Object obj){
		Sintoma sintoma = (Sintoma) obj;
		return (this.valor == sintoma.valor && this.getClass().equals(sintoma.getClass()));
	}

	public void setValor(Valor valor) {
		this.valor = valor;
	}

	public Valor getValor() {
		return valor;
	}
}
