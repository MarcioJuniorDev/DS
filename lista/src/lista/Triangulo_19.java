package lista;
import javax.swing.JOptionPane;
public class Triangulo_19 
{
    public static void main(String[] args)
    {
       // declaração de vetores
       // - vetor que representa o valor dos lados do triângulo
       int nLado[] = new int[3];
       // - string que guarda a mensagem a ser exibida
       String strMensagem;
       
       // entrada
       // - pergunta o valor do lado, converte a string informada para inteiro e atribui ao vetor correspondente
       nLado[0] = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro lado do triângulo"));
       nLado[1] = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo lado do triângulo"));
       nLado[2] = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro lado do triângulo"));
       
       // processamento
       // - verifica se um lado é menor que a soma dos outros lados. se sim, ele é um triângulo
       if (nLado[0] < nLado[1] + nLado[2] && nLado[1] < nLado[0] + nLado[2] && nLado[2] < nLado[0] + nLado[1]) 
       {
           // -- verifica se todos os lados são iguais. Se sim, ele é equilátero e anota isso na strMensagem
           if (nLado[0] == nLado[1] && nLado[0] == nLado[2]) 
           {
               strMensagem = "Triângulo Equilátero";
           } 
           else 
           {
               // --- verifica se pelo menos dois lados são iguais. Se sim, ele é isósceles e anota isso na strMensagem
                if (nLado[0] == nLado[1] || nLado[1] == nLado[2] || nLado[0] == nLado[2]) 
                {
                    strMensagem = "Triângulo Isósceles";
                } 
                // --- se nenhum dos lados forem iguais, ele é escaleno e anota isso na strMensagem
                else 
                {
                    strMensagem = "Triângulo Escaleno";
                }
           }
       }
       // - se não for um triângulo, anota isso na strMensagem
       else 
       {
           strMensagem = "Os valores informados não formam um triângulo";
       }
       
       // saída
       // - mostra a strMensagem
       JOptionPane.showMessageDialog(null, strMensagem);
   }
}
