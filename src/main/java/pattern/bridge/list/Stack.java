package pattern.bridge.list;

import pattern.bridge.impl.AbstractList;

public class Stack<T> extends List<T> {

    public Stack(AbstractList<T> list) {
        super(list);
        System.out.println("Stack 를 구현합니다.");
    }

    public void push(T obj){
        impl.insertElement(obj, 0); // 들어온 애들 순으로 계속 맨 앞에 넣고
    }

    public T pop(){
        return impl.deleteElement(0); // 꺼낼 때 맨 앞에서부터 꺼낸다. firstInLastOut
    }
}
