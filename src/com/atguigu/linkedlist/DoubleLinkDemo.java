package com.atguigu.linkedlist;

/**
 * 双链表
 */
public class DoubleLinkDemo {
    public static void main(String[] args) {
        HeroCode2 hero1 = new HeroCode2(1, "宋江", "及时雨");
//        HeroCode2 newHero1 = new HeroCode2(5, "SongJiang", "rail");
        HeroCode2 hero2 = new HeroCode2(2, "卢俊义", "玉麒麟");
        HeroCode2 hero3 = new HeroCode2(3, "吴用", "智多星");
        HeroCode2 hero4 = new HeroCode2(4, "林冲", "豹子头");
        DoubleLink dd = new DoubleLink();
//
        dd.add(hero3);
        dd.add(hero4);
        dd.add(hero1);
        dd.add(hero2);
//        dd.upData(newHero1);
//        dd.delData(1);
//        dd.delData(5);
//        dd.list();
        dd.flipShow();
    }
}

class DoubleLink {
    private HeroCode2 headCode = new HeroCode2(0, "", "");

    //双链表的有序添加
    public void add(HeroCode2 heroCode2) {
        HeroCode2 temp = headCode;

        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.id > heroCode2.id) {
                break;
            } else if (temp.next.id == heroCode2.id) {
                System.out.printf("%d排名也有人选\n", heroCode2.id);
                return;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            temp.next = heroCode2;
            heroCode2.pre = temp;
        } else {
            heroCode2.next = temp.next;
            temp.next.pre = heroCode2;
            heroCode2.pre = temp;
            temp.next = heroCode2;

        }


    }

    //遍历
    public void list() {
        if (headCode.next == null) {
            System.out.println("链表为空");
            return;
        }
        HeroCode2 temp = headCode.next;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    //修改
    public void upData(HeroCode2 heroCode2) {
        HeroCode2 temp = headCode.next;
        if (temp == null) {
            System.out.println("链表为空");
            return;
        }
        while (temp != null) {
            if (temp.id == heroCode2.id) {
                temp.name = heroCode2.name;
                temp.nickName = heroCode2.nickName;
                System.out.println("修改成功");
                return;
            }
            temp = temp.next;
        }
        System.out.println("没有找到该节点");
    }

    //删除
    public void delData(int i) {
        HeroCode2 temp = headCode.next;
        if (temp == null) {
            System.out.println("链表为空");
            return;
        }
        while (temp != null) {
            if (temp.id == i) {
                if (temp.next == null) {
                    temp.pre.next = null;
                    return;
                } else {
                    temp.next.pre = temp.pre;
                    temp.pre.next = temp.next;
                    return;
                }
            }
            temp = temp.next;
        }
        System.out.println("没有该节点");
    }

    //反向输出
    public void flipShow() {
        HeroCode2 temp = headCode.next;
        if (temp == null) {
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp.pre != null) {
            System.out.println(temp);
            temp = temp.pre;
        }
    }
}

class HeroCode2 {
    public int id;
    public String name;
    public String nickName;
    public HeroCode2 next;
    public HeroCode2 pre;

    public HeroCode2(Integer id, String name, String nickName) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;

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
