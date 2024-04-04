# Завдання 2

### Індивідуальне завдання: Визначити мобільного оператора за заданим номером абонента.

````java GetMobileOperator.java
package ex01;

public class GetMobileOperator {

	 private Item2d result;

	    public GetMobileOperator() {
	        result = new Item2d();
	    }

	    public Item2d GetMobileOperatorByPhoneNumber(String phoneNumber) {
	    	String mobileOperator = "";
	    	if (phoneNumber.startsWith("+38091")) {
	    		mobileOperator = "3Mob";
	        }
	    	else if (phoneNumber.startsWith("+38092") ) {
	    		mobileOperator = "PEOPLEnet";
	    	}
	    	else if (phoneNumber.startsWith("+38094") ) {
	    		mobileOperator = "Інтертелеком";
	    	}
	    	else if (phoneNumber.startsWith("+38050") 
	                || phoneNumber.startsWith("+38066") 
	                || phoneNumber.startsWith("+38095") 
	                || phoneNumber.startsWith("+38099")) {
	    		mobileOperator = "Vodafone";
	        } else if (phoneNumber.startsWith("+38063") 
	                || phoneNumber.startsWith("+38073") 
	                || phoneNumber.startsWith("+38093")) {
	        	mobileOperator = "LifeCell";
	        } else if (phoneNumber.startsWith("+38067") 
	        		|| phoneNumber.startsWith("+38068") 
	                || phoneNumber.startsWith("+38096") 
	                || phoneNumber.startsWith("+38097") 
	                || phoneNumber.startsWith("+38098")) {
	        	mobileOperator = "KyivStar";
	        } else if (phoneNumber.startsWith("+38091") 
	                || phoneNumber.startsWith("+38092") 
	                || phoneNumber.startsWith("+38032")) {
	        	mobileOperator = "Ukrtelecom (3mob)";
	        } else {
	        	mobileOperator = "Unknown operator";
	        }
	    	result.setVariables(phoneNumber, mobileOperator);
	    	return result;
	    
	    }
}
````
