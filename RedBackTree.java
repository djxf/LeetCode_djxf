
/**
 * 红黑树
 * 
 * 基础概念：二叉搜索树，也叫二叉排序树，满足以下几个条件：
 *  1 若它的左子树不为空，则左子树上所有节点的值均小于根节点的值。
 *  2 若它的右子树不为空，则右子树上所有节点的值均大于根节点的值。
 *  3 它的左右子树也分别为二叉搜索树。
 * 
 * 二叉搜索树查找节点：
 *            1 查找值比当前值大，则搜索右子树。
 *            2 查找值比当前值小，则搜索左子树。
 *            3 查找值等于当前节点值，搜索停止。
 * 
 * 二叉搜索树插入节点：
 *            要插入节点必须找到插入的位置。与查找相似，由于二叉搜索树的特殊性，待插入的节点也需要从根节点进行比较。
 *            小于根节点则与左子树比较，反之与右子树进行比较。直到左子树或右子树为空，则插入到相应为空的位置。
 * 二叉搜索树遍历：
 *      中序遍历。
 * 二叉搜索树：最大值，最小值。
 * 
 * 二叉树搜索树：删除操作。
 *      1 删除叶子节点。
 *      2 删除有一个子节点的树。
 *      3 删除有两个节点的树。
 *  
 * 
 * 二分查找的限制：强制依赖有序数组。
 * 数组的缺点：没有办法快速插入，没有办法扩容。
 *      优点: 内存空间连续，可以根据索引快速访问。
 * 普通二叉搜索树的缺陷：极端情况，二叉搜索树退化成链表。
 * 
 * 
 * 引出：AVL树：在AVL树中任何节点的两个子树的高度最大差别为1.也称为高度平衡树。
 *              1 本身首先是一颗二叉树搜索树。
 *              2 带有平衡功能：每个节点的左右子树的高度之差的绝对值为1
 * 
 * 红黑树的性质：
 *  1 每个节点要么是黑色，要么是红色。
 *  2 根节点是黑色。
 *  3 每个叶子节点(NIL)是黑色
 *  4 每个红色节点的两个子节点一定都是黑色。不能有两个红色节点想连。
 *  5 任意节点到每个叶子节点的路径都包含数量相同的黑节点。俗称黑高。如果一个节点存在黑子节点。那么该节点
 *    肯定有两个子节点。
 * 红黑树并不是一个完美平衡二叉树。但左子树和右子树黑色节点的层数是相等的。称为黑色完美平衡。
 * 
 * 左旋，右旋，变色。
 * 
 *
 * 
 * 
 * 
 * 
 */
public class RedBackTree {
    public static void main(String[] args) {
        
    }
}