package gitTest;


import java.util.HashMap;

public class GItTest {
    public static void main(String[] args) {
        System.out.println("第一次提交 git");
        System.out.println("第二次提交了");
        System.out.println("sysconized1234");
        System.out.println("hahaha");

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("111", "ddd");
        for (String key : map1.keySet()) {

            System.out.println(map1.get(key));

        }
    }

}
