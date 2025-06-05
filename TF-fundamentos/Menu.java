import java.util.Scanner;

public class Menu {
    public Menu() {

    }

    public static void getMenu1(Scanner teclado){
        System.out.println("\n===== MENU =====\n");

        System.out.println("Quantas pessoas participarão da viagem? ");
        int quantPessoas = teclado.nextInt();

        Usuario[] pessoa = new Usuario[quantPessoas];

        Menu.getCadastroUsuarios(teclado, pessoa);
        Menu.getCadastroViagem(teclado, pessoa);
    }

    public static void getCadastroUsuarios(Scanner teclado, Usuario[] pessoa) {
        Usuario.getCadastro(teclado, pessoa);
    }

    public static void getCadastroViagem(Scanner teclado, Usuario[] pessoa) {
        while (true) {
            System.out.println("\n===== CADASTRO DE VIAGENS =====\n");

            System.out.println("Qual usuário deseja cadastrar uma viagem? Utilize o ID para identificá-lo: ");
            int idTeste = teclado.nextInt();

            for(int i=0;i<pessoa.length;i++){
                if(idTeste == pessoa[i].getId()){
                    System.out.println("Usuário: "+pessoa[i].getNome());
                    
                }
            }
        }
    }

    public void menuPrincipal() {
        while (true) {
            System.out.println("\n===== MENU =====\n");

            System.out.println("1 - Adicionar Atividade");
            System.out.println("2 - Adicionar Acomodação");
        }
    }
}
