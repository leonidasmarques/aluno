package entities;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double somaNota() {
		return nota1 + nota2 + nota3;
	}
	
	public String validaAprovacao() {
		double aux; 
		if(somaNota() > 60) {
			return "PASS";
		}else {
			aux = 60 - somaNota();
			return "RECUPERAÇÃO /nl FALTA" + aux + "PONTOS";
		}		
	}
	
	@Override
	public String toString() {
		return "RESULTADO FINAL =" + somaNota() + "\nl  " + validaAprovacao();
	}


	
	
}
