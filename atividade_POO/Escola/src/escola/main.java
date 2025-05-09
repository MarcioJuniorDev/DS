package escola;
public class main 
{
    public static void main(String[] args) 
    {
      // construtor
        aluno aluno1 = new aluno("00001", "1MDS", "ETIM", "Aluno1", 2008, "99999-9999");
        professor professor1 = new professor("", 0, 0, "Professor1", 1980, "11111-1111");
        
        aluno1.CalcularIdade(2025);
        aluno1.RecebeAlimentacao();
        professor1.TipoRegistro();
        professor1.CalculaSalario();
        aluno1.ImprimeDados();
        professor1.ImprimeDados();
    }
    
}
