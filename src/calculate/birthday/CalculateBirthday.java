package calculate.birthday;

import java.text.SimpleDateFormat;
import java.util.*;

public class CalculateBirthday {

    public static void main(String[] args) {
        // TODO code application logic here
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        String dateformate = sdf.format(dt);
        String[] date = dateformate.split("/");
        int day = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);
        System.out.println("Enter the date of birth in this format dd/MM/YYYY");
        Scanner sc = new Scanner(System.in);
        String dateOfBirth = sc.next();
        String[] myDate = dateOfBirth.split("/");
        int myDay = Integer.parseInt(myDate[0]);
        int myMonth = Integer.parseInt(myDate[1]);
        int myYear = Integer.parseInt(myDate[2]);
        int ageDay = day - myDay;
        int ageMon = month - myMonth;
        if (day < myDay) {
            month -= 1;
            ageMon -= 1;
            int newday = day + 30;
            ageDay = newday - myDay;
        }
        if (month < myMonth) {
            year -= 1;
            int newmonth = month + 12;
            ageMon = newmonth - myMonth;
        }
        int ageYear = year - myYear;
        String age = ageYear + " Years\n" + ageMon + " Months\n" + ageDay + " Days";
        System.out.println(age);
        //======================================================================
        if ((myDay>=21 && myMonth == 3) || (myDay<=19 && myMonth ==4)) {
            System.out.println("برج الحمل");
        } else if (myDay >=20 && (myMonth==4 || myMonth ==5)) {
            System.out.println("برج الثور");
        } else if ((myDay>=21 && myMonth == 5) || (myDay<=20 && myMonth ==6)) {
            System.out.println("برج الجوزاء");
        } else if ((myDay>=21 && myMonth ==6) || (myDay<=22 && myMonth == 7)) {
            System.out.println("برج السرطان");
        } else if ((myDay>=23 && myMonth == 7) || (myDay<=22 && myMonth==8)) {
            System.out.println("برج الاسد");
        } else if ((myDay>=23 && myMonth ==8) || (myDay<=22 && myMonth ==9)) {
            System.out.println("برج العذراء");
        } else if ((myDay>=23 && myMonth ==9) || (myDay<=22 && myMonth==10)) {
            System.out.println("برج الميزان");
        } else if ((myDay>=23 && myMonth== 10) || (myDay<=21 && myMonth ==11)) {
            System.out.println("برج العقرب");
        } else if ((myDay>=22 && myMonth== 11)||(myDay<=21 && myMonth==12)) {
            System.out.println("برج القوس");
        } else if ((myDay>=22 && myMonth==12) || (myDay<=19 && myMonth==1)) {
            System.out.println("برج الجدي");
        } else if ((myDay>=20 && myMonth==1) || (myDay<=18 && myMonth==2)) {
            System.out.println("برج الدلو");
        } else if ((myDay>=19 && myMonth==3) || (myDay<=20&&myMonth==3)) {
            System.out.println("برج الحوت");
        } else {
            System.out.println("Enter a valid birth date");
        }
        String today = day + "/" + month;
        String birth = myDay + "/" + myMonth;
        if (birth.equals(today)) {
            System.out.println("Happy Birthday");            
        }
        else {
            System.out.print("");
        }
    }
}