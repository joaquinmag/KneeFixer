package sintomas;

public class Ruido extends Sintoma {
	
	public Ruido(Valor valor) throws ValorIncorrectoException{
		if(valor != Valor.CRUJIENTE && valor != Valor.RUIDOSECO && valor != Valor.NINGUNO)
			throw new ValorIncorrectoException();
		else
			this.setValor(valor);
	}
	
}
