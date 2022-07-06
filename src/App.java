import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a = sum();
        System.out.println(a);

        int b = daysBetween("1997-04-18", "2022-04-05");
        System.out.println(b);

    }
    //1. Write a method called sum that takes two integers as parameters and returns their sum.
    public static int sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        return a + b;
    }
    
    //计算两个数的和
    public static int sum(int a, int b) {
        return a + b;
    }

    //计算1-100的和
    public static int sum(){
        int sum = 0;
        for(int i = 1;i<=100;i++){
            sum += i;
        }
        return sum;
    }


    //计算任意两个日期之间的天数
    public static int daysBetween(String date1,String date2){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        try {
            cal1.setTime(sdf.parse(date1));
            cal2.setTime(sdf.parse(date2));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int betweenDays = (int) ((cal2.getTimeInMillis() - cal1.getTimeInMillis()) / (1000 * 3600 * 24));
        return betweenDays;
    }

    //连接mySQL数据库
    public static void connectMySQL(){
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123456";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn = java.sql.DriverManager.getConnection(url, user, password);
            System.out.println("连接成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //计算斐波拉契数列
    public static int fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    //下载哨兵二号数据
    public static void downloadData(){
        String url = "http://www.baidu.com";
        String user = "root";
        String password = "123456";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn = java.sql.DriverManager.getConnection(url, user, password);
            System.out.println("连接成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //计算100以内的质数和
    public static int sumPrime(){
        int sum = 0;
        for(int i = 2;i<=100;i++){
            boolean flag = true;
            for(int j = 2;j<i;j++){
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                sum += i;
            }
        }
        return sum;
    }

    //模拟ATM机取钱
    public static void ATM(){
        int money = 1000;
        int[] bills = {500,100,50,10,5,1};
        int[] nums = new int[bills.length];
        for(int i = 0;i<bills.length;i++){
            nums[i] = money / bills[i];
            money = money % bills[i];
        }
        for(int i = 0;i<bills.length;i++){
            System.out.println(bills[i] + "元纸币有" + nums[i] + "张");
        }
    }

    //模拟打飞机游戏
    public static void fly(){
        int money = 1000;
        int[] bills = {500,100,50,10,5,1};
        int[] nums = new int[bills.length];
        for(int i = 0;i<bills.length;i++){
            nums[i] = money / bills[i];
            money = money % bills[i];
        }
        for(int i = 0;i<bills.length;i++){
            System.out.println(bills[i] + "元纸币有" + nums[i] + "张");
        }
    }

    //写出樱花花瓣
    public static void writeFlower(){
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1;i>=0;i--){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
