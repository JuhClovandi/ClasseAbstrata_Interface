package veiculos;

public class Caminhao extends Veiculo {

    public Caminhao(String placa, String marca, String modelo, int anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
    }

    @Override
    public double calcularIPVA() {
        int idade = 2024 - getAnoFabricacao();
        double valorEstimado = Math.max(0, 60000 - (idade * 5000)); 
        return valorEstimado * 0.015;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Caminhão: " + getMarca() + " " + getModelo() + " (" + getAnoFabricacao() + ")");
        System.out.println("Placa: " + getPlaca());
        System.out.println("IPVA: R$ " + calcularIPVA());
    }
}