import java.util.Scanner;

public class Orcamento {
    private Viagem viagem;
    private double totalGasto;

    public Orcamento(Viagem viagem, double totalGasto) {
        this.totalGasto = totalGasto;
        this.viagem = viagem;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public double gettotalGasto() {
        return totalGasto;
    }

    public void setViagem(Scanner teclado) {
        this.viagem = viagem;
    }

    public void settotalGasto(Scanner teclado) {
        this.totalGasto = totalGasto;
    }

    public void calcularTotal(Atividade[] atividades) {
        double totalAtividades = 0;
        double custoAcomodacoes = 0;

        for (int i = 0; i < atividades.length; i++) {
            totalAtividades += atividades[i].getCustoEstimado();
        }

        this.totalGasto = totalAtividades + custoAcomodacoes;
    }

    public void exibirOrcamento() {
        System.out.println("Destino da Viagem: " + viagem.getDestino());
        System.out.println("Total Gasto: R$" + totalGasto);
    }

}