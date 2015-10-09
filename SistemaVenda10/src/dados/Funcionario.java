/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;


/**
 *
 * @author alunofavip
 */
public class Funcionario {
    
    private int codigo;
    private String nome;
    private String cidade;
    private String cpf;
    
    private static int contadorAutomatico = 1;
    
     // contrutor default
    public Funcionario(){
        System.out.println("construtor default");
        
        // criando um codigo autoincre,ental
        codigo = contadorAutomatico;
        //atualizando o contador
        contadorAutomatico ++;
        
         System.out.println("Construtor com argumentos");
    
    }
    public Funcionario(String nome, 
            String cidade, String cpf) {
             
        codigo = contadorAutomatico;
                contadorAutomatico ++;
        
        this.nome = nome;
        this.cidade = cidade;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        
        String relatorio ="";
        relatorio +="codigo: "+codigo;
        relatorio +="\nnome "+nome;
        relatorio +="\ncidade "+cidade;
        relatorio +="\ncpf "+cpf;
        
               
        return relatorio;
    }
    
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   

    
    
}
