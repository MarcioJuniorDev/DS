package lista;
import javax.swing.JOptionPane;
public class Troca_11 
{
    public static void main(String [] args)
    {
        // declaração de variáveis
        // - inteiro do primeiro valor, segundo valor e um auxiliar para a troca
        int nValor1, nValor2, nTroca;
        
        // entrada
        // - pergunta os valores, transforma a string em inteiros e atribui à variável
        nValor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        nValor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        
        // processamento
        // - guarda o primeiro valor na troca
        nTroca = nValor1;
        // -- coloca o segundo valor no lugar do primeiro
        nValor1 = nValor2;
        // --- coloca o primeiro valor guardado no lugar do segundo
        nValor2 = nTroca;
        
        // saída
        // - mostra os valores trocados
        JOptionPane.showMessageDialog(null, "Primeiro valor: " + nValor1 + ", segundo valor: " + nValor2);
    }
}
