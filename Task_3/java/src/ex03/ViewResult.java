package ex03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;


public class ViewResult implements View {

    
    private static final String FNAME = "Item2d.bin";

  
    private static final int DEFAULT_NUM = 10;

    
    private ArrayList<Item2d> items2d = new ArrayList<Item2d>();

    public ViewResult() {
        this(DEFAULT_NUM);
    }

    public ViewResult(int n) {
        for (int ctr = 0; ctr < n; ctr++) {
            items2d.add(new Item2d());
        }
    }

    public ArrayList<Item2d> getItems() {
        return items2d;
    }

 
    public String GenerateRandomPhoneNumber() {
        Random random = new Random();

        int prefix;
        switch (random.nextInt(15)) {
        case 0:
          prefix = 50;
          break;
        case 1:
          prefix = 66;
          break;
        case 2:
          prefix = 95;
          break;
        case 3:
          prefix = 99;
          break;
        case 4:
          prefix = 67;
          break;
        case 5:
          prefix = 68;
          break;
        case 6:
          prefix = 96;
          break;
        case 7:
          prefix = 97;
          break;
        case 8:
          prefix = 98;
          break;
        case 9:
          prefix = 63;
          break;
        case 10:
          prefix = 73;
          break;
        case 11:
          prefix = 93;
          break;
        case 12:
          prefix = 91;
          break;
        case 13:
          prefix = 92;
          break;
        default:
          prefix = 94;
          break;
        }

        String phoneNumber = "+380" + prefix + String.format("%07d", random.nextInt(10000000));

        return phoneNumber;

      }
    
    public String GetMobileOperatorByPhoneNumber(String phoneNumber) {
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
    	return mobileOperator;
    
    }
    public void FillCollectionWithRandom() {
    	for (Item2d item : items2d) {
    		item.setPhoneNumber(GenerateRandomPhoneNumber());
    	}
    }
 

    public void init() {
        for (Item2d item : items2d) {
            item.setResult(GetMobileOperatorByPhoneNumber(item.getPhoneNumber()));
        }
    }

    
    @Override
    public void viewInit() {
        init();
    }

   
    @Override
    public void viewSave() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(items2d);
        os.flush();
        os.close();
    }

   
    @SuppressWarnings("unchecked")
    @Override
    public void viewRestore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        items2d = (ArrayList<Item2d>) is.readObject();
        is.close();
    }

   
    @Override
    public void viewHeader() {
        System.out.println("Calculating...");
    }

  
    @Override
    public void viewBody() {
        for (Item2d item : items2d) {
            System.out.println("\nPhone number: " + item.getPhoneNumber() + "	mobile operator: " + item.getResult());
  
        }
    }

    
    @Override
    public void viewFooter() {
        System.out.println("\nEnd.\n");
    }

  
    @Override
    public void viewShow() {
        viewHeader();
        viewBody();
        viewFooter();
    }
}