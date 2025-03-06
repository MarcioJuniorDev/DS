package lista;
import javax.swing.JOptionPane;
public class Idade_9 
{
    public static void main(String [] args)
    {
        // declaração de variáveis
        // - inteiros dos anos, meses e dias vividos e o total de dias vividos
        int nAnos, nMeses, nDias, nTotal;
    
        // entrada
        // - pergunta quantos anos, meses e dias a pessoa viveu, transforma a string em int e atribuit a variavel
        nAnos = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
        nMeses = Integer.parseInt(JOptionPane.showInputDialog("Quantos meses você tem?"));
        nDias = Integer.parseInt(JOptionPane.showInputDialog("Quantos dias você tem?"));
        
        // processamento
        // - multiplica os anos vividos por 365 e os meses por 30, transformando eles em dias. também acrescentam esse valor no nTotal
        nTotal = nAnos * 365;
        nTotal += nMeses * 30;
        nTotal += nDias;
        
        // saída
        // - mostra a quantidade de dias vividos
        JOptionPane.showMessageDialog(null, "Sua idade em dias é: " + nTotal + " dias");
        
    }
}
