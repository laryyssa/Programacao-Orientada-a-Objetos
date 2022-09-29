/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vetores;
import java.util.Scanner;

/**
 *
 * @author larys
 */
public class Vetores {
    public static int leia(String mensagem){
        Scanner teclado = new Scanner(System.in);
        System.out.print(mensagem);
        return teclado.nextInt();
    }


    public static void main(String[] args) {
        int vetor[] = new int[5];
        int i=0, k;
        int resposta, posicao;
        
        do{
            resposta = leia("Digite: 1- INSERIR; 2 - RETIRAR; 3 - IMPRIMIR; 0 - SAIR => ");
            
            switch(resposta){
                case 1:
                    if(i<5){
                        vetor[i] = leia("Digite o número para inserir: ");
                        i++;
                    }else{
                        System.out.print("ERRO: Vetor está cheio! Não é possível alocar um sexto valor !\n");
                    }
                    break;
                
                case 2:
                    posicao = leia("Digite a posição do número que deseja remover: ");
            
                    if(vetor[posicao] != 0){
                        vetor[posicao] = 0;
                    }else{
                        System.out.print("ERRO: Não há numero na posição informada.");
                    }
                    break;
                
                case 3:
                    System.out.print("Imprimindo... |");
                    for(k=0; k<5; k++){
                        if (vetor[k] != 0){
                            System.out.print(vetor[k]+" | ");
                        } else {
                            System.out.print("(vazio) | ");
                        }
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
