package lista;
import javax.swing.JOptionPane;
public class Armazenar_22 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - int q guarda o valor inicial e outros q armazenam
        double dblValor, dblPositivoA, dblNegativoB;
        
        // entrada
        // - pergunta o valor, converte a string pra inteiro e atribui ao nValor
       dblValor = Integer.parseInt(JOptionPane.showInputDialog("informe um valor"));
       
       // processamento
       // - se nValor for positivo, coloca no nPositivoA
       if (dblValor >= 0)
       {
           dblPositivoA = dblValor;
           // saida
           JOptionPane.showMessageDialog(null, "salvo no A");
       }
       // -- se nao for, ele é negativo
       else
       {
           dblNegativoB = dblValor;
           // saida
           JOptionPane.showMessageDialog(null, "salvo no B");
       }
    }
}
