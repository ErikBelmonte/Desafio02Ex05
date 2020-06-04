package desafio02ex5;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Desafio02Ex5 {
    public static void main(String[] args) {
        /* Calcule a área de uma circunferência, sabendo que a fórmula é A=PI*R 2. receba R e PI,
        onde A é a variável que conterá o resultado da área, R o valor do raio e PI é 3,14. escreva
        o resultado da área em A. */
        
        double r, a;
        DecimalFormat f = new DecimalFormat("0.00");    
        
        r = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do Raio:"));
        a = Math.PI * Math.pow(r, 2);
            JOptionPane.showMessageDialog(null, "A área é: "+f.format(a));
    }
    
}
