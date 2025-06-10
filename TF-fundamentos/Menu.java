import java.util.Scanner;

public class Menu {
    public Menu() {
    }

    public static void getMenu1(Scanner teclado) {
        System.out.println("\n===== MENU =====\n");

        System.out.println("Quantas pessoas participarão da viagem? ");
        int quantPessoas = teclado.nextInt();

        Usuario[] pessoa = new Usuario[quantPessoas];
        Viagem[][] viagemUsuario = new Viagem[quantPessoas][];
        Atividade[][][] atividadesUsuario = new Atividade[quantPessoas][][];
        Acomodacao[][][] acomodacaoUsuario = new Acomodacao[quantPessoas][][];

        // Cadastro de usuários e viagens
        Usuario.getCadastro(teclado, pessoa);
        Viagem.getCadastro(teclado, pessoa, viagemUsuario, atividadesUsuario, acomodacaoUsuario);

        // Exibição do menu
        Menu.getMenuCadastrados(teclado, pessoa, viagemUsuario, atividadesUsuario, acomodacaoUsuario);
    }

    public static void getMenuCadastrados(Scanner teclado, Usuario[] pessoa, Viagem[][] viagemUsuario, Atividade[][][] atividadesUsuario, Acomodacao[][][] acomodacaoUsuario) {
        while (true) {
            System.out.println("\n===== MENU PRINCIPAL =====\n");
            System.out.println("1 - Verificar Usuários Cadastrados");
            System.out.println("2 - Verificar Viagens Cadastradas");
            int opc = teclado.nextInt();
            teclado.nextLine();

            switch (opc) {
                case 1:
                    Usuario.getUsuariosCadastrados(pessoa);
                    break;
                case 2:
                    Viagem.getViagensCadastradas(pessoa, viagemUsuario, atividadesUsuario, acomodacaoUsuario);
                    break;
            }

            System.out.print("\nVoltar ao menu? (S/N - Encerrar Programa) \n");
            String retornoMenu = "";
            while (!retornoMenu.equals("s") && !retornoMenu.equals("n")) {
                retornoMenu = teclado.nextLine().toLowerCase();
                switch (retornoMenu) {
                    case "s":
                        break;
                    case "n":
                        System.out.println("\nPrograma encerrado.\n");
                        System.exit(0);
                }
                if (!retornoMenu.equals("s") && !retornoMenu.equals("n")) {
                    System.out.println("\nDigite um comando válido.\n");
                }
            }
        }
    }
}
