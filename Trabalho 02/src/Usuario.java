
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author larys
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    
    //private Funcionario[] funcionariosEmpresa;
    
            
    public static void main(String[] args) {  
 
       
       Funcionario Luiza = new Funcionario(1200, "Luiza", 8500.00, 20.00);
       Funcionario Pedro = new Funcionario(1201, "Pedro", 8500.00, 35.00);
       Gerente Anna = new Gerente(1202, "Anna", 12000.00, 100.00, 1, "RH");
       Gerente Jonathan = new Gerente(1203, "Jonathan", 10000.00, 230.00, 2, "Projetos");
       
       System.out.println("Salario liquido da Luiza: "+ Luiza.salarioLiquido());
       System.out.println("Salario liquido do Pedro: "+ Pedro.salarioLiquido());
       System.out.println("Salario liquido da Anna: "+ Anna.salarioLiquido(Anna.getCategoria()));
       System.out.println("Salario liquido dO Jonathan: "+ Jonathan.salarioLiquido(Jonathan.getCategoria()));
       
       System.out.println("-----------");
       
       
       Luiza.dadosFuncionario(Luiza);
       Pedro.dadosFuncionario(Pedro);
       Anna.dadosFuncionario(Anna);
       Jonathan.dadosFuncionario(Jonathan);
       
    }
    
       
}
