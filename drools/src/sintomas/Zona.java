package sintomas;

public class Zona extends Sintoma {
	
	public Zona(Valor valor) throws ValorIncorrectoException{
		if(valor != Valor.ANTERIOR && valor != Valor.POSTERIOR && valor != Valor.AMBOS && valor != Valor.NINGUNO)
			throw new ValorIncorrectoException();
		else
			this.setValor(valor);
	}

}
