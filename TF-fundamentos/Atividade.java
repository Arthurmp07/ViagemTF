import java.util.Scanner;

public class Atividade {
    private int id;
    private String descricao;
    private double custoEstimado;
    private Viagem viagem;
    Scanner teclado = new Scanner(System.in);

    public Atividade(int id, String descricao, double custoEstimado, Viagem viagem) {
        this.id = id;
        this.descricao = descricao;
        this.custoEstimado = custoEstimado;
        this.viagem = viagem;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getCustoEstimado() {
        return custoEstimado;
    }

    public Viagem getviagem() {
        return viagem;
    }

    public void setId(Scanner teclado) {
        this.id = id;
    }

    public void setDescricao(Scanner teclado) {
        this.descricao = descricao;
    }

    public void setCustoEstimado(Scanner teclado) {
        this.custoEstimado = custoEstimado;
    }

    public void setviagem(Scanner teclado) {
        this.viagem = viagem;
    }

    public static double calcularCustoTotal(Atividade[] atividades) {
        double total = 0;
        for (int i = 0; i < atividades.length; i++) {
            total += atividades[i].getCustoEstimado();
        }
        return total;
    }

    public void exibiratividade() {
        System.out.println("id: " + id);
        System.out.println("descrição: " + descricao);
        System.out.println("custo: " + custoEstimado);
        System.out.println("viagem: " + viagem.getDestino());
    }
}
