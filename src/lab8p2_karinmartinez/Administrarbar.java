
package lab8p2_karinmartinez;

import javax.swing.JProgressBar;

public class Administrarbar extends Thread{
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    
    Principal p = new Principal();
    public Administrarbar(JProgressBar barra) {
        this.barra = barra;
        this.avanzar = true;
        this.vive = true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    public void run(){
        while(vive){
            if(avanzar){
                barra.setValue(barra.getValue()+1);
                if (barra.getValue() >= 1000000){
                    vive=false;
                }
            }
            try{
                Thread.sleep(50);
            }catch (InterruptedException ex){
                
            }
            
        }
    }
}
