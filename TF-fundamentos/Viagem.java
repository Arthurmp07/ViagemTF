import java.util.Scanner;

public class Viagem {
    private int id;
    private String destino;
    private String dataInicio;
    private String dataFim;
    private int usuario;

    public Viagem() {
    }

    public static Viagem[][] getCadastro(Scanner teclado, Usuario[] pessoa, Viagem[][] viagemUsuario,
            Atividade[][][] atividadesUsuario, Acomodacao[][][] acomodacaoUsuario) {
        System.out.println("\n===== CADASTRO DE VIAGENS =====\n");
        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("===== USUÁRIO " + (i + 1) + " =====\n");

            System.out.println("Informe a quantidade de viagens que o usuário fará: ");
            int quantViagens = teclado.nextInt();
            teclado.nextLine();

            viagemUsuario[i] = new Viagem[quantViagens];
            atividadesUsuario[i] = new Atividade[quantViagens][];
            acomodacaoUsuario[i] = new Acomodacao[quantViagens][];

            for (int j = 0; j < quantViagens; j++) {
                System.out.println("\n----- VIAGEM " + (j + 1) + " -----\n");
                viagemUsuario[i][j] = new Viagem();
                viagemUsuario[i][j].setId(teclado);
                viagemUsuario[i][j].setDestino(teclado);
                viagemUsuario[i][j].setDataInicio(teclado);
                viagemUsuario[i][j].setDataFim(teclado);
                viagemUsuario[i][j].setUsuario(teclado, pessoa, i);

                System.out.println("Informe a quantidade de atividades para essa viagem:");
                int quantAtividades = teclado.nextInt();
                teclado.nextLine();

                atividadesUsuario[i][j] = new Atividade[quantAtividades];
                
                Atividade.getCadastro(atividadesUsuario, i, j, quantAtividades, teclado, viagemUsuario);

                System.out.println("Informe a quantidade de acomodações para essa viagem:");
                int quantAcomodacao = teclado.nextInt();
                teclado.nextLine();

                acomodacaoUsuario[i][j] = new Acomodacao[quantAcomodacao];

                Acomodacao.getCadastro(acomodacaoUsuario, i, j, quantAcomodacao, teclado, viagemUsuario);
            }
        }

        System.out.println("\nCadastro de viagens realizado com sucesso!\n");

        return viagemUsuario;
    }

    public static void getViagensCadastradas(Usuario[] pessoa, Viagem[][] viagemUsuario, Atividade[][][] atividadesUsuario, Acomodacao[][][] acomodacaoUsuario) {
        System.out.println("\n===== VIAGENS CADASTRADAS =====\n");
        for (int i = 0; i < pessoa.length; i++) {
            if(viagemUsuario.length == 1){
                System.out.println("USUÁRIO " + (i + 1) + ": " + viagemUsuario[i].length + " viagem");
            } else{
                System.out.println("USUÁRIO " + (i + 1) + ": " + viagemUsuario[i].length + " viagens");
            }

            for (int j = 0; j < viagemUsuario[i].length; j++) {
                System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-\n");
                System.out.println("\n----- VIAGEM " + (j + 1) + " -----\n");
                System.out.println("ID: " + viagemUsuario[i][j].getId());
                System.out.println("Destino: " + viagemUsuario[i][j].getDestino());
                System.out.println("Data de Início: " + viagemUsuario[i][j].getDataInicio());
                System.out.println("Data de Fim: " + viagemUsuario[i][j].getDataFim());
                System.out.println("ID do Usuário: " + viagemUsuario[i][j].getUsuario());

                Atividade[] atividades = atividadesUsuario[i][j];

                Atividade.getAtividadesCadastradas(atividades);

                Acomodacao[] acomodacoes = acomodacaoUsuario[i][j];

                Acomodacao.getAcomodacaoCadastrada(acomodacoes);

                System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-\n");
            }
        }
    }
    

    public int getId() {
        return id;
    }

    public String getDestino() {
        return destino;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setId(Scanner teclado) {
        System.out.print("Digite o ID da viagem: ");
        this.id = teclado.nextInt();
        teclado.nextLine();

        System.out.println();
    }

    public void setDestino(Scanner teclado) {
        System.out.print("Digite o destino: ");
        this.destino = teclado.nextLine();

        System.out.println();
    }

    public void setDataInicio(Scanner teclado) {
        System.out.print("Digite a data de início: ");
        this.dataInicio = teclado.nextLine();

        System.out.println();
    }

    public void setDataFim(Scanner teclado) {
        System.out.print("Digite a data de término: ");
        this.dataFim = teclado.nextLine();

        System.out.println();
    }

    public void setUsuario(Scanner teclado, Usuario[] pessoa, int i) {
        this.usuario = pessoa[i].getId();
    }
}
