public class Viagem {
    private int id;
    private String destino;
    private String dataInicio;
    private String dataFim;
    private Usuario usuario;

    public Viagem(int id, String destino, String dataInicio, String dataFim, Usuario usuario) {
        this.id = id;
        this.destino = destino;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.usuario = usuario;
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

    public Usuario getusuario() {
        return usuario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public void setusuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void exibirViagem() {
        System.out.println("ID: " + id);
        System.out.println("Destino: " + destino);
        System.out.println("Início: " + dataInicio);
        System.out.println("Fim: " + dataFim);
        System.out.println("Usuário Responsável: " + usuario.getNome());

    }
}
