package pessoa;

public class TestePessoa {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        
        p1.nome = "Camila";
        p1.idade = 30; 
        p1.renda = 1700.55;
        
        p1.imprimeDados(); 
    }   
}
