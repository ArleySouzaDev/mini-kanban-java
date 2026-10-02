

public class Main {
    public static void main(String[] args) {

        Tarefa tarefaLogin = new Tarefa();
        tarefaLogin.titulo = "Corrigir bug do login";
        tarefaLogin.descricao = "Usuário não consegue entrar";
        tarefaLogin.status = "A FAZER";
        tarefaLogin.prioridade = 3;




        Tarefa tarefaPerfil = new Tarefa();
        tarefaPerfil.titulo = "Criar tela de perfil";
        tarefaPerfil.descricao ="Layout aprovado no Figma";
        tarefaPerfil.status = "EM ANDAMENTO";
        tarefaPerfil.prioridade = 2;


        Tarefa tarefaTestes = new Tarefa();
        tarefaTestes.titulo = "Escrever testes";
        tarefaTestes.descricao = "Cobrir o fluxo de login";
        tarefaTestes.status = "A FAZER";
        tarefaTestes.prioridade = 1;

        System.out.println("---Antes de Concluir---");
        tarefaLogin.exibir();
        tarefaPerfil.exibir();
        tarefaTestes.exibir();

        tarefaLogin.concluir();

        System.out.println("---Depois de concluir---");
        tarefaLogin.exibir();
        tarefaPerfil.exibir();
        tarefaTestes.exibir();

    }
}
