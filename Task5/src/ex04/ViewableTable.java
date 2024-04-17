package ex04;
import ex03.ViewableResult;
import ex03.View;
/** ConcreteCreator
* (������ ��������������
* Factory Method)<br>
* ��������� �����,
* "�����������" �������
* @author xone
* @version 1.0
* @see ViewableResult
* @see ViewableTable#getView()
*/
public class ViewableTable extends ViewableResult {
/** ������ ������������ ������ {@linkplain ViewTable} */
@Override
public View getView() {
return new ViewTable();
}
}