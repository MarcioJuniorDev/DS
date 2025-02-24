package revisao;
import javax.swing.JOptionPane;
public class Comissao {
    public static void main(String [] args)
    {
        String StrNome;
        double DblPreco;
        int NQtde;
        
        // entrada
        StrNome = JOptionPane.showInputDialog("Informe seu nome");
        DblPreco = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário da peça"));
        NQtde = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite quantas peças foram vendidas"));
        
        // processamento e saida
        JOptionPane.showMessageDialog(null, "O vendedor " + StrNome + " tem comissão igual a R$" + (NQtde*DblPreco) * 0.05);
    }
}