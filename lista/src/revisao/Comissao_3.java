package revisao;
import javax.swing.JOptionPane;
public class Comissao_3 {
    public static void main(String [] args)
    {
        String StrNome;
        double DblPreco, DblComissao;
        int NQtde;
        
        // entrada
        StrNome = JOptionPane.showInputDialog("Informe seu nome");
        DblPreco = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário da peça"));
        NQtde = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite quantas peças foram vendidas"));
        
        // processamento
        DblComissao = (NQtde * DblPreco) * 0.05;
        
        // saída
        JOptionPane.showMessageDialog(null, "O vendedor " + StrNome + " tem comissão igual a R$" + DblComissao);
    }
}