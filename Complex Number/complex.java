class Complex {
private int real;
private int imag;

public void setReal (int real){
   this.real = real;
}

public void setImag (int imag){
   this.imag = imag;
}
public int getReal() {return real;}
public int getImag() {return imag;}


public Complex (){

   }


public Complex (int real, int imag){
      this.real = real;
      this.imag = imag;
   }

public Complex sum (Complex c1, Complex c2){
       Complex resault = new Complex();
       resault.real = c1.real + c2.real;
       resault.imag = c1.imag + c2.imag;
       return resault;
   }

public Complex sub (Complex c1, Complex c2){
       Complex resault = new Complex();
       resault.real = c1.real - c2.real;
       resault.imag = c1.imag - c2.imag;
       return resault;
   }

public void printResault (){
      if (imag > 0){
      System.out.println ("Complex Number: " + real + " + " + imag + "i");}
      else {System.out.println ("Complex Number: " + real  + imag + "i");}
   }
  
}



class Com {

 public static void main (String[] args){
    Complex c1 = new Complex(1,2);
    Complex c2 = new Complex(3,4);
    
    Complex c3 = new Complex();

    c3 = c3.sum(c1,c2);
    System.out.print("Sum is ");
    c3.printResault();

    c3 = c3.sub(c1,c2);
    System.out.print("Sub is ");
    c3.printResault();
    
    
    
  }
}