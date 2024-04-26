/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Administrator
 */
public class Funcionario extends Thread {
    private String nome;
    private Conta conta;
    private Conta investimento;
    private Loja loja;
    
    public Funcionario (String nome, Conta conta, Conta investimento, Loja loja){
        this.nome = nome;
        this.conta = conta;
        this.investimento = conta;
        this.loja = loja;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Conta getInvestimento() {
        return investimento;
    }

    public void setInvestimento(Conta investimento) {
        this.investimento = investimento;
    }
   
    
    
    
    
}
