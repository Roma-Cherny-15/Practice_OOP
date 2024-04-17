package ex05;
import ex03.Item2d;
/** �������
* Change item;
* ������ Command
* @author xone
* @version 1.0
*/
public class ChangeItemCommand implements Command {
/** �������������� ������; ������ Command */
private Item2d item;
/** �������� �������; ������ Command */
private double offset;
/** �������������� ���� {@linkplain ChangeItemCommand#item}
* @param item �������� ��� {@linkplain ChangeItemCommand#item}
* @return ����� �������� {@linkplain ChangeItemCommand#item}
*/
public Item2d setItem(Item2d item) {
return this.item = item;
}
/** ���������� ���� {@linkplain ChangeItemCommand#item}
* @return �������� {@linkplain ChangeItemCommand#item}
*/
public Item2d getItem() {
return item;
}
/** �������������� ���� {@linkplain ChangeItemCommand#offset}
* @param offset �������� ��� {@linkplain ChangeItemCommand#offset}
* @return ����� �������� {@linkplain ChangeItemCommand#offset}
*/
public double setOffset(double offset) {
return this.offset = offset;
}
/** ���������� ���� {@linkplain ChangeItemCommand#offset}
* @return �������� {@linkplain ChangeItemCommand#offset}
*/
public double getOffset() {
return offset;
}
@Override
public void execute() {
item.setPhoneNumber(item.getPhoneNumber());
}
}