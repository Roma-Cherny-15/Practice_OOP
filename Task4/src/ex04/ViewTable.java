package ex04;
import java.util.Formatter;
import ex03.Item2d;
import ex03.ViewResult;
/** ConcreteProduct
* (������ ��������������
* Factory Method)<br>
* ����� � ���� �������
* @author xone
* @version 1.0
* @see ViewResult
*/



public class ViewTable extends ViewResult {
/** ���������� ������ ������� �� ��������� */
private static final int DEFAULT_WIDTH = 30;
/** ������� ������ ������� */
private int width;
/** ������������� {@linkplain ViewTable#width width}
* ��������� {@linkplain ViewTable#DEFAULT_WIDTH DEFAULT_WIDTH}<br>
* ���������� ����������� ����������� {@linkplain ViewResult#ViewResult() ViewResult()}
*/
public ViewTable() {
width = DEFAULT_WIDTH;
}
/** ������������� {@linkplain ViewTable#width} ��������� <b>width</b><br>
* ���������� ����������� ����������� {@linkplain ViewResult#ViewResult() ViewResult()}
* @param width ���������� ������ �������
*/
public ViewTable(int width) {
this.width = width;
}


/** ������������� {@linkplain ViewTable#width} ��������� <b>width</b><br>
* ���������� ����������� ����������� {@linkplain ViewResult#ViewResult(int n) ViewResult(int
* @param width ���������� ������ �������
* @param n ���������� ��������� ���������; ��������� �����������������
*/
public ViewTable(int width, int n) {
super(n);
this.width = width;
}
/** ������������� ���� {@linkplain ViewTable#width} ��������� <b>width</b>
* @param width ����� ������ �������
* @return �������� ���������� <b>width</b> ������ �������
*/
public int setWidth(int width) {
return this.width = width;
}
/** ���������� �������� ���� {@linkplain ViewTable#width}
* @return ������� ������ �������
*/
public int getWidth() {
return width;
}
/** ������� ������������ ����������� ������� {@linkplain ViewTable#width} �������� */
private void outLine() {
for(int i = width; i > 0; i--) {
System.out.print('-');
}
}
/** �������� {@linkplain ViewTable#outLine()}; ��������� ����� ������������ ������ */
private void outLineLn() {
outLine();
System.out.println();
}
/** ������� ��������� ������� ������� {@linkplain ViewTable#width} �������� */
private void outHeader() {
Formatter fmt = new Formatter();
fmt.format("%s%d%s%2$d%s", "%", (width-3)/2, "s | %", "s\n");
System.out.printf(fmt.toString(), "PhoneNumber ", "MobileOperator ");
}
/** ������� ���� ������� ������� {@linkplain ViewTable#width} �������� */
private void outBody() {
Formatter fmt = new Formatter();
fmt.format("%%-%ds | %%-%ds%%n", (width-3)/2, (width-3)/2);
for(Item2d item : getItems()) {
System.out.printf(fmt.toString(), item.getPhoneNumber(), item.getMobileOperator());
}
}
/** ���������� (����������, overloading) ������ �����������;
* ������������� ���� {@linkplain ViewTable#width} ��������� <b>width</b><br>
* �������� ����� {@linkplain ViewResult#viewInit() viewInit()}
* @param width ����� ������ �������

9

*/
public final void init(int width) { // method overloading
this.width = width;
viewInit();
}
/** ���������� ������ �����������;
* ������������� ���� {@linkplain ViewTable#width} ��������� <b>width</b><br>
* ��� ������� {@linkplain ViewTable} �������� ����� {@linkplain ViewTable#init(double
* @param width ����� ������ �������.
* @param stepX ���������� ������ <b>init(double)</b>
*/
public final void init(int width, double stepX) { // method overloading
this.width = width;
init();
}
/** ��������������� (���������, overriding) ������ �����������;
* ������� �������������� ��������� � �������� ����� �����������
* {@linkplain ViewResult#init(double stepX) init(double stepX)}<br>
* {@inheritDoc}
*/
@Override
public void init() { // method overriding
System.out.print("Initialization... ");
super.init();
System.out.println("done. ");
}
/** ����� �������� �������<br>{@inheritDoc} */
@Override
public void viewHeader() {
outHeader();
outLineLn();
}
/** ����� �������� �������<br>{@inheritDoc} */
@Override
public void viewBody() {
outBody();
}
/** ����� �������� �������<br>{@inheritDoc} */
@Override
public void viewFooter() {
outLineLn();
}
}