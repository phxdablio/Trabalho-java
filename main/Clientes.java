/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Administrator
 */
public class Clientes extends Thread {
    private String nome;
    private double saldo = 1000;
    private Conta conta;
    private Loja loja01;
    private Loja loja02;
    
    // Construtor da classe Clientes
    public Clientes(String nome, double saldo, Conta conta, Loja loja01, Loja loja02){
        this.nome = nome;
        this.saldo = saldo;
        this.conta = conta;
        this.saldo = 1000.00;
        this.loja01 = loja01;
        this.loja02 = loja02;
    }
   
    // Método que retorna a conta do cliente
    public Conta getConta(){
        return conta;
    }
    
    // Método que define a conta do cliente
    public void setConta (Conta conta){
        this.conta = conta;
    }
    
    // Método que retorna o nome do cliente
    public String getNome(){
        return nome;
    }
    
    // Método que define o nome do cliente
    public void setNome(String nome){
        this.nome = nome;
    }
    
    // Método que retorna o saldo do cliente
    public double getSaldo(){
        return saldo;
    }
    
    // Método que define o saldo do cliente
    public void setSaldo(){
        this.saldo = 1000;
    }
  
  @Override
public void run() {
    // Variável para acompanhar a loja atual
    Loja lojaAtual = loja01;

    // Loop enquanto o cliente ainda tiver saldo
    while (saldo > 0) {
        // Tenta comprar um produto na loja atual
        if (lojaAtual.getPrecoProduto() <= saldo) {
            lojaAtual.adicionarProduto();
            saldo -= lojaAtual.getPrecoProduto();
            System.out.println("Cliente " + nome + " comprou um produto de R$" + lojaAtual.getPrecoProduto() + " na loja " + lojaAtual.getNome());

            // Alterna para a outra loja para a próxima compra
            lojaAtual = (lojaAtual == loja01) ? loja02 : loja01;
        } else {
            System.out.println("Cliente " + nome + " não possui saldo suficiente para comprar na loja " + lojaAtual.getNome());

            // Sai do loop se o cliente não puder comprar nada em nenhuma das lojas
            if (loja02.getPrecoProduto() > saldo && loja01.getPrecoProduto() > saldo) {
                break;
            }

            // Alterna para a outra loja para a próxima tentativa
            lojaAtual = (lojaAtual == loja01) ? loja02 : loja01;
        }
    }

    System.out.println("Cliente " + nome + " gastou todo o seu saldo.");
}

    
    
}
