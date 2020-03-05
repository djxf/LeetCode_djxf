import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

import com.sun.corba.se.impl.orbutil.graph.Node;

/*
 * @lc app=leetcode.cn id=559 lang=java
 *
 * [559] N叉树的最大深度
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    

    public int maxDepth(Node root) {
        //层次遍历
        if(root == null){
            return 0;
        }
        if(root.children.size() == 0){
            return 1;
        }
        Queue<Node> node = new LinkedList<>();
        int depth = 0;
        node.add(root);
        while(!node.isEmpty()){
            int levelNum = node.size();
            depth++;
            for(int i = 0;i < levelNum;i++){
                Node n = node.poll();
                node.addAll(n.children);
            }
        }
        return depth;
    }

    //递归
    // public int dg(){
        // int depth = 0;
        // if(root == null){
        //     return 0;
        // }else{
        //     for(Node n : root.children){
        //         depth = Math.max(depth, maxDepth(n));
        //     }
        // }
        // return depth+1;
        
    // }
}
// @lc code=end

