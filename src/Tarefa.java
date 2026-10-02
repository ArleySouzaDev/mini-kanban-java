public class Tarefa {
    String titulo;
    String descricao;
    String status;
    int prioridade;

    void exibir(){
        System.out.printf("[%s] (P%d) %s: %s%n",
                status, prioridade, titulo, descricao);
    }
    void concluir(){
        status = "CONCLUÍDA";
    }
}

