public class User {
    String nome;
    String email;
    String password;

    public User(String nome, String email, String password){
        this.nome=nome;
        this.email=email;
        this.password=password;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome= nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email= email;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password= password;
    }
}
