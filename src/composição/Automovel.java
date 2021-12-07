/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composição;

/**
 *
 * @author SAMSUNG
 */
public class Automovel {
    private Motor motor;
    //private Direção direcao;  
    
    public Automovel(){
        motor = new Motor();
    }
    public Automovel(int potencia){
        motor = new Motor(potencia);
       
    }
}
