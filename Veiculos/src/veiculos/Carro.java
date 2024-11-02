package veiculos;

public class Carro extends Veiculo {
    
    public Carro(String placa, String marca, String modelo, int anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
    }

    @Override
    public double calcularIPVA() {
        int idade = 2024 - getAnoFabricacao(); 
        double valorEstimado = Math.max(0, 30000 - (idade * 2000)); 
        return valorEstimado * 0.04;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Carro: " + getMarca() + " " + getModelo() + " (" + getAnoFabricacao() + ")");
        System.out.println("Placa: " + getPlaca());
        System.out.println("IPVA: R$ " + calcularIPVA());
    }
}