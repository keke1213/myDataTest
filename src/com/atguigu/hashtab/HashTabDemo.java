package com.atguigu.hashtab;

/**
 * @author 莴笋
 * @date 2021/8/12 19:52
 * 哈希表
 */
public class HashTabDemo {
    public static void main(String[] args) {

        HashTable1 hashTable1 = new HashTable1(7);
        Emp e = new Emp(1, "111");
        Emp e1 = new Emp(123, "222");
        Emp e2 = new Emp(11, "333");
        Emp e3 = new Emp(3121, "444");
        Emp e4 = new Emp(8, "444");
        Emp e5 = new Emp(15, "444");
        Emp e6 = new Emp(22, "444");
        hashTable1.add(e);
        hashTable1.add(e1);
        hashTable1.add(e2);
        hashTable1.add(e3);
        hashTable1.add(e4);
        hashTable1.add(e5);
        hashTable1.add(e6);
//        hashTable1.delById(1);
//        hashTable1.delById(11);
//        hashTable1.delById(123);
//        hashTable1.delById(2);
//

        hashTable1.list();


    }
}

class HashTable1 {
    private EmpLinked[] empLinked;
    private int maxSize;

    public HashTable1(int maxSize) {
        this.maxSize = maxSize;
        empLinked = new EmpLinked[maxSize];
        for (int i = 0; i < maxSize; i++) {
            empLinked[i] = new EmpLinked();
        }
    }

    public void add(Emp emp) {
        int empLinkedNo = hashFun(emp.id);
        empLinked[empLinkedNo].add(emp);
    }

    public void delById(int id) {
        int empLinkedNo = hashFun(id);
        empLinked[empLinkedNo].delById(id);
    }

    public void list() {
        for (int i = 0; i < maxSize; i++) {
            empLinked[i].list(i + 1);
        }
    }

    public int hashFun(int id) {
        return id % maxSize;
    }
}

class EmpLinked {
    private Emp head = null;

    public void add(Emp emp) {
        if (head == null) {
            head = emp;
            return;
        }
        Emp temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = emp;
    }

    public void list(int i) {
        Emp temp = head;
        if (temp == null) {
            System.out.println("第" + i + "个链表为空");
            return;
        }
        System.out.print("第" + i + "个链表的数据为 ");
        while (temp != null) {
            System.out.print("-->" + temp);
            temp = temp.next;
        }
        System.out.println();
    }

    public void delById(int id) {
        Emp temp = head;
        Boolean flag = false;
        if (temp == null) {
            System.out.println("没有找到编号为" + id);
            return;
        }
        if (head.id == id) {
            head = head.next;
            return;
        }
        while (temp.next != null) {
            if (temp.next.id == id) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.out.println("没有找到编号为" + id);
        }
    }
}


class Emp {
    public Emp next;
    public int id;
    public String name;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


