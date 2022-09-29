/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author larys
 */
public class Funcionario {
    private int matricula;
    private String nome;
    private double salarioBruto;
    private double deducoes;
    
    public Funcionario(){
        
    }
    public Funcionario(int matricula, String nome, double salario, double deducoes){
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salario;
        this.deducoes = deducoes;
    }
    
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSalarioBruto(){
        return salarioBruto;
    }
    public void setSalario(int salario){
        this.salarioBruto = salario;
    }
    
    public double getDeducoes(){
        return deducoes;
    }
    public void setDeducoes(double deducoes){
        this.deducoes = deducoes;
    }
            
    public double salarioLiquido(){
        return this.salarioBruto - this.deducoes;
    }      
    
    public void dadosFuncionario(){
        System.out.println("\nMatricula: " + this.getMatricula() + "\n" + "Nome: " + this.getNome() + "\n" + "Salario Bruto: " + this.getSalarioBruto() + "\n" + "Deducao: " + this.getDeducoes());
        
    }
    
    
}
