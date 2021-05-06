/**
 * Write a description of class Expression here.
 *
 * @author (Kelvin Likollari)
 * @version (05.05.2021)
 */
public class Expression extends Node
{
   
    /**
     * Evaluate this Expression.
     * @param storage The "memory" to use during the execution
     */
    public void evaluate(final int x) {
        // to be implemented in subclasses
    }
    
    public Expression simplify() {
        // simplify the expression.
        // to be implemented in all the subclasses.
        return null;
    }
}
  
