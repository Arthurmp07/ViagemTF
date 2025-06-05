import java.util.Scanner;

public class Menu {
    public Menu() {

    }

    public static void getMenu1(Scanner teclado){
        System.out.println("\n===== MENU =====\n");

        System.out.println("Quantas pessoas participarão da viagem? ");
        int quantPessoas = teclado.nextInt();

        Usuario[] pessoa = new Usuario[quantPessoas];
        Viagem[] viagem = new Viagem[quantPessoas];

        Menu.getCadastroUsuarios(teclado, pessoa);
        Menu.getCadastroViagem(teclado, pessoa, viagem);
    }

    public static void getCadastroUsuarios(Scanner teclado, Usuario[] pessoa) {
        Usuario.getCadastro(teclado, pessoa);
    }

    public static void getCadastroViagem(Scanner teclado, Usuario[] pessoa, Viagem[] viagem) {
        while (true) {
            System.out.println("\n===== CADASTRO DE VIAGENS =====\n");

            System.out.println("Qual usuário deseja cadastrar uma viagem? Utilize o ID para identificá-lo: ");
            int idTeste = teclado.nextInt();

            System.out.println("Quantas viagens esse usuário deseja fazer? ");
            int quantViagens = teclado.nextInt();

            Viagem[] viagemUsuario = new Viagem[quantViagens];

            for(int i=0; i<viagemUsuario.length; i++ ){
                for(int j=0;j<pessoa.length;j++){
                    if(idTeste == pessoa[j].getId()){
                        System.out.println("Usuário: "+pessoa[j].getNome());
                        
                    }
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
