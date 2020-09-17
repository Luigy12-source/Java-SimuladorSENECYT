/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

/**
 *
 * @author Luigy Miranda
 */
public class Datos {

    public Datos() {
    
        
    }
    Integer pr1=0;
    Integer pr2=0;
    Integer regalado=400;
    Integer total=0;
    public void pregunta1(int a){
        pr1=a;
    }
    public void pregunta2(int b){
        pr2=b;
    }
    public void calculos(){
       total=regalado+pr1+pr2;
    }
}
