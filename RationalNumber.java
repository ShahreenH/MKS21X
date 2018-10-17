public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    numerator = nume;
    denominator = deno;//this value is ignored! 
  }

  public double getValue(){
    return nume / deno;//???
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return nume;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return deno;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
      RationalNumber output = new RationalNumber(deno, nume);
    return output;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
      boolean numeequals;
      boolean denoequals;
      numeequals = this.nume == other.getNumerator();
      denoequals = this.deno == other.getDenomator();
      if (numeequals && denoequals) {
	  return true;
      }
      return false;
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
      return "" + nume + "/" + deno;
  }

 /**Calculate the GCD of two integers.
  *@param a the first integers  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);    /*use euclids method or a better one*/
  }



  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
      return 0;
  }



  /******************Operations!!!!****************/


  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
      return "" + (this.nume * other.getNumerator()) + "/" + (this.deno * other.getDenominator()) ;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return null;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    return null;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return null;
  }
} 
