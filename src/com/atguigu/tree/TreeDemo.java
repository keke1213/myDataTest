package com.atguigu.tree;


/**
 * @author 莴笋
 * @date 2021/8/14 10:47
 */
public class TreeDemo {
    public static void main(String[] args) {
        HeroNode root = new HeroNode(1, "宋江");
        HeroNode node1 = new HeroNode(2, "卢俊义");
        HeroNode node2 = new HeroNode(3, "吴用");
        HeroNode node3 = new HeroNode(4, "林冲");
        HeroNode node4 = new HeroNode(5, "李逵");
        HeroNode node5 = new HeroNode(6, "鲁智深");
        Tree tree = new Tree(root);
        root.setLeft(node1);
        root.setRight(node2);
        node2.setLeft(node3);
        node2.setRight(node4);
        node3.setLeft(node5);
//            tree.preOrder();

        HeroNode newNode = tree.postSearchNode(6);
        System.out.println(newNode);
    }
}

class Tree {
    private HeroNode root;

    public Tree(HeroNode root) {
        this.root = root;
    }

    public HeroNode getRoot() {
        return root;
    }

    public void setRoot(HeroNode root) {
        this.root = root;
    }

    public void preOrder() {
        if (root == null) {
            System.out.println("空树");
            return;
        }
        root.preOrder();
    }

    public HeroNode perSearchNode(int no) {
        if (root == null) {
            System.out.println("空树");
            return null;
        }
        return root.preSearchNode(no);
    }

    public HeroNode infixSearchNode(int no) {
        if (root == null) {
            System.out.println("空树");
            return null;
        }
        return root.infixOrder(no);
    }

    public HeroNode postSearchNode(int no) {
        if (root == null) {
            System.out.println("空树");
            return null;
        }
        return root.postOrder(no);
    }

}

/**
 * 节点
 */
class HeroNode {
    public int no;
    public String name;
    public HeroNode right;
    public HeroNode left;

    /**
     * 后序查找
     *
     * @return
     */
    public HeroNode postOrder(int no) {
        HeroNode temp = null;
        if (this.left != null) {
            temp = this.left.postOrder(no);
        }
        if (temp != null) {
            return temp;
        }
        if (this.right != null) {
            temp = this.right.postOrder(no);
        }
        if (temp != null) {
            return temp;
        }
        System.out.println("后序查找" + this);
        if (this.no == no) {
            return this;
        }
        return temp;

    }

    /**
     * 中序查找
     *
     * @return
     */
    public HeroNode infixOrder(int no) {
        HeroNode temp = null;
        if (this.left != null) {
            temp = this.left.infixOrder(no);
        }
        if (temp != null) {
            return temp;
        }
        System.out.println("中序查找");
        if (this.no == no) {
            return this;
        }
        if (this.right != null) {
            temp = this.right.infixOrder(no);
        }
        return temp;

    }

    /**
     * 前序查找
     *
     * @return
     */
    public HeroNode preSearchNode(int no) {
        System.out.println("前序查找次数");
        HeroNode temp = null;
        if (this.no == no) {
            return this;
        }
        if (this.left != null) {
            temp = this.left.preSearchNode(no);
        }
        if (temp != null) {
            return temp;
        }
        if (this.right != null) {
            temp = this.right.preSearchNode(no);
        }
        return temp;
    }

    /**
     * 前序遍历
     */
    public void preOrder() {
        System.out.println(this);
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }
}