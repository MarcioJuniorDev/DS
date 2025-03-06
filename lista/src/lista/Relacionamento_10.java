package lista;
import javax.swing.JOptionPane;
public class Relacionamento_10 
{
    public static void main(String [] args)
    {
        // declaração de variáveis
        // inteiros do primeiro e segundo valor
        int nValor1, nValor2;
        // string que guarda as relações
        String strRel = "";
        
        // entrada
        // - pergunta os valores, converte a string informada para inteiro e atribui a variavel
        nValor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número"));
        nValor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número"));
        
        // processamento
        // - se o valor1 for maior ou igual ao valor2, então a string relação anota isso
        if (nValor1 >= nValor2)
        {
            strRel += "Maior ou igual, ";
        }
        // - se não for maior ou igual, então é menor ou igual, e adiciona na string relação
        else
        {
            strRel += "Menor ou igual, ";
        }
        
        // -- se o primeiro valor for igual ao segunda, a string anota isso
        if (nValor1 == nValor2)
        {
            strRel += "igual, ";
        }
        // -- se não for, então ele anota na string que não é igual
        else
        {
            strRel += "não igual, ";
        }
        
        // --- se o primeiro valor for maior e diferente do segundo, então a string anota
        if (nValor1 > nValor2 && nValor1 != nValor2)
        {
            strRel += "maior";
        }
        // --- se não for, então ele é menor e a string anota isso
        else
        {
            strRel += "menor";
        }
        
        // saída
        // - mostra as anotações da string
        JOptionPane.showMessageDialog(null, strRel);
    }
    
}
