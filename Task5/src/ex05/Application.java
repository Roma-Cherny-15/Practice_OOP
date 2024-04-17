package ex05;
import ex03.View;
import ex04.ViewableTable;
/** ��������� � ����������
* ����; ��������� ������
* Singleton
* @author xone
* @version 1.0
*/
public class Application {
/** ������ �� ��������� ������ Application; ������ Singleton
* @see Application
*/
private static Application instance = new Application();
/** �������� �����������; ������ Singleton
* @see Application
*/
private Application() {}
/** ���������� ������ �� ��������� ������ Application;
* ������ Singleton
* @see Application
*/
public static Application getInstance() {
return instance;
}
/** ������, ����������� ��������� {@linkplain View};
* ����������� ��������� �������� {@linkplain ex01.Item2d};
* ���������������� � ������� Factory Method
*/
private View view = new ViewableTable().getView();
/** ������ ������ {@linkplain Menu};
* ������������ (������ Command)
*/
private Menu menu = new Menu();
/** ��������� ������ ������������
* @see Application
*/
public void run() {
menu.add(new ViewConsoleCommand(view));
menu.add(new GenerateConsoleCommand(view));


menu.add(new ChangeConsoleCommand(view));
menu.add(new SaveConsoleCommand(view));
menu.add(new RestoreConsoleCommand(view));
menu.execute();
}
}