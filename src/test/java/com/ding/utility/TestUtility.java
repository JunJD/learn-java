package com.ding.utility;

public class TestUtility {
    public static void main(String[] args) {
//        TestUtility.testReadString();
        TestUtility.testReadInt();
    }

    /**
     * 测试readString方法
     */
    private static void  testReadString() {
        String str = Utility.readString(3);
        System.out.println(str);
    }
    
    private static void testReadInt() {
        int num = Utility.readInt(3);
        System.out.println(num);
    }

}
