package escola;
public class main 
{
    public static void main(String[] args) 
    {
      // construtor
        pessoa pessoa1 = new pessoa("Pessoa1", 2000, "4002-8922");
        aluno aluno1 = new aluno("00001", "1MDS", "ETIM", "Aluno1", 2008, "99999-9999");
        professor professor1 = new professor("", 0, 0, "Professor1", 1980, "11111-1111");
        
        pessoa1.CalcularIdade(2025);
        aluno1.RecebeAlimentacao();
        professor1.TipoRegistro();
        professor1.CalculaSalario();
        pessoa1.ImprimeDados();
        aluno1.ImprimeDados();
        professor1.ImprimeDados();
    }
    
}
