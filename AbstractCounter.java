/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author andre
 */
public abstract class AbstractCounter implements Counter{
protected int value;

    public AbstractCounter() {
        value = 0;
        
    }
  public void increment () {
if (value < 9)
value = value + 1;
else {
value = 0;

}
}
  
  public void decrement () {
if (value > 0)
value = value - 1;
else {
value = 9;

}
}
  public void reset(){
      value =0;
  }
  public String count(){
      String h = Integer.toString(value);
      
      return h;
  }
 
  

  
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
