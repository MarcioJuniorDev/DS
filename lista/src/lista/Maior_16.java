package lista;
import javax.swing.JOptionPane;
public class Maior_16 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - inteiros do primeiro e segundo valor
        int nValor1, nValor2;
        // - mensagem de se é maior, menor ou igual
        String strMensagem = "";
        
        // entrada
        // - pergunta os valores, converte a string para inteiro e atribui à variável
        nValor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
        nValor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));
        
        // processamento
        // - verifica se o primeiro valor é maior que o segundo e, se for, coloca isso na mensagem
        if(nValor1 > nValor2)
        {
            strMensagem = nValor1 + " (1ºValor) é o maior valor, " + nValor2 + " (2ºValor) é o menor valor";
        }
        else
        {
            // verifica se o segundo valor é maior que o primeiro e, se for, coloca isso na mensagem
            if(nValor2 > nValor1)
            {
                strMensagem = nValor1 + " (1ºValor) é o menor valor, " + nValor2 + " (2ºValor) é o maior valor";                
            }
            // se nenhum dos valores for maior que o outro, eles são iguais
            else
            {              
                strMensagem = "Os dois são iguais";
            }
        }
        
        // saída
        // - mostra a mensagem
        JOptionPane.showMessageDialog(null, strMensagem);
    }
}
