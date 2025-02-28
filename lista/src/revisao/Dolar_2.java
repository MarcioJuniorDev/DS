package revisao;
import javax.swing.JOptionPane;
public class Dolar_2 {
    public static void main(String[] args)
    {
        double DblCotacao, DblValor;
        
        // entrada
        DblCotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da cotação do dólar"));
        DblValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que quer converter para reais"));
        
        // processamento e saída
        JOptionPane.showMessageDialog(null, "Valor em dólar:" + DblValor + " \nValor em dólar:" + DblValor * DblCotacao);
    }
}