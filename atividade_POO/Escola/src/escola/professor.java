package escola;

import javax.swing.JOptionPane;

public class professor extends pessoa
{
    // atributos
    String strCTPS;
    int nHoraAula;
    double dblSalario;
    
    // métodos
    public void TipoRegistro()
    {
        if (this.nHoraAula == 0)
        {
            this.dblSalario = 2600;
            JOptionPane.showMessageDialog(null, "Seu salário é: " + this.dblSalario + "R$");
        }
        else
        {
            if (this.nHoraAula <= 149)
            {
                this.dblSalario = (this.nHoraAula * 30) * 1.3;
                JOptionPane.showMessageDialog(null, "Seu salário é: " + this.dblSalario + "R$");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Hora de aulas excede o limite.");
            }
        }
    }
    
    public void CalculaSalario()
    {
        if (this.dblSalario <= 1751.80)
        {
            JOptionPane.showMessageDialog(null, "Não possui contribuição.");
        }
        else
        {
            if (this.dblSalario <= 2919.72)
            {
                double dblInss = this.dblSalario - this.dblSalario * 0.08;
                this.dblSalario -= dblInss;
                JOptionPane.showMessageDialog(null, "Salário: " + this.dblSalario + "\n Contribuição INSS: " + dblInss);
            }
            else
            {
                if (this.dblSalario <= 5839.45)
                {
                    double dblInss = this.dblSalario - this.dblSalario * 0.09;
                this.dblSalario -= dblInss;
                JOptionPane.showMessageDialog(null, "Salário: " + this.dblSalario + "\n Contribuição INSS: " + dblInss);
                }
                else
                {
                    double dblInss = this.dblSalario - this.dblSalario * 0.11;
                this.dblSalario -= dblInss;
                JOptionPane.showMessageDialog(null, "Salário: " + this.dblSalario + "\n Contribuição INSS: " + dblInss);
                }
            }
        }
    }
    
        // construtor
    professor(String strCTPS, int nHoraAula, double dblSalario, String strNome, int nAnoNascimento, String strTelefone)
    {
        super(strNome, nAnoNascimento, strTelefone);
        this.strCTPS = strCTPS;
        this.nHoraAula = nHoraAula;
        this.dblSalario = dblSalario;
    }
}
