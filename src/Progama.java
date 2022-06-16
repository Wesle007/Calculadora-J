import javax.swing.JOptionPane;

public class Progama {
    public static void main(String[] args) {
        boolean m=true,continuar = true;
        
        while(continuar){
        int op;
        Menu obmenu = new Menu();
       op = obmenu.retornarOpcao();
       Calcular obca = new Calcular();
       obca.pegarNumeros();
      JOptionPane.showMessageDialog(null,obca.calcularOp(op));
     while(m){
      String c = JOptionPane.showInputDialog("CONTINUAR? N/S");
      
      if(c.equalsIgnoreCase("S")){
          continuar= true;
          m = false;
      }else if(c.equalsIgnoreCase("N")){
          continuar = false ;
          m=false;
      }else {
          JOptionPane.showMessageDialog(null, "È SÓ 'S' OU 'N' ");
      }}
        }
    }
}