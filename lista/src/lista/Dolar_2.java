package lista;
import javax.swing.JOptionPane;
public class Dolar_2 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - decimal igual à cotação do dólar, valor em dólar e valor me reais
        double dblCotacao, dblDolar, dblReal;
        
        // entrada
        // - pergunta a cotação do dólar, converte a string informada para decimal e atribui a dblCotacao
        dblCotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da cotação do dólar"));
        // - pergunta o valor em dólar, converte a string informada para decimal e atribui a dblDolar
        dblDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dólares que quer converter para reais"));
        
        // processamento 
        // - atribui o valor de dblReal, baseado no valor informado em dólar * cotação
        dblReal = dblDolar * dblCotacao;
        
        // saída
        // - mostra o valor em dólar e o valor em real convertido
        JOptionPane.showMessageDialog(null, "Valor em dólar: US$" + dblDolar + " \nValor em reais: R$" + dblReal);
    }
}