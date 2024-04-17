package ex04;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import junit.framework.Assert;
import java.io.IOException;
import ex03.Item2d;
/** ��������� ������������
* ������������� �������.
* @author xone
* @version 3.0
*/
public class MainTest {
/** �������� �������� ���������������� ������ {@linkplain ViewTable} */
@Test
public void testCalc() {
ViewTable tbl = new ViewTable(10, 5);
assertEquals(10, tbl.getWidth());
assertEquals(5, tbl.getItems().size());

try {
	tbl.init();
} 
catch (Exception e) {
	Assert.fail(e.getMessage());
	}
}

/** �������� ������������. ������������ �������������� ������. */
@Test
public void testRestore() {
ViewTable tbl1 = new ViewTable(10, 1000);
ViewTable tbl2 = new ViewTable();
// �������� �������� ������� �� ��������� ����� ���������� ���������
tbl1.init();
// �������� ��������� tbl1.items
try {
tbl1.viewSave();
} catch (IOException e) {
Assert.fail(e.getMessage());
}
// �������� ��������� tbl2.items
try {
tbl2.viewRestore();
} catch (Exception e) {
Assert.fail(e.getMessage());
}
// ������ ��������� ������� �� ���������, ������� ���������
assertEquals(tbl1.getItems().size(), tbl2.getItems().size());
// ������ ��� �������� ������ ���� �����.
// ��� ����� ����� ���������� ����� equals
assertTrue("containsAll()", tbl1.getItems().containsAll(tbl2.getItems()));
}}
