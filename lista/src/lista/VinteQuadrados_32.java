package lista;
import javax.swing.JOptionPane;
public class VinteQuadrados_32 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // inteiro do numero do usuario e do total somado
        int nValor, nTotal = 0;
        
        // entrada
        // - pergunta o valor, converte e atribui a nValor
        nValor = Integer.parseInt(JOptionPane.showInputDialog("informe o valor"));
        
        // processamento
        // - enquanto nao estiver no intervalo pede pra mudar
        while (nValor < 1 || nValor > 9)
        {
            nValor = Integer.parseInt(JOptionPane.showInputDialog("informe um valor entre 1 e 9"));
        }
        
        // vê se é par. se for, soma 1 nele
        if (nValor%2 == 0)
        {
            nValor++;
        }
        
        // soma os quadrados no nTotal 20 vezes
        for (int i = 0; i < 20; i++)
        {
            nTotal += nValor * nValor;
            nValor += 2;
        }
        
        // saida
        JOptionPane.showMessageDialog(null, nTotal);
    }
}
    