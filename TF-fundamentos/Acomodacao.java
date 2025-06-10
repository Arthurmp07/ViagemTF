import java.util.Scanner;

public class Acomodacao {
    private int id;
    private String nome;
    private double custoDiario;
    private int diasReservados;
    private int viagem;
    private double custoEstadia;

    public Acomodacao() {
    }

    public static Acomodacao[][][] getCadastro(Acomodacao[][][] acomodacaoUsuario, int i, int j, int quantAcomodacao,
            Scanner teclado, Viagem[][] viagemUsuario) {
        for (int h = 0; h < quantAcomodacao; h++) {
            System.out.println("\n----- Acomodacao " + (h + 1) + " -----\n");
            acomodacaoUsuario[i][j][h] = new Acomodacao();
            acomodacaoUsuario[i][j][h].setID(teclado);
            acomodacaoUsuario[i][j][h].setNome(teclado);
            acomodacaoUsuario[i][j][h].setCustoDiario(teclado);
            acomodacaoUsuario[i][j][h].setDiasReservados(teclado);
            acomodacaoUsuario[i][j][h].setViagem(viagemUsuario, i, j);
        }
        return acomodacaoUsuario;
    }

    public static void getAcomodacaoCadastrada(Acomodacao[] acomodacao) {
        for (int h = 0; h < acomodacao.length; h++) {
            System.out.println("\n----- Acomodacao " + (h + 1) + " -----\n");
            acomodacao[h].exibirAcomodacao();
        }
    }

    public int getID() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getCustoEstadia() {
        return custoEstadia;
    }

    public int getViagem() {
        return viagem;
    }

    public void setID(Scanner teclado) {
        System.out.print("Digite o ID da Acomodacao: ");
        this.id = teclado.nextInt();
        teclado.nextLine();

        System.out.println();
    }

    public void setNome(Scanner teclado) {
        System.out.print("Digite o nome do local de acomodação: ");
        this.nome = teclado.nextLine();

        System.out.println();
    }

    public void setCustoDiario(Scanner teclado) {
        System.out.print("Digite o custo diário da acomodação: ");
        this.custoDiario = teclado.nextDouble();
        teclado.nextLine();

        System.out.println();
    }

    public void setDiasReservados(Scanner teclado) {
        System.out.print("Digite a quantidade de dias reservados: ");
        this.diasReservados = teclado.nextInt();
        teclado.nextLine();

        System.out.println();
    }

    public void setCustoEstadia() {
        custoEstadia = custoDiario * diasReservados;
    }

    public void setViagem(Viagem[][] viagemUsuario, int i, int j) {
        this.viagem = viagemUsuario[i][j].getId();
    }

    public void exibirAcomodacao() {
        System.out.println("ID: " + id);
        System.out.println("Descrição: " + nome);
        System.out.println("Custo estadia: R$ " + custoEstadia);
        System.out.println("ID da viagem associada: " + viagem);
    }

}
