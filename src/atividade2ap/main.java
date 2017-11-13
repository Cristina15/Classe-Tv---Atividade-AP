
package atividade2ap;

/**
 *
 * @author vitoria.csilva15
 */
public class main {
    
    
    public static void main(String[] args) {
        TV tv = new TV(false, 2,10 );
        //tv.setstatus();
        //tv.setAumentaVolume();
        //tv.setDiminuirVolume();
       // tv.setcanal(5);
       // dependendo da condição pode usar ((condição) ? " verdadeiro" : "falso");
        System.out.println("\nO status da tv é: " + tv.getstatus() + " \nO canal: " 
                + tv.getcanal() + "\n O volume é: " + tv.getvolume());
    }
}
