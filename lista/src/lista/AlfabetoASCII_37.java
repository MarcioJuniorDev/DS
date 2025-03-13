package lista;
import javax.swing.JOptionPane;
public class AlfabetoASCII_37 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - string que guardará todas as letras
        String strMensagem = "";
        // - caractere que terá o valor da letra atual no for
        char cLetra;
        
        // processamento
        // - for que começa em 65 (ASCII do A) e vai até 90 (ASCII do Z) de um em um
        for (int nAscii = 65; nAscii < 91; nAscii++)
        {
            cLetra = (char) Character.getNumericValue(nAscii);
            strMensagem += Character.toString(cLetra) + ", ";
        }
        
        // saída
        // - mostra a strMensagem
        JOptionPane.showMessageDialog(null, strMensagem);
    }
}
