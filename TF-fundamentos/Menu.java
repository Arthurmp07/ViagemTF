import java.util.Scanner;
public class Menu{
    public Menu(){

    }

    public static void getCadastroUsuarios(Scanner teclado){
        System.out.println("\n===== CADASTRO DE USUÁRIOS =====\n");

        System.out.println("Quantas pessoas participarão da viagem? ");
        int quantPessoas = teclado.nextInt();

        Usuario[] pessoa = new Usuario[quantPessoas];
        Usuario.cadastro(teclado, pessoa);

        System.out.println();
    }

    public static void getCadastroViagem(Scanner teclado){
        while(true){
            System.out.println("\n===== CADASTRO DE VIAGENS =====\n");

            System.out.println("Quantas  ");
            int quantPessoas = teclado.nextInt();

            Usuario[] pessoa = new Usuario[quantPessoas];
            Usuario.cadastro(teclado, pessoa);

            System.out.println();
        }
    }

    public void menuPrincipal(){
        while(true){
            System.out.println("\n===== MENU =====\n");

            System.out.println("1 - Adicionar Atividade");
            System.out.println("2 - Adicionar Acomodação");
        }
    }
}