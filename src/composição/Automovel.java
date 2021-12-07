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
   
    
    void imprimeDadosAutomovel() {
       System.out.println("---------CARRO---------");
       System.out.println("Cor da cadeira: "+ cor);
       System.out.println("peso da cadeira: "+ peso);
       System.out.println("Material usado na cadeira: "+ marca);
       System.out.println("Quantidade de cadeiras: "+ ano);
       }
    
    private Motor motor;
    private Direção direcao;  

    Automovel(int i, String verde) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
}
