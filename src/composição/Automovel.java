/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composição;

/**
 *
 * @author hrprestes
 */
public class Automovel {
    String cor;
    String peso;
    String marca;
    int ano;
   
    
    private Motor motor;
    private direcao direcao;  

    Automovel(int i, String verde) {
    }
    
    public void ligarPelaPrimeiraVez(int potencia, String cor){
        motor = new Motor(potencia);
    }
    
    public Automovel(){
        motor = new Motor();
    }
    public Automovel(int potencia){
        motor = new Motor(potencia);
    }

    void ligarPelaPrimeiraVez(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   void imprimeDadosAutomovel() {
       System.out.println("Insira a potencia: " + motor.getPotencia());
       System.out.println("Cor da direção: "+ direcao.getCor());
       } 
    
}
