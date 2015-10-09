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
public class Cliente {
    
    // atributos
    
    private int codigo;
    private String nome;
    private String cidade;
    private String cpf;
    
    private static int contadorCodigo = 1;
    
    // contrutor default
    public Cliente(){
        System.out.println("construtor default");
    
    // criar um codigo autoincremental
        codigo = contadorCodigo;
        
        // atualizar o contador de codigo
        contadorCodigo ++;
   
        System.out.println("Construtor com argumentos");
    }
    
    //construtor

    public Cliente(String nome, String cidade, String cpf) {
        codigo = contadorCodigo;
        contadorCodigo ++;
        
        this.nome = nome;
        this.cidade = cidade;
        this.cpf = cpf;
    }

    // metodo
    public void imprirDados(){
    
        System.out.println( toString() );
    
    }
    
    @Override
    public String toString() {
        
        String relatorio ="";
        relatorio +="codigo: "+codigo;
        relatorio +="\nnome: "+nome;
        relatorio +="\ncidade: "+cidade;
        relatorio +="\ncpf: "+cpf;
        
             
        return relatorio;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    
    
}
