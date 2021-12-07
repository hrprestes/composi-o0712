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
public class composicao {
    public static void main(String[] arg) {
        //primeira forma
        Automovel polo = new Automovel();
        Automovel corsa = new Automovel(2000);
     
        //segunda forma
        Automovel carro = new Automovel();
        carro.ligarPelaPrimeiraVez();
        carro.ligarPelaPrimeiraVez(1600);
        
        //terceira forma
        Automovel moto  = new Automovel();
        Motor motor = new Motor();
        Motor motor2 = new Motor(1600);
        
        
        
    }
            
}
