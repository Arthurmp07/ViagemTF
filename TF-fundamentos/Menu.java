import java.util.Scanner;

public class Menu {
    public Menu() {

    }

    public static void getMenu1(Scanner teclado){
        System.out.println("\n===== MENU =====\n");

        System.out.println("Quantas pessoas participarão da viagem? ");
        int quantPessoas = teclado.nextInt();

        Usuario[] pessoa = new Usuario[quantPessoas];
        Viagem[][] viagemUsuario = new Viagem[quantPessoas][];

        Menu.getCadastroUsuarios(teclado, pessoa);
        Menu.getCadastroViagem(teclado, pessoa, viagemUsuario);
    }

    public static void getCadastroUsuarios(Scanner teclado, Usuario[] pessoa) {
        Usuario.getCadastro(teclado, pessoa);
    }

    public static void getCadastroViagem(Scanner teclado, Usuario[] pessoa, Viagem[][] viagemUsuario) {
        Viagem.getCadastro(teclado, pessoa, viagemUsuario);
    }

    public void getMenuCadastrados(Scanner teclado, Usuario[] pessoa, Viagem[][] viagemUsuario) {
        System.out.println("\n===== MENU PRINCIPAL =====\n");
        System.out.println("1 - Verificar Usuários Cadastrados");
        System.out.println("2 - Verificar Viagens Cadastradas");
        int opc = teclado.nextInt();

        switch (opc) {
            case 1:
        }
    }
}