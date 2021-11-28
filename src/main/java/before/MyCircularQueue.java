package before;

import java.util.ArrayList;


import java.util.ArrayList;

public class MyCircularQueue {
    ArrayList<Integer> arrayList;
    int size = 0;
    int capacity = 0;

    public MyCircularQueue(int k) {
        arrayList = new ArrayList<>(k);
        capacity = k;
    }

    public boolean enQueue(int value) {
        if (!isFull()) {
            arrayList.add(value);
            size++;
            return true;
        }
        return false;
    }

    public boolean deQueue() {
        if (!isEmpty()) {
            arrayList.remove(0);
            size--;
            return true;
        }
        return false;
    }

    public int Front() {
        if (!isEmpty())
        return arrayList.get(0);
        return -1;
    }

    public int Rear() {
        if (!isEmpty())
        return arrayList.get(size - 1);
        return -1;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public boolean isFull() {

        return size == capacity ? true : false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */