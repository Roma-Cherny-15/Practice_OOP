package ex03;

public class ViewableResult implements Viewable {
/** ������ ������������ ������ {@linkplain ViewResult} */
@Override
public View getView() {
return new ViewResult();
}
}