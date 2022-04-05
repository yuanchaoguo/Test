import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a = sum();
        System.out.println(a);

        int b = daysBetween("1997-04-18", "2022-04-05");
        System.out.println(b);

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
}
