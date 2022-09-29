/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetores;
import java.util.Scanner;
import java.util.ArrayList;  

/**
 *
 * @author larys
 */
public class ArrayList {
    public static int leia(String mensagem){
        Scanner teclado = new Scanner(System.in);
        System.out.print(mensagem);
        return teclado.nextInt();
    }


    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        int i=0, k;
        int resposta;
        
        do{
            resposta = leia("Digite: 1- INSERIR; 2 - RETIRAR; 3 - IMPRIMIR; 0 - SAIR => ");
            
            switch(resposta){
                case 1:
                    if(i<5){
                        array.add(leia("Digite o número para inserir: "));
                        i++;
                    }else{
                        System.out.print("ERRO: Array está cheio! Não é possível alocar um sexto valor !\n");
                    }
                    break;
                
                case 2:
                    array.remove(leia("Digite a posição do número que deseja remover: "));
                    if(array.size() < 5){
                        i--;
                    } else {
                        System.out.println("ERRO: Não é possível remover o número dessa posição");
                    }                 
                    break;
                
                case 3:
                    System.out.print("Imprimindo... |");
                    for(k=0; k< array.size(); k++){
                        System.out.print(array.get(k)+"| ");
                    }
                    System.out.println("");
                    break;
                
                default:
                    System.out.println("Caracter inválido ! Tente novamente");
                    break;
                    
            }
            
            System.out.println("");
        }while(resposta != 0);
    }
}
