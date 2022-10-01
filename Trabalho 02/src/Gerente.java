/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author larys
 */
public class Gerente extends Funcionario{
    private int categoria;
    private String departamento;
    
    public Gerente(){
        
    }
    public Gerente (int matricula, String nome, double salario, double deducoes, int categoria, String departamento){
        super(matricula, nome, salario, deducoes);
        this.categoria = categoria;
        this.departamento = departamento;
    }
    
    public int getCategoria(){
        return categoria;
    }
    public void setCategoria(int categoria){
        this.categoria = categoria;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
        
    public double salarioLiquido(){
        if(this.categoria == 1){
            return 1.10*super.salarioLiquido();
        }else{
            return 1.20*super.salarioLiquido();
        }
    }   
      
    @Override
    public void dadosFuncionario(){
        super.dadosFuncionario();
        System.out.println("Categoria: " + this.getCategoria() + "\nDepartamento: " + this.getDepartamento());
        
    }
    
    //public void salarioLiquido(){
      //  System.out.println("Salario Liquido de "+ this.getNome() + ": "+ this.salarioLiquido(this.getCategoria()));
 
    //}
    
}
