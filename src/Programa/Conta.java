package Programa;

import Utilitario.Utils;

public class Conta {

    private static int contadorDeContas = 1;
    private int numeroConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;

    public Conta(int numeroConta, Pessoa pessoa, Double saldo) {
        this.numeroConta = numeroConta;
        this.pessoa = pessoa;
        this.saldo = saldo;
    }

    public Conta(Pessoa cliente) {
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "/nNumero da conta: " + this.getNumeroConta() +
                "/nNome: " + this.pessoa.getNome() +
                "/nEmail: " + this.pessoa.getEmail() +
                "/nCPF: " + this.pessoa.getCpf() +
                "/nSaldo: " + Utils.doubleToString(this.getSaldo());
    }
    public void depositar(Double valor){
        if (valor > 0 ){
            setSaldo(getSaldo() + valor);
            System.out.println("Seu Deposito foi Realizado com Sucesso!");
        }else {
            System.out.println("Nao foi Possivel Realizar o Depósito!");
        }
    }

    public void sacar(Double valor){
        if (valor > 0 && this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            System.out.println("Saque Realizado com Sucesso!");
        }else {
            System.out.println("Não foi possivel realizar o Saque!");
        }
    }
    public void transferir(Conta contaParaDeposito, Double valor){
        if (valor > 0 && this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);

            contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println("Transferencia Realizado com sucesso!");
        }else {
            System.out.println("Não foi possível realizar a tranferência");
        }
    }

    public void transferencia(Conta contaDestinatario, Double valor) {
    }
}
