package pattern.bridge.impl;

// Implementor : 구현 클래스에 대한 기능을 제공. 하위 클래스가 구현해야하는 기능들을 선언한다.
public interface AbstractList<T> {

    void addElement(T obj);

    T deleteElement(int i);

    int insertElement(T obj, int i);

    T getElement(int i);

    int getElementSize();

}
