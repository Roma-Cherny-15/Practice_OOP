package ex06;

import ex05.Command;
/** ������������
* ������ ��� ���������
* � ���������� �����
* ������������ ������;
* ������ Worker Thread
* @author xone
* @version 1.0
* @see Command
*/
public interface Queue {
/** ��������� ����� ������ � �������;
* ������ Worker Thread
* @param cmd ������
*/
void put(Command cmd);
/** ������� ������ �� �������;
* ������ Worker Thread
* @return ��������� ������
*/
Command take();
}
