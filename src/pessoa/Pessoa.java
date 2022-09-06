
package pessoa;

import javax.swing.JOptionPane;

public class Pessoa {
    //Atributos
    String nome;
    int idade;
    double renda;

    public Pessoa() {
    }
    
    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Nome: " +nome
        +"\nIdade: " + idade + " anos" 
        + "\nRenda: R$ " + renda); 
    }
    
    public Pessoa(String nome, int idade, double renda) {
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
    }
         
    //Método de Acesso

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
}
