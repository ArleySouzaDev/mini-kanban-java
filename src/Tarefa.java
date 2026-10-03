public class Tarefa {
    private String titulo;
    private String descricao;
    private String status;
    private int prioridade;

    Tarefa(String titulo, String descricao, String status, int prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.prioridade = prioridade;
    }

    Tarefa(String titulo) {
        this(titulo, "Sem descrição", "A FAZER", 3);
    }

    void exibir() {
        System.out.printf("[%s] (P%d) %s: %s%n",
                status, prioridade, titulo, descricao);
    }

    void concluir() {
        status = "CONCLUÍDA";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        if (prioridade < 1 || prioridade > 5) {
            System.out.println("Prioridade inválida: use de 1 a 5.");
            return;
        }
        this.prioridade = prioridade;
    }
    public void setTitulo(String titulo){
        if (titulo == null || titulo.isBlank()){
            System.out.println("Título inválido: não pode ser vazio.");
            return;
        }
        this.titulo = titulo;
    }
}

