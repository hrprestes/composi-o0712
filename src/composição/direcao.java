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
public class direcao {
    String cor;
    String peso;
    String Material;
    int quantidade;
    
    
    
    public String getCor() {
       return cor;
}
   public void setCor (String cor) {
       this.cor=cor;
   }
   
public String getPeso() {
       return peso;
}
   public void setPeso (String peso) {
       this.peso=peso;
   }
   
  public String getMaterial() {
       return Material;
}
   public void setMaterial (String Material) {
       this.Material=Material;
   } 
   
   public int getQuantidade() {
       return quantidade;
}
   public void setQuantidade (int quantidade) {
       this.quantidade=quantidade;
   }
}
