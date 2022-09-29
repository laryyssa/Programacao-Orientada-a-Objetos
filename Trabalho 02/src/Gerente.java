/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author larys
 */
public class Gerente extends Funcionario{
    private String categoria;
    private String departamento;
    
    public Gerente(){
        
    }
    public Gerente (int matricula, String nome, double salario, double deducoes, String categoria, String departamento){
        super(matricula, nome, salario, deducoes);
        this.categoria = categoria;
        this.departamento = departamento;
    }
    
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
        
    public double salarioLiquido(String categoria){
        if(categoria == "1"){
            return 1.10*salarioLiquido();
        }else{
            return 1.20*salarioLiquido();
        }
    }   
            
}
