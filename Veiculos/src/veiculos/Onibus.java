package veiculos;

public class Onibus extends Veiculo {

    public Onibus(String placa, String marca, String modelo, int anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
    }

    @Override
    public double calcularIPVA() {
        int idade = 2024 - getAnoFabricacao();
        double valorEstimado = Math.max(0, 80000 - (idade * 3000)); 
        return valorEstimado * 0.02;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Ônibus: " + getMarca() + " " + getModelo() + " (" + getAnoFabricacao() + ")");
        System.out.println("Placa: " + getPlaca());
        System.out.println("IPVA: R$ " + calcularIPVA());
    }
}

