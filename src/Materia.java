import java.util.ArrayList;

public class Materia {
    String nome;
    ArrayList<Questoes> questoes;
    public String getNome(){
        return this.nome;
    }

    public ArrayList<Questoes> getQuestoes(){
        return this.questoes;
    }

    public void setQuestoes(ArrayList<Questoes> questoes){
        this.questoes = questoes;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
