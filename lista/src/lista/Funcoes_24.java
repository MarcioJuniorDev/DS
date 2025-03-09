package lista;
import javax.swing.JOptionPane;
public class Funcoes_24 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - vetores dos valores e operacao
        int nValor[] = new int[2], nOperacao;
        
        // entrada
        // - pergunta os valores, converte e salva
        nValor[0] = Integer.parseInt(JOptionPane.showInputDialog("informe o primeiro valor"));
        nValor[1] = Integer.parseInt(JOptionPane.showInputDialog("informe o segundo valor"));
        
        // - pergunta a operação
        nOperacao = Integer.parseInt(JOptionPane.showInputDialog("qual função você quer? 1 – Verificar se um dos números lidos é ou não múltiplo do outro \n 2 – Verificar se os dois números lidos são pares \n 3 – Verificar se a média dos dois números é maior ou igual a 7. \n 4 – Sair"));

        // processamento e saídas
        // - verifica qual é a operacao que o usuario quer
        switch (nOperacao)
        {
            case 1 -> 
            { 
                // -- se o resto da divisão entre eles for 0, são multiplos
                if (nValor[0]%nValor[1] == 0 || nValor[1]%nValor[0] == 0)
                {
                    // saida 1
                    JOptionPane.showMessageDialog(null, "sim, eles são múltiplos");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "não, não são múltiplos");
                }
            }
              
            case 2 ->
            {
                // -- se o resto da divisao dos numeros for 0 quando dividido por 2, sao pares
                if (nValor[0]%2 == 0 && nValor[1]%2 == 0)
                {
                    JOptionPane.showMessageDialog(null, "os dois são pares");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "um ou os dois não são pares");
                }
            }
            
            case 3 ->
            {
                // -- calcula a média e, se for maior que sete, mostra isso
                if ((nValor[0]+nValor[1]) / 2 >= 7)
                {
                    JOptionPane.showMessageDialog(null, "a média deles é maior ou igual a sete");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "a média deles é menor que 7");
                }
            }
            
            case 4 ->
            {
                JOptionPane.showMessageDialog(null, "cancelado");
            }
        }
    }
}
