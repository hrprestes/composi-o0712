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
class Motor {
    private int potencia;
    
    public Motor(){
        potencia=1000;
    }
    public Motor(int potencia) {
        this.potencia=potencia;   
    }
    public int getPotencia() {
       return potencia;
}
    public int setPotencia(String potencia) {
        int potencia1 = this.potencia;   
 

