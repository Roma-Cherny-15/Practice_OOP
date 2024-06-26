package ex06;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

import ex03.Item2d;
import ex03.View;
import ex03.ViewResult;
import ex03.ViewableResult;
import ex05.*;
import junit.framework.Assert;
import java.io.IOException;
/** ������������ ������
* ChangeItemCommand
* @author xone
* @version 4.0
* @see ChangeItemCommand
*/
public class MainTest {
	/** �������� ������ {@linkplain SaveConsoleCommand#execute} */
	@Test
	public void testRestoreCommand() {
		View view = new ViewableResult().getView();
		GenerateConsoleCommand generateCmd = new GenerateConsoleCommand(view);
		generateCmd.execute();
		SaveConsoleCommand saveCmd = new SaveConsoleCommand(view);
		RestoreConsoleCommand restoreCmd = new RestoreConsoleCommand(view);
		saveCmd.execute();

		try {
			restoreCmd.execute();
		} 
		catch (Exception e) {
			  Assert.fail(e.getMessage());
			  }
	}
	
/** �������� ������ {@linkplain GenerateConsoleCommand#execute()} */
@Test
public void testGenerateCommand() {
View view = new ViewableResult().getView();
GenerateConsoleCommand cmd = new GenerateConsoleCommand(view);

try {
	cmd.execute();
} 
catch (Exception e) {
	  Assert.fail(e.getMessage());
	  }
}}
