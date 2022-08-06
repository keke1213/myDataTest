package com.String;

public class CopyValue {
    public static void main(String[] args) {
//        char[] chars ={'a','b','c'};
//        String s=String.valueOf(chars);
//        System.out.printf(""+ s);


//        System.out.println(Integer.toString(16, 2)); 10000

//        String abc = "abe";
//        System.out.println("abc".compareTo(abc)); -2
//        String abc = "abe";
//        System.out.println("ABE".compareToIgnoreCase(abc));0
//        System.out.println("abc".contains("ab"));true
//        String r = "renchao";
//        System.out.println("renchao".contentEquals(r));true
//        System.out.println("renchao".equals(r));true

//        String r1 = new String("renchao");
//        System.out.println(r.equals(r1));true

//        System.out.println("asdfjlw".endsWith("fjlw"));

//        char[] ca= new char[7];
//        "abcefg".getChars(0,3,ca,0);//原目标开始,原目标结束,char数组,char数组起始位置
//        System.out.println(ca);abc

//        String s = String.format(Locale.PRC,"共青团员%s","任超");
//        System.out.println(s);
//        System.out.printf("时间%tc%n",new Date());


//        try {
//            String str = new String("张斯珂".getBytes(StandardCharsets.UTF_8), "UTF-8");
////            System.out.println(str);
//            System.out.println(str.indexOf("斯珂"));
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        System.out.println("123".indexOf(50));

//        System.out.println("zhananahang".indexOf("hang"));
//        System.out.println("12345".indexOf(50));


//        System.out.println("abc123abc".replace( "abc", "A"));A123A

//        String s = "boo:and:foo";
//        String[] ss=s.split("and");
//        for (String s1 : ss) {
//            System.out.print(s1+" |");
//        }
//        HashMap<Integer,String> hashMap = new HashMap();
//        hashMap.put(1,"123");
//        hashMap.put(2,"456");
//        hashMap.put(3,"789");
//        Set<Student> set = new HashSet();
//
//        Student student = new Student("任超",22);
//        Student student1 = new Student("张斯珂",18);
//        Student student2 = new Student("宝宝",17);
//        set.add(student);
//        set.add(student1);
//        set.add(student2);
//        System.out.println(String.valueOf(set));
//
//        char[] ch ={'a','b','c','d','e'};
//        System.out.println(String.valueOf(ch, 1, 2));

//        System.out.println("张".codePointAt(0));24352

//
//
//        String s1 = "𝕆";
//        System.out.println(s1.length());2
//        System.out.println(s1.codePointCount(0, s1.length()));1


//        String str2 = new String("str")+new String("01");
//        str2.intern();
//        String str1 = "str01";
//        System.out.println(str2==str1);true
//
//        String str2 = new String("str01");
//        String str1 = "str01";
//        System.out.println(str2==str1);false

//        String s = new String("abc").intern();
//        String s1 = new String("abc");
//        String s2 = s1.intern();
//        System.out.println(s == s1);
//        System.out.println(s2 == s);
//        System.out.println(s2 == s1);


//        String s = new String("abc");
//        String s1 = "abc";
//        String s2 = new String("abc");
//        System.out.println(s == s2);
//        System.out.println(s == s1.intern());
//        System.out.println(s == s2.intern());
//        System.out.println(s1 == s2.intern());

//        String s1 = "abc";
//        System.out.println(s1.lastIndexOf("", 2));

//        String s1 = "idea.pom";
//        System.out.println(s1.substring(s1.lastIndexOf(".")+1, s1.length()));pom
//
//        System.out.println(s1.startsWith("pom",s1.length()-3));true
//        System.out.println(s1.endsWith("pom"));true

//        System.out.println("1q2w3e4r5t".substring(2, 6));2w3e
//        System.out.println("1q2w3e4r5t".subSequence(2, 6));2w3e

//        String s ="1q2w3e4r5t".substring(2, 6);
//        CharSequence s1 ="1q2w3e4r5t".subSequence(2, 6);


//        int number = 0;
//        String str = "fdAfdadfadf";
//        for (int i = 0; i < str.length(); i++) {
//            if (str.regionMatches(true,i, "da", 0, 2)) {
//                number++;
//                i=i+2;
//            }
//        }
////        System.out.println(number);//2 不区分大小写 ignore Case为true
//
//        System.out.println("123456".offsetByCodePoints(0, 0));

    }


}
