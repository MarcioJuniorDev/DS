package lista;
import javax.swing.JOptionPane;
public class Comissao_3 
{
    public static void main(String [] args)
    {
        // declaração de variáveis
        // - string que recebe o nome do vendedor
        String strNome;
        // - decimais do preço unitário da peça e o valor final da comissão
        double dblPreco, dblComissao;
        // - inteiro que representa a quantidade de peças vendidas
        int nQtde;
        
        // entrada
        // - pergunta o nome do vendedor e atribui a strNome
        strNome = JOptionPane.showInputDialog("Informe seu nome");
        // - pergunta o valor unitário, converte a string informada para decimal e atribui a dblPreco
        dblPreco = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário da peça"));
        // - pergunta quantas peças foram vendidas, converte a string para inteiro e atribui a nQtde
        nQtde = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas peças foram vendidas"));
        
        // processamento
        // - descobre o valor total que o cliente comprou e a comissão que o vendedor recebe
        dblComissao = (nQtde * dblPreco) * 0.05;
        
        // saída
        // - mostra o nome do vendedor e qual é a comissão da venda
        JOptionPane.showMessageDialog(null, "O vendedor " + strNome + " tem comissão igual a R$" + dblComissao);
    }
}