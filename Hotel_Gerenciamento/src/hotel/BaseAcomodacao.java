package hotel;

public abstract class BaseAcomodacao implements Acomodacao, ServicoAdicional {
	
	 protected double diaria;

	    @Override
	    public double calcularDiaria() {
	        return diaria;
	    }

	    @Override
	    public void exibirDetalhes(int dias) {
	        double total = calcularDiaria() * dias;
	        System.out.printf("\n======== Valores ========\n");
	        System.out.printf("\nDiária: R$%.2f por %d dias, total: R$%.2f%n", calcularDiaria(), dias, total);
	    }

	    @Override
	    public double calcularServico(int numPessoas, boolean limpezaExtra, int dias) {
	        double custoCafe = numPessoas * 20.0 * dias; 
	        double custoLimpeza = limpezaExtra ? 30.0 * dias : 0;
	        return custoCafe + custoLimpeza;
	    }
	}
