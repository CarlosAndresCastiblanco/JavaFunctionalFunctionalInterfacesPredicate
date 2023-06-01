/**
 * 
 */
package co.com.java;

import java.util.Collection;
import java.util.function.Predicate;

/**
 * @author carlos.castiblanco
 *
 */
public class MainJavaFunctionalFunctionalInterfacesPredicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final String TU = "TU";
		
		Predicate<String> valid = a -> (a.equals(TU));
		
		String us = "TU";
		
		if(valid.test(us))
			System.out.println("True");
		else
			System.out.println("False");
		
        Predicate<Integer> greaterThanTen = (i) -> i > 10;
        
        // Creating predicate
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20; 
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);
  
        // Calling Predicate method
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
        System.out.println(result2);
	}

}
