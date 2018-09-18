package leetcode.all.solution501_600;

import java.util.ArrayList;
import java.util.List;

/**
 * 590. N叉树的后序遍历(未使用迭代算法)
 *
 * 给定一个N叉树，返回其节点值的后序遍历。
 *
 * 例如，给定一个 3叉树 :
 *
 * https://leetcode-cn.com/static/images/problemset/NaryTreeExample.png
 *
 * 返回其后序遍历: [5,6,3,2,4,1].
 * 说明: 递归法很简单，你可以使用迭代法完成此题吗?
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
class Solution590 {

    public List<Integer> postorder(Node root) {
        List<Integer> list=new ArrayList<>();
        todo(root,list);
        return list;
    }

    public void todo(Node root,List<Integer> list) {
        if(root!=null){
            if(root.children!=null){
                for(Node node:root.children){
                    todo(node,list);
                }
            }
            list.add(root.val);
        }
    }

    public static void main(String[] args){
        Node node5=new Node(5,null);
        Node node6=new Node(6,null);
        List<Node> children3=new ArrayList<>();
        children3.add(node5);
        children3.add(node6);

        Node node3=new Node(3,children3);
        Node node2=new Node(2,null);
        Node node4=new Node(4,null);

        List<Node> children1=new ArrayList<>();
        children1.add(node3);
        children1.add(node2);
        children1.add(node4);
        Node root=new Node(1,children1);

        List<Integer> r=new Solution590().postorder(root);
        for(Integer i:r){
            System.out.print(i+" ");
        }

    }
}
