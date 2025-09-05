package coe318.lab2;
/**
* ComplexNumber models a complex number expressed
* in rectangular form (real and imaginary parts).
* * It is an <em>immutable</em> object.
*
* @author Kevin Bhawan
*/
public class ComplexNumber {
    private double real;
    private double imaginary;
 //Instance variable declarations
 /**
 * Construct a ComplexNumber given its
 * real and imaginary parts.
 * @param re The real component
 * @param im The imaginary component
 */
 public ComplexNumber(double re, double im) { 
    this.real = re;
    this.imaginary = im;
     
        }
 /**
 * Returns the real component.
 * @return the real
 */
 public double getReal() {
    return real; //A stub: to be fixed
 }
 /**
 * Returns the imaginary component.
 * @return the imaginary
 */
 public double getImaginary() {
    return imaginary; //A stub: to be fixed
 }
 /**
 * Returns a new ComplexNumber number that is
 * the negative of <em>this</em>. Note: the
 * original ComplexNumber is <b>NOT</b>
 * modified.
 * @return -this
 */
 public ComplexNumber negate() {
    
     return new ComplexNumber(-this.real, -this.imaginary); //A stub: to be fixed
 }
 /**
 * Returns a new ComplexNumber that is the
 * sum of <em>this</em> and <em>z</em>.
 * Note: the original ComplexNumber is
 * <b>NOT</b> modified.
 * @param z
 * @return this + z
 */
 public ComplexNumber add(ComplexNumber z) {
 double newReal = this.real + z.real;
 double newImaginary = this.imaginary + z.imaginary;
 return new ComplexNumber(newReal, newImaginary); //A stub: to be fixed
 }
 /**
 * Returns a new ComplexNumber that is the
 * difference of <em>this</em> and <em>z</em>.
 * * Note: the original ComplexNumber is
 * <b>NOT</b> modified.
 * @param z
 * @return this + z
 */
 public ComplexNumber subtract(ComplexNumber z) {
     double newReals = this.real - z.real;
     double newImaginarys = this.imaginary - z.imaginary;
 return new ComplexNumber(newReals, newImaginarys); //A stub: to be fixed
 }
 /**
 * Returns a new ComplexNumber that is the
 * product of <em>this</em> and <em>z</em>.
 * Note: the original ComplexNumber is
 * <b>NOT</b> modified.
 * @param z
 * @return this * z
 */
 public ComplexNumber multiply(ComplexNumber z) {
 double newRealm = (this.real*z.real - this.imaginary*z.imaginary);
     double newImaginarym = (this.real*z.imaginary + this.imaginary*z.real);
 return new ComplexNumber(newRealm, newImaginarym); //A stub: to be fixed
 }
 /**
 * Returns a new ComplexNumber that is
 * the reciprocal of <em>this</em>.
 * Note: the original ComplexNumber is
 * <b>NOT</b> modified.
 * @return 1.0 / this 
 */
 public ComplexNumber reciprocal() {
 double newRealr = this.real / (this.real*this.real + this.imaginary*this.imaginary); 
 double newImaginaryr = -this.imaginary / (this.real*this.real + this.imaginary*this.imaginary); 
 return new ComplexNumber(newRealr, newImaginaryr); //A stub: to be fixed
 }
 /**
 * Returns a new ComplexNumber that is
 * <em>this</em> divided by <em>z</em>.
 * Note: the original ComplexNumber is
 * <b>NOT</b> modified.
 * @param z
 * @return this / z
 */
 public ComplexNumber divide(ComplexNumber z) {
     double newReald = (this.real*z.real + this.imaginary*z.imaginary) / (z.real*z.real + z.imaginary*z.imaginary);
     double newImaginaryd = (this.imaginary* z.real - this.real*z.imaginary) / (z.real*z.real + z.imaginary*z.imaginary);
 return new ComplexNumber(newReald, newImaginaryd); //A stub: to be fixed
 }
 /**
 * Returns a String representation of
 * <em>this</em> in the format:
 * <pre>
 * real +-(optional) i imaginary
 * </pre>
 * If the imaginary part is zero, only the
 * real part is converted to a String.
 * A "+" or "-" is placed between the real
 * and imaginary parts depending on the
 * the sign of the imagrinary part.
 * <p>
 * Examples:
 * <pre>
 * ..println(new ComplexNumber(0,0); -> "0.0"
 * * ..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
 * ..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
 * </pre>
 * @return the String representation.
 */
 @Override
 public String toString() {
 //DO NOT MODIFY THIS CODE!
 String str = "" + this.getReal();
 if (this.getImaginary() == 0.0) {
 return str;
 }
 if (this.getImaginary() > 0) {
 return str + " + i" + this.getImaginary();
 } else {
 return str + " - i" + -this.getImaginary();
 }
 }
}