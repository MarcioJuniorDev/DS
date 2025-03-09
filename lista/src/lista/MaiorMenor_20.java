package lista;
import javax.swing.JOptionPane;
public class MaiorMenor_20 
{
    public static void main(String [] args)
    {
        // declaração de variáceis
        // - variáveis inteiras dos valores (vetor) e maior e menor valor
        int nValor[] = new int[3], nMaior, nMenor;
        
        // entrada
        // - pergunta um valor, converte a string para int e atribui ao valor. se for menor que 1, ele recusa e lê novamente
        nValor[0] = Integer.parseInt(JOptionPane.showInputDialog("informe o primeiro valor"));
        if (nValor[0] < 1)
        {
            nValor[0] = Integer.parseInt(JOptionPane.showInputDialog("valor inválido. Informe outro maior que 0"));
        }
        
        nValor[1] = Integer.parseInt(JOptionPane.showInputDialog("informe o segundo valor"));
        if (nValor[1] < 1)
        {
            nValor[1] = Integer.parseInt(JOptionPane.showInputDialog("valor inválido. Informe outro maior que 0"));
        }
        
        nValor[2] = Integer.parseInt(JOptionPane.showInputDialog("informe o terceiro valor"));
        if (nValor[2] < 1)
        {
            nValor[2] = Integer.parseInt(JOptionPane.showInputDialog("valor inválido. Informe outro maior que 0"));
        }
        
        // processamento
        // - verifica qual é o maior valor e atribui ele ao nMaior
        if (nValor[0] > nValor[1] && nValor[0] > nValor[2])
        {
            nMaior = nValor[0];
        }
        // -- se não for, verifica se o valor[1] é maior que o valor[2]
        else
        {
            if (nValor[1] > nValor[2])
            {
                nMaior = nValor[1];
            }
            // --- se nao, o nvalor[2] é o maior de todos
            else
            {
                nMaior = nValor[2];
            }
        }
        
        // - mesma logica do maior, mas trocando os sinais para ver o menor
         if (nValor[0] < nValor[1] && nValor[0] < nValor[2])
        {
            nMenor = nValor[0];
        }
        else
        {
            if (nValor[1] < nValor[2])
            {
                nMenor = nValor[1];
            }
            else
            {
                nMenor = nValor[2];
            }
        }
         
        // saída
        // -
        JOptionPane.showMessageDialog(null, nMenor * nMaior + "\n" + nMaior/nMenor);
    }
}
