
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
 
       
       Funcionario Luiza = new Funcionario(1200, "Luiza", 1000.00, 80.00);
       Funcionario Pedro = new Funcionario(1201, "Pedro", 8500.00, 35.00);
       Gerente Anna = new Gerente(1202, "Anna", 1000.00, 80.00, 1, "RH");
       Gerente Jonathan = new Gerente(1203, "Jonathan", 1000.00, 80.00, 2, "Projetos");
       
       System.out.println("Salario liquido da Luiza: "+ Luiza.salarioLiquido());
       System.out.println("Salario liquido do Pedro: "+ Pedro.salarioLiquido());
       System.out.println("Salario liquido do Anna: "+ Anna.salarioLiquido());
       System.out.println("Salario liquido do Jonathan: "+ Jonathan.salarioLiquido());
       
       System.out.println("-----------");
       
       
       Luiza.dadosFuncionario();
       Pedro.dadosFuncionario();
       Anna.dadosFuncionario();
       Jonathan.dadosFuncionario();
       
    }
    
       
}
