package ex06;

import ex05.Command;
/** ѕредставл€ет
* методы дл€ помещени€
* и извлечени€ задач
* обработчиком потока;
* шаблон Worker Thread
* @author xone
* @version 1.0
* @see Command
*/
public interface Queue {
/** ƒобавл€ет новую задачу в очередь;
* шаблон Worker Thread
* @param cmd задача
*/
void put(Command cmd);
/** ”дал€ет задачу из очереди;
* шаблон Worker Thread
* @return удал€ема€ задача
*/
Command take();
}
