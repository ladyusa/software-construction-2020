package lec03simplegeneric;

import java.util.LinkedList;

public class GenericQueue<T> {

    private LinkedList<T> data;

    public GenericQueue() {
        data = new LinkedList<>();
    }

    public void enqueue(T o) {
        // เข้าคิว -- ต่อท้ายแถว
        data.add(o);
    }

    public T dequeue() {
        // ออกจากคิว -- ออกจากหัวแถว
        return data.remove(0);
    }

}

