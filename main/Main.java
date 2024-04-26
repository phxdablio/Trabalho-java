/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criando todas as contas
        
        //Banco
       Banco nubank = new Banco("nubank");
       
       //Contas
       
       //Contas Cliente
       Conta cliente01 = new Conta("Joao", 1, 1000.00, nubank);
       Conta cliente02 = new Conta("Marcos", 2, 1000.00, nubank);
       Conta cliente03 = new Conta("Caio", 3, 1000.00, nubank);
       Conta cliente04 = new Conta("Pedro", 4, 1000.00, nubank);
       Conta cliente05 = new Conta("Vinicius", 5, 1000.00, nubank);
     
       // Conta Loja
       Conta contaLoja01 = new Conta ("Pichau", 6, 0, nubank);
       Conta contaLoja02 = new Conta ("Kabum", 7, 0, nubank);
       
       //Loja
       Loja loja01 = new Loja ("Pichau",contaLoja01, 100.00);
       Loja loja02 = new Loja ("Kabum", contaLoja02, 100.00);
       
         // Cliente
       Clientes joao = new Clientes("Joao", 1000.00, cliente01, loja01, loja02);
       Clientes marcos = new Clientes("Marcos", 1000.00, cliente02, loja01, loja02);
       Clientes caio = new Clientes("Caio", 1000.00, cliente03, loja01, loja02);
       Clientes pedro = new Clientes("Pedro", 1000.00, cliente04, loja01, loja02);
       Clientes vinicius = new Clientes("Vinicius", 1000.00, cliente05, loja01, loja02);
       
       // Conta salarios funcionarios salario
       Conta salarioFuncionario01 = new Conta ("Marcelo", 8, 0, nubank);
       Conta salarioFuncionario02 = new Conta ("Fabiana", 8, 0, nubank);
       Conta salarioFuncionario03 = new Conta ("Lucas", 10, 0 ,nubank);
       Conta salarioFuncionario04 = new Conta ("Raquel", 11, 0, nubank);
       
       // Conta funcionarios investimentos
       Conta investimentoFuncionario01 = new Conta ("Marcelo", 12, 0, nubank);
       Conta investimentoFuncionario02 = new Conta ("Fabiana", 13, 0, nubank);
       Conta investimentoFuncionario03 = new Conta ("Lucas", 14, 0, nubank);
       Conta investimentoFuncionario04 = new Conta ("Raquel", 15, 0, nubank);
       
       //Funcionarios
       Funcionario funcionario01 = new Funcionario ("Marcelo", salarioFuncionario01, investimentoFuncionario01, loja01);
       Funcionario funcionario02 = new Funcionario ("Fabiana", salarioFuncionario02, investimentoFuncionario02, loja01);
       Funcionario funcionario03 = new Funcionario ("Lucas", salarioFuncionario03,investimentoFuncionario03, loja02);
       Funcionario funcionario04 = new Funcionario ("Raquel", salarioFuncionario04, investimentoFuncionario04, loja02);
       
        joao.start();
        marcos.start();
        caio.start();
        pedro.start();
        vinicius.start();

       } 
}
        
    

      
       
        
        
        
    
    

