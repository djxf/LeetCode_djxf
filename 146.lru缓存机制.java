import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=146 lang=java
 *
 * [146] LRU缓存机制
 */

// @lc code=start
class LRUCache {

    static class Node {
        public int key,value;
        public Node next,prev;
        public Node(int k,int v){
            this.key = k;
            this.value = v;
        }
    }

    static class DoubleList{
        //头尾虚节点
        private Node head,tail;
        //链表元素数不包括头尾虚节点
        private int size;
        public DoubleList(){
            head = new Node(0,0);
            tail = new Node(0,0);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }
        
        //在头部添加节点x
        public void addFirst(Node node){
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
            size++;
        }

        //删除链表中的x节点 （x存在？）
        public void remove(Node node){
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }

        //删除链表中的最后一个节点 并返回该节点
        public Node removeLast(){
            if(tail.prev == head){
                return null;
            }
            Node last = tail.prev;
            remove(last);
            return last;
        }
        
        //返回链表长度
        public int size(){
            return size;
        }


    }

    private HashMap<Integer,Node> map;
    private DoubleList cache;
    private int maxSize;

    public LRUCache(int capacity) {
        this.maxSize = capacity;
        map = new HashMap<>();
        cache = new DoubleList();
    }
    
    public int get(Integer key) {
        if(!map.containsKey(key)){
            return -1;
        }

        int  value = map.get(key).value;
        put(key, value);//利用put方法将值提前
        return value;

    }
    
    public void put(int key, int value) {
        Node node = new Node(key,value);
        if(map.containsKey(key)){
            cache.remove(map.get(key));
            cache.addFirst(node);
            map.put(key, node);
        }else{
            if(maxSize == cache.size){
                Node last = cache.removeLast();
                map.remove(last.key);
            }
            cache.addFirst(node);
            map.put(key, node);
        }
    }

   

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end

