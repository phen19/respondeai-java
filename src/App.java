import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        User novoUsuario = new User("Joaquim", "teste@teste.com", "123456");
        Materia novaMateria = new Materia();
        ArrayList<Questoes> questoes = new ArrayList<Questoes>();

        novaMateria.setNome("JavaScript");
        Questoes questao1 = new Questoes("Enunciado 1", "Resposta 1");
        Questoes questao2 = new Questoes("Enunciado 2", "Resposta 2");
        questoes.add(questao1);
        questoes.add(questao2);

        novaMateria.setQuestoes(questoes);
        System.out.println(novoUsuario.nome);
        System.out.println(novoUsuario.email);
        System.out.println(novaMateria.nome);
        System.out.println(novaMateria.questoes.get(0).enunciado);
        System.out.println(novaMateria.questoes.get(0).resposta);
        System.out.println(novaMateria.questoes.get(1).enunciado);
        System.out.println(novaMateria.questoes.get(1).resposta);
        
    }
}
