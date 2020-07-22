package generics;

import javax.naming.Name;

public class TreeItem<T> implements Next {
    private T value;
    private TreeItem<T> next;

    public TreeItem(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public TreeItem<T> getNext() {
        return next;
    }

    public void setNext(TreeItem<T> next) {
        this.next = next;
    }

    @Override
    public Object doWork() {
        return this.value;
    }
}
