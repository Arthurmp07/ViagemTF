import java.util.Scanner;

public class Acomodacao {
    private int id;
    private String nome;
    private double custoDiario;
    private int diasReservados;
    private Viagem viagem;
    Scanner teclado = new Scanner(System.in);

    public Acomodacao(int id, String nome, double custoDiario, int diasReservados, Viagem viagem) {
        this.id = id;
        this.nome = nome;
        this.custoDiario = custoDiario;
        this.diasReservados = diasReservados;
        this.viagem = viagem;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getcustoDiario() {
        return custoDiario;
    }

    public int diasReservados() {
        return diasReservados;
    }

    public Viagem viagem() {
        return viagem;
    }

    public void setId(Scanner teclado) {
        this.id = id;
    }

    public void setNome(Scanner teclado) {
        this.nome = nome;
    }

    public void setcustoDiario(Scanner teclado) {
        this.custoDiario = custoDiario;
    }

    public void setdiasReservados(Scanner teclado) {
        this.diasReservados = diasReservados;
    }

    public void setviagem(Scanner teclado) {
        this.viagem = viagem;
    }

    public double calcularCustoTotal(){
        return custoDiario * diasReservados;
    }

    public void exibirAcomodacao(){
       System.out.println("ID: " + id);
       System.out.println("Nome: " + nome);
       System.out.println("Custo Diário: R$" + custoDiario);
       System.out.println("Dias Reservados: " + diasReservados);
       System.out.println("Custo Total: R$" + calcularCustoTotal());
       System.out.println("Destino da Viagem: " + viagem.getDestino());
    }

    

}
