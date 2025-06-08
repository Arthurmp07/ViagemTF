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

        //chamada de métodos para cadastro de usuários e viagens
        Usuario.getCadastro(teclado, pessoa);
        Viagem.getCadastro(teclado, pessoa, viagemUsuario);

        //chamada do método para visualizar o que foi cadastrado
        Menu.getMenuCadastrados(teclado, pessoa, viagemUsuario);
    }

    public static void getMenuCadastrados(Scanner teclado, Usuario[] pessoa, Viagem[][] viagemUsuario) {
        while(true) {
            System.out.println("\n===== MENU PRINCIPAL =====\n");
            System.out.println("1 - Verificar Usuários Cadastrados");
            System.out.println("2 - Verificar Viagens Cadastradas");
            int opc = teclado.nextInt();
            teclado.nextLine();

            switch (opc) {
                case 1:
                    Usuario.getUsuariosCadastrados(pessoa);
                    break;
                case 2: Viagem.getViagensCadastradas(pessoa, viagemUsuario);
                break;
            }

            System.out.print("\nVoltar ao menu? (S/N - Encerrar Programa) \n");
            String retornoMenu = "";
            retornoMenu = retornoMenu.toLowerCase();

            while(!retornoMenu.equals("s") && !retornoMenu.equals("n")) {
                retornoMenu = teclado.nextLine();
                switch (retornoMenu) {
                    case "s":
                        continue;
                    case "n":
                        System.out.println("\nPrograma encerrado.\n");
                        System.exit(0);
                }
                System.out.println("\nDigite um comando válido.\n");
            }
        }
    }
}