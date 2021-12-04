/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_karinmartinez;


public class Proceso implements Runnable{
    Principal p =new Principal();
    int velocidad;
    int Distancia;
    @Override
    public void run() {
        while (velocidad <= distancia){
            try{
                Thread.sleep(1000);
            }catch{
                
            }
        }
    }
    
}
