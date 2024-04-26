/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Administrator
 */
public class Loja {
    private String nome;
    private Conta conta;
    private double precoProduto;
    
    public Loja (String nome,Conta conta, double precoProduto){
        this.nome = nome;
        this.conta = conta;
        this.precoProduto = precoProduto;
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
     public double getPrecoProduto(){
         return precoProduto;
     }
     public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
     public void adicionarProduto(){
        conta.adicionarSaldo(precoProduto);
         System.out.println("Produto" +precoProduto+ "Loja"+nome);
     }
}
