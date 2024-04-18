package com.ding.utility;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utility {
    private static final Scanner scanner = new Scanner(System.in);
    public static String readString(int limit) {
        Scanner scanner = Utility.scanner;
        System.out.println("请输入内容：");
        String str = scanner.nextLine();
        while (str.length() > limit) {
            System.out.println("输入的字符超过了：" + limit + "请重新输入");
            str = scanner.nextLine();
        }
        return str;
    }
    public static int readInt(int max) {
        Scanner scanner = Utility.scanner;
        System.out.println("请输入内容：");
        String numStr = scanner.nextLine();
        int num = 0;
        boolean flag = true;
        while (flag) {
            try {
                num = Integer.parseInt(numStr);
                while (num > max) {
                    System.out.println("输入的数字值过大：" + "请重新输入");
                    num = scanner.nextInt();
                }
                flag = false;
            } catch ( NumberFormatException e ) {
                System.out.println("请输入纯数字：");
                numStr = scanner.nextLine();
            } catch ( InputMismatchException e) {
                numStr = scanner.nextLine();
            }
        }


        return num;
    }
}
