import javax.swing.JOptionPane;

public class Menu {
    private int opcao;
    private String operacao;

   public int retornarOpcao(){
   
      Boolean c =true;
    while(c){
        int op = Integer.parseInt(JOptionPane.showInputDialog( "|---CALCULADORA---|\n|--(1) ADIÇÃO-----------|\n|--(2) SUBTRAÇÃO----|\n|--(3) MULTIPLICAR---|\n|--(4) DIVIDIR------------|"));
        setOpcao(op);

        if(opcao== 1 ||opcao== 2 || opcao== 3 || opcao== 4){
            switch(opcao){
                case 1: operacao = "ADIÇÂO";
                case 2: operacao = "SUBTRAÇÃO";
                case 3: operacao = "MULTIPLICAÇÃO";
                case 4: operacao = "DIVISÃO";
            }

            JOptionPane.showMessageDialog(null, "OPÇÃO: " + operacao);
            c = false;
            
            
        }else{
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