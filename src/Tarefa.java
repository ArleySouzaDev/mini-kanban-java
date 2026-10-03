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
}

