package atividade2ap;

/**
 *
 * @author vitoria.csilva15
 */
public class TV {

    private int canal;
    private int volume;
    private boolean status;

    public TV(boolean status, int canal, int volume) {
        this.canal = canal;
        this.status = status;
        this.volume = volume;

    }
//Pega o status da tv, liga ou desliga tv
    public void setstatus() {
        status = !status;
    }

// retornando o status de ligada ou desligada
    public boolean getstatus() {
        return status;
    }
// metodo para mudar o canal

    public void setcanal(int num) {
        canal = num;
    }

    // metodo que visualiza o canal
    public int getcanal() {
        return canal;
    }

// um metodo só para aumentar o volume em uma unidade, poderia fazer volume+= volume;
    public void setAumentaVolume() {
        volume = volume + 1;

    }
// um metodo só para diminuir o volume em uma unidade;

    public void setDiminuirVolume() {
        volume = volume - 1;
    }

    // esse metodo visualiza para o usuário o canal atual
    public int getvolume() {
        return volume;
    }

}
