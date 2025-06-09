import java.util.Scanner;

public class Atividade {
    private int id;
    private String descricao;
    private double custoEstimado;
    private int viagem;
    Scanner teclado = new Scanner(System.in);

    public Atividade() {
        this.id = id;
        this.descricao = descricao;
        this.custoEstimado = custoEstimado;
        this.viagem = viagem;
    }

    public static Atividade[][] getCadastro(Atividade[][] atividade, int i, int j, int quantAtividades, Scanner teclado, Viagem[][] viagemUsuario){
        for (int h = 0; h < quantAtividades; h++) {
            System.out.println("\n----- ATIVIDADE " + (j + 1) + " -----\n");
            atividade[j][h] = new Atividade();
            atividade[j][h].setID(teclado);
            atividade[j][h].setDescricao(teclado);
            atividade[j][h].setCustoEstimado(teclado);
            atividade[j][h].setViagem(viagemUsuario, i, j);
        }
        return atividade;
    }

    public int getID() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getCustoEstimado() {
        return custoEstimado;
    }

    public int getViagem() {
        return viagem;
    }

    public void setID(Scanner teclado) {
        System.out.print("Digite o ID: ");
        this.id = teclado.nextInt();
        teclado.nextLine();

        System.out.println();
    }

    public void setDescricao(Scanner teclado) {
        System.out.print("Digite a descrição da atividade: ");
        this.descricao = teclado.nextLine();

        System.out.println();
    }

    public void setCustoEstimado(Scanner teclado) {
        System.out.print("Digite o custo estimado da atividade: ");
        this.custoEstimado = teclado.nextInt();
        teclado.nextLine();

        System.out.println();
    }

    public void setViagem(Scanner teclado) {
        this.viagem = viagem;
    }

    public void setViagem(Viagem[][] viagemUsuario, int i, int j) {
        this.viagem = viagemUsuario[i][j].getId();
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
        //System.out.println("viagem: " + viagem.getDestino());
    }
}
