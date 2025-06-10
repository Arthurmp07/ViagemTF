import java.util.Scanner;

public class Atividade {
    private int id;
    private String descricao;
    private double custoEstimado;
    private int viagem;

    public Atividade() {
    }

    public static Atividade[][][] getCadastro(Atividade[][][] atividade, int i, int j, int quantAtividades,
            Scanner teclado, Viagem[][] viagemUsuario) {
        for (int h = 0; h < quantAtividades; h++) {
            System.out.println("\n----- ATIVIDADE " + (h + 1) + " -----\n");
            atividade[i][j][h] = new Atividade();
            atividade[i][j][h].setID(teclado);
            atividade[i][j][h].setDescricao(teclado);
            atividade[i][j][h].setCustoEstimado(teclado);
            atividade[i][j][h].setViagem(viagemUsuario, i, j);
        }
        return atividade;
    }

    public static void getAtividadesCadastradas(Atividade[] atividades) {
        for (int h = 0; h < atividades.length; h++) {
            System.out.println("\n----- ATIVIDADE " + (h + 1) + " -----\n");
            atividades[h].exibiratividade();
        }
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
        System.out.print("Digite o ID da atividade: ");
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
        this.custoEstimado = teclado.nextDouble();
        teclado.nextLine();

        System.out.println();
    }

    public void setViagem(Viagem[][] viagemUsuario, int i, int j) {
        this.viagem = viagemUsuario[i][j].getId();
    }

    public void exibiratividade() {
        System.out.println("ID: " + id);
        System.out.println("Descrição: " + descricao);
        System.out.println("Custo estimado: R$ " + custoEstimado);
        System.out.println("ID da viagem associada: " + viagem);
    }
}
