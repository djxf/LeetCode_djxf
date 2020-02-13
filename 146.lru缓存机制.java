import java.util.LinkedHashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=146 lang=java
 *
 * [146] LRU缓存机制
 */

// @lc code=start
class LRUCache {

    private final LinkedHashMap<Integer,Integer> map;
    private final int maxSize;
    private int size = 0;
    public LRUCache(final int capacity) {
        if(capacity <= 0){
            throw new IllegalArgumentException("capacity <= 0");
        }
        this.maxSize = capacity;
        map = new LinkedHashMap<Integer,Integer>(0,0.75f,true);

    }
    
    public int get(int key) {
        // if(Integer.toString(key) == null){
        //     throw new IllegalArgumentException("key == null");
        // }
        int value = (int)map.get(key);
        if(Integer.toString(value) != null){
            //size--;
            return value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        map.put(key,value);
       
        size++;

        trimToSize(size);
    }

    public void trimToSize(int size){
        int mSize = size;
        while(mSize > maxSize){
            Map.Entry<Integer, Integer> toEvict = null;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    toEvict = entry;
                }
                // END LAYOUTLIB CHANGE

                if (toEvict == null) {
                    break;
                }
                int key = (int)toEvict.getKey();
                map.remove(key);
                mSize--;
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

