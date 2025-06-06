    import java.util.Scanner;

    public class Viagem {
        private int id;
        private String destino;
        private String dataInicio;
        private String dataFim;
        private int usuario;

        public Viagem() {
        }

        public static Viagem[][] getCadastro(Scanner teclado, Usuario[] pessoa, Viagem[][] viagemUsuario){
            System.out.println("\n===== CADASTRO DE VIAGENS =====\n");
            for(int i=0;i<pessoa.length;i++) {
                System.out.println("===== USUÁRIO " + (i + 1) + " =====\n");

                System.out.println("Informe a quantidade de viagens que o usuário fará: ");
                int quantViagens = teclado.nextInt();
                teclado.nextLine();

                viagemUsuario[i] = new Viagem[quantViagens];

                for(int j=0;j<quantViagens;j++){
                    System.out.println("\n===== VIAGEM " + (j + 1) + " =====\n");
                    viagemUsuario[i][j] = new Viagem();
                    viagemUsuario[i][j].setId(teclado); 
                    viagemUsuario[i][j].setDestino(teclado);
                    viagemUsuario[i][j].setDataInicio(teclado);
                    viagemUsuario[i][j].setDataFim(teclado);
                }
            }
            return viagemUsuario;
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

        public int getusuario() {
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

        public void setUsuario(Scanner teclado) {
            System.out.print("Digite o ID do usuário responsável: ");
            this.usuario = teclado.nextInt();
            teclado.nextLine();

            System.out.println();
        }
    }
