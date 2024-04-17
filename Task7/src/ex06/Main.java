package ex06;

import ex03.View;
import ex03.ViewableResult;
import ex05.ChangeConsoleCommand;
import ex05.GenerateConsoleCommand;
import ex05.Menu;
import ex05.ViewConsoleCommand;
/** Вычисление и отображение
* результатов; содержит реализацию
* статического метода main()
* @author xone
* @version 5.0
* @see Main#main
*/
public class Main {
/** Объект, реализующий интерфейс {@linkplain View};
* обслуживает коллекцию объектов {@linkplain ex01.Item2d};

15

* инициализируется с помощью Factory Method
*/
private View view = new ViewableResult().getView();
/** Объект класса {@linkplain Menu};
* макрокоманда (шаблон Command)
*/
private Menu menu = new Menu();
/** Обработка команд пользователя */
public void run() {
menu.add(new ViewConsoleCommand(view));
menu.add(new GenerateConsoleCommand(view));
menu.add(new ChangeConsoleCommand(view));
menu.add(new ExecuteConsoleCommand(view));
menu.execute();
}
/** Выполняется при запуске программы
* @param args параметры запуска программы
*/
public static void main(String[] args) {
Main main = new Main();
main.run();
}
}
