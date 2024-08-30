/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author andre
 */
public class Odometer implements Counter {
protected int numOfDigits;
protected Counter []digit ;

    public Odometer(int numOfDigits) {
        
    if(numOfDigits<1){
        throw new IllegalArgumentException("Number of digits must be at least 1.");
    }
    else{
        this.numOfDigits=numOfDigits;
        this.digit=new Counter[this.numOfDigits];
         digit[0]= new DigitCounter();
         for(int i=1;i<this.numOfDigits;i++){
        digit[i]=new LinkedDigitCounter(digit[i-1]);
    }
    }
   /**try{
        this.numOfDigits=numOfDigits;
    digit[0]= new DigitCounter();
    for(int i=1;i<this.numOfDigits;i++){
        digit[i]=new LinkedDigitCounter(digit[i+1]);
    }
}catch(IllegalArgumentException e)
{
    System.out.println("Number of Digits in odometer must be at least 1");
}
    
 */   
       
    }

    public void increment(){
      
        
        
        digit[numOfDigits-1].increment();
        
   }
   
    public void decrement(){
        digit[numOfDigits-1].decrement();
        
   }

    public void reset(){
        for(int i=0;i<numOfDigits;i++){
            digit[i].reset();
        }
    }
    
  public String count(){
      String result ="";
     
      for(int i=0;i<numOfDigits;i++){
       result = result + digit[i].count();
      }
return result;
  }

}
