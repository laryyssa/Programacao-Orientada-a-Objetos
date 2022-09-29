
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
       /* int resposta;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 - Inserir Funcionário");
            System.out.println("2 - Contas no Banco");
            System.out.println("3 - Deposito em Conta Corrente");
            System.out.println("4 - Saque em Conta Corrente");
            System.out.println("5 - Extrato de Conta Corrente");
            System.out.println("0 - Sair");
            System.out.println("Entre com uma opção: ");
            resposta = sc.nextInt();
            switch (resposta) {
                case 1:
                    Interface.CadastrarConta(banco);
                    break;
                case 2:
                    Interface.ContaCorrentesNoBanco(banco);
                    break;
                case 3:
                    Interface.EfetuarDeposito(banco);
                    break;
                case 4:
                    Interface.EfetuarSaque(banco);
                    break;
                case 5:
                    InterfaceUsuario.ExtratoContaCorrente(banco);
                    break;
            }
            InterfaceUsuario.clearScreen();
        } while (resposta != 0); */
       
       Funcionario Luiza = new Funcionario(1200, "Maria", 8500.00, 20.00);
       Funcionario João = new Funcionario(1201, "João", 8500.00, 35.00);
       
       Gerente Anna = new Gerente(1202, "Anna", 12000.00, 100.00, "1", "RH");
       Gerente Jonathan = new Gerente(1203, "Jonathan", 10000.00, 230.00,"2", "Projetos");
       
       System.out.println("Salario liquido da Luiza"+ Luiza.salarioLiquido());
       
    }
    
}
