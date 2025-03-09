package lista;
import javax.swing.JOptionPane;
public class Calculadora_23 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - decimal dos numeros em vetor
        double dblValor[] = new double[2];
        // - int que salva a operacao que o usuario quer
        int nOperacao;

        // entrada
        // - pergunta o valor, converte pra int e atribui ao valor
        dblValor[0] = Double.parseDouble(JOptionPane.showInputDialog("informe o primeiro valor"));
        dblValor[1] = Double.parseDouble(JOptionPane.showInputDialog("informe o segundo valor"));
        
        // - pergunta a operação
        nOperacao = Integer.parseInt(JOptionPane.showInputDialog("Qual operação você quer? \n 1 Adição \n 2 - Subtração \n 3 - multiplicação \n 4 - divisão"));
        
        // processamento e saída
        // verifica qual operação foi pedida e mostra o resultado de acordo
        switch (nOperacao)
        {
            case 1 -> JOptionPane.showMessageDialog(null, dblValor[0] + dblValor[1]);
            case 2 -> JOptionPane.showMessageDialog(null, dblValor[0] - dblValor[1]);
            case 3 -> JOptionPane.showMessageDialog(null, dblValor[0] * dblValor[1]);
            case 4 -> JOptionPane.showMessageDialog(null, dblValor[0] / dblValor[1]);
        }
    }
}
