import java.util.Scanner;

public class Usuario {
    private int id;
    private String email, nome;

    // int id, String nome, String email
    public Usuario() {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public static void cadastro(Scanner teclado, Usuario[] pessoa) {
        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("===== USUÁRIO " + (i + 1) + " =====\n");
            pessoa[i] = new Usuario();
            pessoa[i].setId(teclado);
            pessoa[i].setNome(teclado);
            pessoa[i].setEmail(teclado);
        }
    }

    public static void usuariosCadastrados(Usuario[] pessoa) {
        System.out.println("\n===== USUÁRIOS CADASTRADOS =====\n");

        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("===== USUÁRIO " + (i + 1) + " =====\n");
            System.out.println("ID: " + pessoa[i].getId());
            System.out.println("Nome: " + pessoa[i].getNome());
            System.out.println("Email: " + pessoa[i].getEmail());
            
            System.out.println();
        }
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Scanner teclado) {
        System.out.println("Digite o ID: ");
        this.id = teclado.nextInt();
        teclado.nextLine();

        System.out.println();
    }

    public void setNome(Scanner teclado) {
        System.out.println("Digite o nome: ");
        this.nome = teclado.nextLine();

        System.out.println();
    }

    public void setEmail(Scanner teclado) {
        System.out.println("Digite o email: ");
        this.email = teclado.nextLine();

        System.out.println();
    }
}
