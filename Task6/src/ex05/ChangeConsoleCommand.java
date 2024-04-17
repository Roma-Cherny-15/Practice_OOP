package ex05;
import ex03.Item2d;
import ex03.View;
import ex03.ViewResult;
/** ���������� �������
* Change item;
* ������ Command
* @author xone
* @version 1.0
*/
public class ChangeConsoleCommand
extends ChangeItemCommand
implements ConsoleCommand {
/** ������, ����������� ��������� {@linkplain View};
* ����������� ��������� �������� {@linkplain ex01.Item2d}
*/
private View view;
/** ���������� ���� {@linkplain ChangeConsoleCommand#view}
* @return �������� {@linkplain ChangeConsoleCommand#view}
*/
public View getView() {
return view;
}
/** ������������� ���� {@linkplain ChangeConsoleCommand#view}
* @param view �������� ��� {@linkplain ChangeConsoleCommand#view}
* @return ����� �������� {@linkplain ChangeConsoleCommand#view}
*/
public View setView(View view) {
return this.view = view;
}
/** �������������� ���� {@linkplain ChangeConsoleCommand#view}
* @param view ������, ����������� ��������� {@linkplain View}
*/
public ChangeConsoleCommand(View view) {
this.view = view;
}
@Override
public char getKey() {
return 'c';
}
@Override
public String toString() {
return "'c'hange";
}
@Override
public void execute() {
System.out.println("Change item: scale factor " + setOffset(Math.random() * 100.0));
for (Item2d item : ((ViewResult)view).getItems()) {
super.setItem(item);
super.execute();
}
view.viewShow();
}
}