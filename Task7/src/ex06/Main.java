package ex06;

import ex03.View;
import ex03.ViewableResult;
import ex05.ChangeConsoleCommand;
import ex05.GenerateConsoleCommand;
import ex05.Menu;
import ex05.ViewConsoleCommand;
/** ���������� � �����������
* �����������; �������� ����������
* ������������ ������ main()
* @author xone
* @version 5.0
* @see Main#main
*/
public class Main {
/** ������, ����������� ��������� {@linkplain View};
* ����������� ��������� �������� {@linkplain ex01.Item2d};

15

* ���������������� � ������� Factory Method
*/
private View view = new ViewableResult().getView();
/** ������ ������ {@linkplain Menu};
* ������������ (������ Command)
*/
private Menu menu = new Menu();
/** ��������� ������ ������������ */
public void run() {
menu.add(new ViewConsoleCommand(view));
menu.add(new GenerateConsoleCommand(view));
menu.add(new ChangeConsoleCommand(view));
menu.add(new ExecuteConsoleCommand(view));
menu.execute();
}
/** ����������� ��� ������� ���������
* @param args ��������� ������� ���������
*/
public static void main(String[] args) {
Main main = new Main();
main.run();
}
}
