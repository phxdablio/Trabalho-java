/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Administrator
 */
public class Conta {
    private String nome;
    private int id;
    private double saldo;
    private Banco banco;
    
    public Conta (String nome, int id, double saldo, Banco banco){
        this.nome = nome;
        this.id = id;
        this.saldo = saldo;
        this.banco = banco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
    public synchronized void debitar(double valor){
        if (saldo>= valor){
            saldo -= valor;
            System.out.println(nome+"Comprou um produto de R$"+valor);
        } else{
            System.out.println("Saldo insuficiente");
        }
    }
    public synchronized void adicionarSaldo(double valor){
        saldo += valor;
    }
        
    }
    
    
