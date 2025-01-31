/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1.acm;

import javax.swing.JOptionPane;

/**
 *
 * @author ashca
 */
public class Quiz1ACM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //*objetivo, debo de solicitar el salario individual y calcular el monto total, el seguro de enfermedad y maternidad, (9.25) invalidez, vejez y Muerte (5.08) 
      
        double salario = 0;
        
        double salarioInd = 0;
        double salarioSEM = 0;
        double salarioIVM = 0;
        double salarioTotal = 0;

       
        salarioInd = Double.parseDouble(JOptionPane.showInputDialog("Digite su salario:"));
        salarioSEM = salarioInd * 0.0925;
        salarioIVM = salarioInd * 0.0508;
        salarioTotal = salarioSEM + salarioIVM; 
        
        JOptionPane.showMessageDialog(null, "la empresa le abonara un monto de" + salarioTotal);
        
                 
        
        
        
        
        
        
    }
    
}
