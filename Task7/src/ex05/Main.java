package ex05;
/** ���������� � �����������
* �����������; c������� ����������
* ������������ ������ main()
* @author xone
* @version 4.0
* @see Main#main
*/
public class Main {
/** ����������� ��� ������� ���������;
* �������� ����� {@linkplain Application#run()}
* @param args ��������� ������� ���������
*/
public static void main(String[] args) {
Application app = Application.getInstance();
app.run();
}
}