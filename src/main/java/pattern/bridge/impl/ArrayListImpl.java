package pattern.bridge.impl;

import java.util.ArrayList;

// ConcreteImplementor : Implementor 에 선언된 기능을 실제로 구현했다. 여러 구현 방식의 클래스가 만들어 질 수 있다.
public class ArrayListImpl<T> implements AbstractList<T> {

    private final ArrayList<T> arrayList;

    public ArrayListImpl() {
        this.arrayList = new ArrayList<>();
    }

    @Override
    public void addElement(T obj) {
        arrayList.add(obj);
    }

    @Override
    public T deleteElement(int i) {
        return arrayList.remove(i);
    }

    @Override
    public int insertElement(T obj, int i) {
        arrayList.add(i, obj);
        return i;
    }

    @Override
    public T getElement(int i) {
        return arrayList.get(i);
    }

    @Override
    public int getElementSize() {
        return arrayList.size();
    }

    @Override
    public String toString() {
        return arrayList.toString();
    }
}
