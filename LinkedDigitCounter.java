/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author andre
 */
public class LinkedDigitCounter extends AbstractCounter {
    Counter leftNeighbor;

    public LinkedDigitCounter(Counter leftNeighbor) {
        this.leftNeighbor = leftNeighbor;
    }
    
    
    
    public void increment(){
        if (value<9){
           value = value + 1; 
            
        }
        else{
            
value = 0;
leftNeighbor.increment();

        }
    }
    
    public void decrement(){
        if(value>0){
            value =value-1;
            
        }
        else{
            value =9;
            leftNeighbor.decrement();
        }
    }
}
    

