package lista;
import javax.swing.JOptionPane;
public class Decrescente_13 
{
    public static void main(String [] args)
    {
        // declaração de variáveis
        // - cria dois vetores, um que recebe os valores do usuário e outro que é a ordem dos valores que vão aparecer
        int nValor[] = new int[3], nPos[] = new int[3];
        
        // entrada
        // - pergunta os valores, converte de string para inteiro e atribui ao vetor
        nValor[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        nValor[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        nValor[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));
        
        // processamento
        // - verifica se o vetor[0] é maior que o vetor[1] e [2]
        if (nValor[0] > nValor[1] && nValor[0] > nValor[2])
        {
            // -- se for, atribui a primeira posição que será mostrada ao vetor[0]
            nPos[0] = nValor[0];
        }
        else
        {
            // --- se vetor[0] não for o maior, então verifica se o vetor[1] é maior que o vetor[2] (porque um dos dois é maior que o vetor[0]
            if (nValor[1] > nValor[2])
            {
                // ---- se o vetor[1] for maior que o [2], então ele fica na primeira posição
                nPos[0] = nValor[1];
            }
            else
            {
                // ---- se o vetor[1] for menor que o [2], então a primeira posição fica com o vetor[2]
                nPos[0] = nValor[2];
            }
        }
        
        // - verifica se o vetor[1] é menor que o vetor[0] e maior que o vetor[2], ou o contrário
        if (nValor[1] < nValor[0] && nValor[1] > nValor[2] || nValor[1] > nValor[0] && nValor[1] < nValor[2])
        {
            // -- se for, a segunda posição é o vetor[1] 
            nPos[1] = nValor[1];
        }
        else
        {
            // --- se não for, testa se o valor[0] é menor que o vetor[1] e maior que o vetor[2] ou o contrário
            if (nValor[0] < nValor[1] && nValor[0] > nValor[2] || nValor[0] > nValor[1] && nValor[0] < nValor[2])
            {
                // ---- se for, significa que o valor[0] é o do meio, pertencendo a posição intermediária
                nPos[1] = nValor[0];
            }
            else
            {
                // ---- se nem o vetor[0] nem o vetor[1] for o do meio, então a posição intermediária pertence ao vetor[2]
                nPos[1] = nValor[2];
            }
        }
        
        // - verifica se o vetor[0] é menor que todos os outros
        if (nValor[0] < nValor[1] && nValor[0] < nValor[2])
        {
            // -- se for, a ultima posição pertence ao vetor[0]
            nPos[2] = nValor[0];
        }
        else
        {
            // --- se não for, verifica se o vetor[1] é menor que o vetor[2], porque pelo menos um deles é menor que o vetor[0]
            if (nValor[1] < nValor[2])
            {
                // ---- se for, a ultima posição pertence ao vetor[1]
                nPos[2] = nValor[1];
            }
            else
            {
                // ---- se não for, isso significa que o vetor[2] é menor que todos
                nPos[2] = nValor[2];
            }
        }

        // saída
        // - mostra as posições atribuidas anteriormente
        JOptionPane.showMessageDialog(null, nPos[0] + ", " + nPos[1] + ", " + nPos[2]);
    }
}