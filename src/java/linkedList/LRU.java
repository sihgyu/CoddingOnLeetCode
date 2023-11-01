package linkedList;

import java.util.HashMap;
import java.util.Map;

public class LRU {
    private int size;
    private int capacity;
    private Map<Integer, DListNode> cache = new HashMap<>();
    private DListNode head, tail;

    class DListNode {
        int key;
        int value;
        DListNode prev;
        DListNode next;

        public DListNode() {
        }

        public DListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public LRU(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        DListNode head = new DListNode();
        DListNode tail = new DListNode();
        head.next = tail;
        tail.next = head;
    }

    public int get(int i) {
        DListNode listNode = cache.get(i);
        if (listNode == null){
            return -1;
        }
        moveToHead(listNode);
        return listNode.value;
    }

    public void put(int key,int value){
        DListNode dListNode = cache.get(key);
        if (dListNode == null){
            DListNode node = new DListNode(key,value);
            cache.put(key,node);
            addToHead(node);
            ++size;
            if (size > capacity){
                DListNode tailNode = tail.prev;
                removeTail(tailNode);
                cache.remove(tailNode.key);
                --size;
            }
        }else {
            dListNode.value = value;
            moveToHead(dListNode);
        }
    }

    private void moveToHead(DListNode listNode) {
        removeNode(listNode);
        addToHead(listNode);
    }

    private void addToHead(DListNode listNode) {
        listNode.prev = head;
        listNode.next = head.next;
        head.next.prev = listNode;
        head.next = listNode;
    }

    private void removeNode(DListNode listNode){
        listNode.prev.next = listNode.next;
        listNode.next.prev = listNode.prev;
    }

    private void removeTail(DListNode listNode){
        DListNode removeNode = listNode.prev;
        removeNode(removeNode);

    }



}
