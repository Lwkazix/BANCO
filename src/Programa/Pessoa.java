package Programa;

import java.util.Date;

public class Pessoa {
    private static int counter = 1;

    private int numeroPessoa ;
    private String nome;
    private String cpf;
    private String email;
    private Date accountCreationDate;


    public Pessoa(String name, String cpf, String email) {
        this.numeroPessoa = Pessoa.counter;
        this.nome = name;
        this.cpf = cpf;
        this.email = email;
        this.accountCreationDate = new Date();
        Pessoa.counter += 1;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Pessoa.counter = counter;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
