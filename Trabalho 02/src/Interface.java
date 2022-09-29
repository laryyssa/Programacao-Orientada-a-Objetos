/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author larys
 */
public class Interface {
    /*public static void dadosFuncionario(Gerente gerente){
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Matricula: " + gerente.getMatricula());
        System.out.println("Salario bruto: " + gerente.getSalario());
        System.out.println("Deducoes: " + gerente.getDeducoes());
        System.out.println("Categoria: " + gerente.getCategoria());
        System.out.println("Departamento: " + gerente.getDepartamento());
        System.out.println("---------------");
        
    }
    
    public static void dadosFuncionario(Funcionario funcionario){
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Matricula: " + funcionario.getMatricula());
        System.out.println("Salario bruto: " + funcionario.getSalario());
        System.out.println("Deducoes: " + funcionario.getDeducoes());
        System.out.println("---------------");
    }
    */
    public static void salarioLiquido(Funcionario funcionario){
        System.out.println("Salario Liquido de "+ funcionario.getNome() + ": "+ funcionario.salarioLiquido());
 
    }
    
    public static void salarioLiquido(Gerente gerente){
        System.out.println("Salario Liquido de "+ gerente.getNome() + ": "+ gerente.salarioLiquido(gerente.getCategoria()));
 
    }
    
}
