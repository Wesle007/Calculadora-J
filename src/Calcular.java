import javax.swing.JOptionPane;

public class Calcular {
private int n1 , n2 ;

   
    public void pegarNumeros(){
            n1 = Integer.parseInt(JOptionPane.showInputDialog("N1:"));
             n2 = Integer.parseInt(JOptionPane.showInputDialog("N2:"));
        }
    public double calcularOp(int x){
        double resultado=0;
        if(x == 1){
            resultado = n1 + n2;
          
        }else if(x == 2){
            resultado = n1 - n2;
        }else if(x==3){
            resultado = n1 * n2;
        }else if(x==4){
            resultado = n1 / n2;
        }
        return resultado;
    }    
   
    }
    

    



