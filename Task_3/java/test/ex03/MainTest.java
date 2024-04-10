package ex03;
import org.junit.Test;


import ex03.Item2d;
import ex03.View;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import junit.framework.Assert;
import java.io.IOException;
/** ¬ыполн€ет тестирование разработанных классов.
 */

public class MainTest {

  @Test
  public void testCalc() {
	ViewResult view = new ViewResult(3);
    Item2d item = new Item2d();
    int ctr = 0;
    item.setVariables("+380924578761", "PEOPLEnet");
    view.getItems().get(ctr).setPhoneNumber("+380924578761");
    view.viewInit();
  
    assertTrue("expected:<" + item + "> but was:<" + view.getItems().get(ctr) + ">", view.getItems().get(ctr).equals(item));
    ctr++;
    
    item.setVariables("+380505336907", "Vodafone");
    view.getItems().get(ctr).setPhoneNumber("+380505336907");
    view.viewInit();
   
    assertTrue("expected:<" + item + "> but was:<" + view.getItems().get(ctr) + ">", view.getItems().get(ctr).equals(item));
    ctr++;
    item.setVariables("+380984007208", "KyivStar");
    view.getItems().get(ctr).setPhoneNumber("+380984007208");
    view.viewInit();
   
    assertTrue("expected:<" + item + "> but was:<" + view.getItems().get(ctr) + ">", view.getItems().get(ctr).equals(item));

  }

  

  @Test
  public void testRestore() {
	  ViewResult view1 = new ViewResult(1000);
	  ViewResult view2 = new ViewResult();
	  
	  view1.init();
	  
	  try {
	  view1.viewSave();
	  } catch (IOException e) {
	  Assert.fail(e.getMessage());
	  }
	 
	  try {
	  view2.viewRestore();
	  } catch (Exception e) {
	  Assert.fail(e.getMessage());
	  }
	  
	  assertEquals(view1.getItems().size(), view2.getItems().size());
	  
	  assertTrue("containsAll()", view1.getItems().containsAll(view2.getItems()));
  }
}