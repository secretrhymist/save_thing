package demo01_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 
 * @author hjt
 * @date 2020-04-14
 * 
 * 一个人去医院里挂号，超过三次则提示"本人不能再挂号 已经是黑名单"，
 * [有条件可以按时间点:30分钟一次，如9:30被挂号了，
 * 则这个时间[9:30]不能补挂号提示"告诉可以除了这个时间之外可以挂号"]
 * 使用所学过的方式去解决功能问题。 [一天8个小时，半个小时只能挂号一次]
 * 
 * 参考姚鑫
 */


public class HospitalRegister {
	public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Scanner input = new Scanner(System.in);
//        int count = -1;

        //date1 第一次挂号时间
        System.out.print("请按照\"yyyy-MM-dd HH:mm:ss\"格式输入：");
        java.util.Date date1 = sdf.parse(input.nextLine());
        long time1 = date1.getTime();
        System.out.println("挂号成功");

        //date2 挂号后30分钟的那个点
        java.util.Date date2 = new Date(date1.getTime() + 30 * 60 * 1000);
        long time2 = date2.getTime();

//      long mindiff;
//      mindiff = (time2 -time1) / 60000;
//      System.out.println(mindiff);

        //第二次挂号
        System.out.println("输入第二个挂号时间：");
        java.util.Date date3 = sdf.parse(input.nextLine());
        long time3 = date3.getTime();

        if (time3 > time2) {
            System.out.println("可以挂号！");
        } else {
            System.out.println("当前不能挂号！");
        }

        //第二次挂号后30min
        java.util.Date date4 = new Date(date3.getTime() + 30 * 60 * 1000);
        long time4 = date4.getTime();

        //第三次挂号
        System.out.println("输入第三个挂号时间：");
        java.util.Date date5 = sdf.parse(input.nextLine());
        long time5 = date5.getTime();

        if (time5 > time4) {
            System.out.println("挂号成功,今日挂号次数已满！");
        } else {
            System.out.println("当前不能挂号");

        }

        // 2020-01-01 00:00:00
    }
}

/**
private static void register(){
    System.out.println("挂上号啦!");
}


public static String addDateMinute(String day, int x) {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 24小时制
    //引号里面个格式也可以是 HH:mm:ss或者HH:mm等等，很随意的，不过在主函数调用时，要和输入的变
    //量day格式一致
    Date date = null;
    try {
        date = format.parse(day);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (date == null)
        return "";
    System.out.println("front:" + format.format(date)); //显示输入的日期
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    cal.add(Calendar.MINUTE, x);// 24小时制
    date = cal.getTime();
    System.out.println("after:" + format.format(date));  //显示更新后的日期
    cal = null;
    return format.format(date);
}
**/
