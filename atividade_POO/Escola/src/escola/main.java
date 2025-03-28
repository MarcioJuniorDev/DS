package escola;
public class main 
{
    public static void main(String[] args) 
    {
      // "cadastro"
      pessoa pessoa1 = new pessoa();
      aluno aluno1 = new aluno();
      professor professor1 = new professor();
      
      // atributos pessoa1
      pessoa1.strNome = "Pessoa1";
      pessoa1.nAnoNascimento = 2000;
      pessoa1.strTelefone = "11 4002-8922";
      
      // atributos aluno1
      aluno1.strRm = "00001";
      aluno1.strSerie = "MDS";
      aluno1.strPeriodo = "MODULAR";
      
      // atributos professor1
      professor1.nHoraAula = 40;
              
              
      pessoa1.ImprimeDados();
      pessoa1.CalcularIdade(2025);
      aluno1.RecebeAlimentacao();
      professor1.TipoRegistro();
      professor1.CalculaSalario();
    }
    
}
