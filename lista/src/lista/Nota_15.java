package lista;
import javax.swing.JOptionPane;
public class Nota_15 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - vetor decimal das notas, nota da recuperação, média e média após recuperação
        double dblNota[] = new double[4], dblNotaRec, dblMedia, dblMediaRec;
        // - string da mensagem a ser mostrada
        String strMensagem;

        // entrada
        dblNota[0] = Double.parseDouble(JOptionPane.showInputDialog("Informe sua primeira nota"));
        dblNota[1] = Double.parseDouble(JOptionPane.showInputDialog("Informe sua segunda nota"));
        dblNota[2] = Double.parseDouble(JOptionPane.showInputDialog("Informe sua terceira nota"));
        dblNota[3] = Double.parseDouble(JOptionPane.showInputDialog("Informe sua quarta nota"));

        // processamento
        // - descobre a média final do estudante
        dblMedia = (dblNota[0] + dblNota[1] + dblNota[2] + dblNota[3]) / 4;
        
        // - se a media for maior ou igual a 7, ele está aprovado e salva isso na strMensagem
        if (dblMedia >= 7) 
        {
            strMensagem = "Aprovado";
            
            // saída 1
            // mostra a média e a mensagem
            JOptionPane.showMessageDialog(null, "Média: " + dblMedia + ", situação: " + strMensagem);
        } 
        // -- se a média for menor que 7, ele está de recuperação, então pergunta a nota de recuperação dele
        else 
        {
            dblNotaRec = Double.parseDouble(JOptionPane.showInputDialog("Informe sua nota de recuperação"));
            dblMediaRec = (dblNota[0] + dblNota[1] + dblNota[2] + dblNota[3] + dblNotaRec) / 5;

            // --- se com a nota da recuperação sua média ficou igual ou maior que 7, ele está aprovado na recuperação. Se não, ele reprovou. A strMensagem salva isso.
            if (dblMediaRec >= 7) 
            {
                strMensagem = "Aprovado na recuperação";
            } else 
            {
                strMensagem = "Reprovado";
            }
            
            // saída 2
            // - mostra a média dele, a média da recuperação e a strMensagem
            JOptionPane.showMessageDialog(null, "Média: " + dblMedia + ", média da recuperação: " + dblMediaRec + ", situação: " + strMensagem);
        }
    }

}
