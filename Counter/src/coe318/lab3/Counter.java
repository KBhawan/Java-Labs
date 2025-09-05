/**
 *
 * @author Kevin Bhawan
 */
package coe318.lab3;
public class Counter {
    private final int max;
    public Counter next;
    private int value;
    
    public Counter(int modulus, Counter left) {
        this.max = modulus;
        this.next = left;
        this.value = 0;
        
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return this.max;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        
        return this.next;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return this.value;
    }
    

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        if (digit >= 0 && digit < this.max) {
            this.value = digit;

    }
   
    
}
    
    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        if (this.value + 1 == this.max) {
            this.value = 0;
        if (this.next != null) 
            this.next.increment();
        }
        else {
            this.value++;
            
        }
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if (this.next == null) {
            return this.value;
        }
    else {
       
        return this.next.getDigit()*getModulus() + this.value;
    }
    
    }
    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}