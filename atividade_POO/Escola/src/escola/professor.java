package escola;

import javax.swing.JOptionPane;

public class professor extends pessoa
{
    
    // atributos
    private String strCTPS;
    private int nHoraAula;
    private double dblInss;
    private double dblSalario;
    
    // métodos
    public void TipoRegistro()
    {
        if (this.getnHoraAula() == 0)
        {
            this.setDblInss(2600);
            JOptionPane.showMessageDialog(null, "Seu salário é: " + this.getDblInss() + "R$");
        }
        else
        {
            if (this.getnHoraAula() <= 149)
            {
                this.setDblInss((this.getnHoraAula() * 30) * 1.3);
                JOptionPane.showMessageDialog(null, "Seu salário é: " + this.getDblInss() + "R$");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Hora de aulas excede o limite.");
            }
        }
    }
    
    public void CalculaSalario()
    {
        if (this.getDblInss() <= 1751.80)
        {
            JOptionPane.showMessageDialog(null, "Não possui contribuição.");
        }
        else
        {
            if (this.getDblInss() <= 2919.72)
            {
                setDblSalario(this.getDblInss() - this.getDblInss() * 0.08);
                this.setDblInss(this.getDblInss() - getDblSalario());
                JOptionPane.showMessageDialog(null, "Salário: " + this.getDblSalario() + "\n Contribuição INSS: " + this.getDblInss());
            }
            else
            {
                if (this.getDblInss() <= 5839.45)
                {
                    setDblSalario(this.getDblInss() - this.getDblInss() * 0.09);
                    this.setDblInss(this.getDblInss() - getDblSalario());
                JOptionPane.showMessageDialog(null, "Salário: " + this.getDblSalario() + "\n Contribuição INSS: " + this.getDblInss());
                }
                else
                {
                    setDblSalario(this.getDblInss() - this.getDblInss() * 0.11);
                    this.setDblInss(this.getDblInss() - getDblSalario());
                JOptionPane.showMessageDialog(null, "Salário: " + this.getDblSalario() + "\n Contribuição INSS: " + this.getDblInss());
                }
            }
        }
    }
    
    @Override
    public void ImprimeDados()
    {
        super.ImprimeDados();
        JOptionPane.showMessageDialog(null,
                "\n CTPS: " + this.getStrCTPS() +
                "\n Horas de aula: " + this.getnHoraAula() +
                "\n Salário: " + (this.getDblSalario() + this.getDblInss())
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
    
    // encapsulamento
       public String getStrCTPS() 
    {
        return strCTPS;
    }

    public void setStrCTPS(String strCTPS) 
    {
        this.strCTPS = strCTPS;
    }

    public int getnHoraAula() 
    {
        return nHoraAula;
    }

    public void setnHoraAula(int nHoraAula) 
    {
        this.nHoraAula = nHoraAula;
    }

    public double getDblInss() 
    {
        return dblInss;
    }

    public void setDblInss(double dblInss) 
    {
        this.dblInss = dblInss;
    }

    public double getDblSalario() 
    {
        return dblSalario;
    }

    public void setDblSalario(double dblSalario) 
    {
        this.dblSalario = dblSalario;
    }
}
