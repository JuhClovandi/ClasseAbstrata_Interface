package veiculos;

public class Main {
    public static void main(String[] args) {
    	 Veiculo carro = new Carro("ABC-1234", "Volkswagen", "Gol", 2015);
         Veiculo caminhao = new Caminhao("DEF-5678", "Mercedes-Benz", "Actros", 2018);
         Veiculo onibus = new Onibus("GHI-9101", "Marcopolo", "Paradiso G7", 2020);
         
        // Exibindo detalhes de cada veículo
        carro.exibirDetalhes();
        System.out.println();
        caminhao.exibirDetalhes();
        System.out.println();
        onibus.exibirDetalhes();
    }
}