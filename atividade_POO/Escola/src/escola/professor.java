package escola;

import javax.swing.JOptionPane;

public class professor extends pessoa
{
    // atributos
    String strCTPS;
    int nHoraAula;
    double dblInss, dblSalario;
    
    // métodos
    public void TipoRegistro()
    {
        if (this.nHoraAula == 0)
        {
            this.dblInss = 2600;
            JOptionPane.showMessageDialog(null, "Seu salário é: " + this.dblInss + "R$");
        }
        else
        {
            if (this.nHoraAula <= 149)
            {
                this.dblInss = (this.nHoraAula * 30) * 1.3;
                JOptionPane.showMessageDialog(null, "Seu salário é: " + this.dblInss + "R$");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Hora de aulas excede o limite.");
            }
        }
    }
    
    public void CalculaSalario()
    {
        if (this.dblInss <= 1751.80)
        {
            JOptionPane.showMessageDialog(null, "Não possui contribuição.");
        }
        else
        {
            if (this.dblInss <= 2919.72)
            {
                dblSalario = this.dblInss - this.dblInss * 0.08;
                this.dblInss -= dblSalario;
                JOptionPane.showMessageDialog(null, "Salário: " + this.dblSalario + "\n Contribuição INSS: " + this.dblInss);
            }
            else
            {
                if (this.dblInss <= 5839.45)
                {
                    dblSalario = this.dblInss - this.dblInss * 0.09;
                this.dblInss -= dblSalario;
                JOptionPane.showMessageDialog(null, "Salário: " + this.dblSalario + "\n Contribuição INSS: " + this.dblInss);
                }
                else
                {
                    dblSalario = this.dblInss - this.dblInss * 0.11;
                this.dblInss -= dblSalario;
                JOptionPane.showMessageDialog(null, "Salário: " + this.dblSalario + "\n Contribuição INSS: " + this.dblInss);
                }
            }
        }
    }
    
    @Override
    public void ImprimeDados()
    {
        super.ImprimeDados();
        JOptionPane.showMessageDialog(null,
                "\n CTPS: " + this.strCTPS +
                "\n Horas de aula: " + this.nHoraAula +
                "\n Salário: " + (this.dblSalario + this.dblInss)
        );
    }
    
        // construtor
    public professor(String strCTPS, int nHoraAula, double dblInss, String strNome, int nAnoNascimento, String strTelefone)
    {
        super(strNome, nAnoNascimento, strTelefone);
        this.strCTPS = strCTPS;
        this.nHoraAula = nHoraAula;
        this.dblInss = dblInss;
    }
}
