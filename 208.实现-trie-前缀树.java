/*
 * @lc app=leetcode.cn id=208 lang=java
 *
 * [208] 实现 Trie (前缀树)
 */

// @lc code=start
class Trie {

    private TireNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TireNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TireNode node = root;
        for(int i = 0;i < word.length();i++){
            char currChar = word.charAt(i);
            if(!node.containsKey(currChar)){
                node.put(currChar,new TireNode());
            }
            node = node.get(currChar);
        }
        node.setEnd();
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TireNode node = searchPrefix(word);
        return node != null && node.isEnd();
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TireNode node = searchPrefix(prefix);
        return node != null;
    }

    public TireNode searchPrefix(String word){
        TireNode node = root;
        for(int i = 0;i < word.length();i++){
            char currChar = word.charAt(i);
            if(node.containsKey(currChar)){
                node = node.get(currChar);
            }else{
                return null;
            }
        }
        return node;
    }

}

class TireNode{

    private TireNode[] links;

    private boolean isEnd;

    private static final int R = 26;
    
    //构造函数
    public TireNode(){
        links = new TireNode[R];
    }

    public void put(char ch,TireNode node){
        links[ch - 'a'] = node;
    }

    public boolean containsKey(char ch){
        return links[ch - 'a'] != null;
    }

    public TireNode get(char ch){
        return links[ch - 'a'];
    }
    
    public void setEnd() {
        isEnd = true;
    }
    public boolean isEnd() {
        return isEnd;
    }
}




/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
// @lc code=end

