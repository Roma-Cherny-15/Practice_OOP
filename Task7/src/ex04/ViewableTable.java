package ex04;
import ex03.ViewableResult;
import ex03.View;
/** ConcreteCreator
* (шаблон проектировани€
* Factory Method)<br>
* ќбъ€вл€ет метод,
* "фабрикующий" объекты
* @author xone
* @version 1.0
* @see ViewableResult
* @see ViewableTable#getView()
*/
public class ViewableTable extends ViewableResult {
/** —оздаЄт отображаемый объект {@linkplain ViewTable} */
@Override
public View getView() {
return new ViewTable();
}
}