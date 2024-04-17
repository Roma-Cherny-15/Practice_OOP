package ex05;
/** »нтерфейс
* консольной команды;
* шаблон Command
* @author xone
* @version 1.0
*/
public interface ConsoleCommand extends Command {
/** √ор€ча€ клавиша команды;
* шаблон Command
* @return символ гор€чей клавиши
*/
public char getKey();
}