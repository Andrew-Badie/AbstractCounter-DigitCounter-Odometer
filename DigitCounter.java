/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author andre
 */
public class DigitCounter extends AbstractCounter{
  
    
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
    
    
    
    
    
    
    
    
}
