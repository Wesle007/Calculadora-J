import javax.swing.JOptionPane;

public class Menu {
    private int opcao;

   public int retornarOpcao(){
   
      Boolean c =true;
    while(c){
        int op = Integer.parseInt(JOptionPane.showInputDialog( "|---CALCULADORA---|\n|--(1) ADIÇÃO-----|\n|--(2) SUBTRAÇÃO--|\n|--(3) MULTIPLICAR|\n|--(4) DIVIDIR----|"));
        setOpcao(op);

        if(getOpcao()== 1 ||getOpcao()== 2 || getOpcao()== 3 || getOpcao()== 4){
            JOptionPane.showMessageDialog(null, "OPÇÃO: " + opcao);
            c = false;
            
            
        }
            else{
                JOptionPane.showMessageDialog(null, "DIGITE UMA DAS OPCÕES");
                
            
       }
    }
    return opcao;
   
   

    
}

/**
 * @return int return the opcao
 */
public int getOpcao() {
    return opcao;
}

/**
 * @param opcao the opcao to set
 */
public void setOpcao(int opcao) {
    this.opcao = opcao;
}
}