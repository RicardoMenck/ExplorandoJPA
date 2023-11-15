package academia.java;

import javax.persistence.*;
import java.io.Serializable;

@Entity //
public class Pessoa implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String nome;
    String email;
    String cargo;

    @ManyToOne
    private Sala sala;

    // Construtores
    public Pessoa(Integer id, String nome, String email, String cargo) {
        super(); //Serve para chamar o construtor da superclasse, é chamado mesmo que quando não está explícito.
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }

   public Pessoa() {
        //Construtor sem parametros. Necessario para a criação da instancias pela JPA/frameworks.
    }

    //Métodos acessores e modificadores

    @Override
    public String toString() {
        //Método que converte um objeto em uma String, util para depurações
        return "Pessoa id= " +id+ ", nome= " +nome+ ", email= " +email+ ", cargo= " +cargo+ ".";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}