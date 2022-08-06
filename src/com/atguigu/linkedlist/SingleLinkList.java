package com.atguigu.linkedlist;


import java.util.Stack;

/**
 * 单链表
 */
public class SingleLinkList {
    public static void main(String[] args) {
        HeroCode hero1 = new HeroCode(1, "宋江", "及时雨");
        HeroCode newHero1 = new HeroCode(1, "SongJiang", "rail");
        HeroCode hero2 = new HeroCode(2, "卢俊义", "玉麒麟");
        HeroCode hero3 = new HeroCode(3, "吴用", "智多星");
        HeroCode hero4 = new HeroCode(4, "林冲", "豹子头");
        LinkListDemo linkListDemo = new LinkListDemo();


//        linkListDemo.add(hero3);
        linkListDemo.add(hero3);
//        linkListDemo.add(hero2);
        linkListDemo.add(hero2);
//        linkListDemo.add(hero4);
        linkListDemo.add(hero4);
//        linkListDemo.add(hero1);
        linkListDemo.add(hero1);
//        linkListDemo.list();
//        linkListDemo.upData(newHero1);
//        linkListDemo.delNode(2);
//        linkListDemo.list();
//        System.out.println( linkListDemo.getNum());
//        System.out.println( linkListDemo.indexNode(5));
//        linkListDemo.flipList();
//        linkListDemo.list();
        linkListDemo.flipShow();
    }

}

class LinkListDemo {
    private HeroCode headCode = new HeroCode(0, "", "");

    //增
    public void add(HeroCode heroCode) {
        HeroCode temp = headCode;

        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.id > heroCode.id) {
                break;
            } else if (temp.next.id == heroCode.id) {
                System.out.printf("%d排名也有人选\n", heroCode.id);
                return;
            }
            temp = temp.next;
        }
        heroCode.next = temp.next;
        temp.next = heroCode;
    }

    //遍历
    public void list() {
        if (headCode.next == null) {
            System.out.println("链表为空");
            return;
        }
        HeroCode temp = headCode.next;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    //改
    public void upData(HeroCode newNode) {
        HeroCode temp = headCode.next;
        boolean flag = false;
        if (temp == null) {
            System.out.println("链表为空");
            return;
        }
        while (temp != null) {
            if (temp.id == newNode.id) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = newNode.name;
            temp.nickName = newNode.nickName;
        } else {
            System.out.printf("没有找到%d节点\n", newNode.id);
        }
    }

    //删
    public void delNode(int id) {
        HeroCode temp = headCode;
        boolean flag = false;
        if (temp.next == null) {
            System.out.println("链表为空");
            return;
        }
        while (temp.next != null) {
            if (temp.next.id == id) {//找到要删节点的前一个位置
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            HeroCode t = temp.next;
            temp.next = t.next;
            System.out.println("删除成功");

        } else {
            System.out.printf("没有找到编号%d的英雄", id);
        }
    }

    //获取头
    public HeroCode getHead() {
        return headCode;
    }

    //获取节点数
    public int getNum() {
        HeroCode temp = headCode.next;
        int count = 0;
        if (temp == null) {
            return 0;
        }
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    //获取倒数index节点
    public HeroCode indexNode(int index) {
        HeroCode temp = headCode.next;
        int num = getNum();

        if (temp == null) {
            System.out.println("链表为空");
            return null;
        }
        if (num < index) {
            System.out.println("链表中没有这么多节点");
            return null;
        }
        for (int i = 0; i < num - index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    //倒置链表

    /**
     * 1.新创建一个节点头
     * 2.遍历倒置前的数组 每遍历一个 就添加到新头的末尾
     */
    public void flipList() {
        HeroCode newHead = new HeroCode(0, "", "");
        HeroCode temp = headCode.next;
        if (temp == null) {
            System.out.println("链表为空");
            return;
        }
        HeroCode tempNext = temp.next;
        if (tempNext == null) {
            System.out.println("只有一个节点 不用反转");
            return;
        }
        newHead.next = temp;
        temp.next = null;
        while (tempNext != null) {
            temp = tempNext;
            tempNext = tempNext.next;
            temp.next = newHead.next;
            newHead.next = temp;
        }
        headCode.next = newHead.next;
    }

    /**
     * 反向打印链表 使用的栈Stack
     */
    public void flipShow() {
        Stack<HeroCode> heroCodeStack = new Stack<>();
        HeroCode temp = headCode.next;
        if (temp == null) {
            System.out.println("链表为空");
            return;
        }
        while (temp != null) {
            heroCodeStack.add(temp);
            temp = temp.next;
        }
        while (heroCodeStack.size() > 0) {
            System.out.println(heroCodeStack.pop());
        }
    }

    /**
     * 两个单链表的合并
     */
    public void name() {
        return;
    }

}

class HeroCode {
    public int id;
    public String name;
    public String nickName;
    //    private int no;
    public HeroCode next;

    public HeroCode(Integer id, String name, String nickName) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
//            this.no = no;

    }

    @Override
    public String toString() {
        return "HeroCode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
