

public class Main {
    public static void main(String[] args) {

        Tarefa tarefaLogin = new Tarefa("Corrigir bug do login",
                "Usuário não consegue entrar",
                "A FAZER", 3);
        Tarefa tarefaPerfil = new Tarefa("Criar tela de perfil",
                "Layout aprovado no Figma",
                "EM ANDAMENTO",
                2);
        Tarefa tarefaTestes = new Tarefa("Escrever testes",
                "Cobrir o fluxo de login",
                "A FAZER",
                1);
        Tarefa tarefaNova = new Tarefa("Revisar documentação");

        System.out.println("---Antes de Concluir---");
        exibirTodas(tarefaLogin, tarefaPerfil, tarefaTestes, tarefaNova);

        tarefaLogin.concluir();

        System.out.println("---Depois de concluir---");
        exibirTodas(tarefaLogin, tarefaPerfil, tarefaTestes, tarefaNova);

    }

    static void exibirTodas(Tarefa... tarefas) {
        for (Tarefa tarefa : tarefas) {
            tarefa.exibir();
        }
    }
}
