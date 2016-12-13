package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public final class BirthdayWithJavaUtilDate implements BirthdayCalculator<Date> {

    @Override
    public Date parseDate(String str) throws ParseException {
        // TODO - return with the parsed date; format is: yyyy-MM-dd
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date result = format.parse(str);
            return result;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String printMonthAndDay(Date date) {
        // TODO - return the date formatted: month & day (MM. dd.)

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);

        String result = month + "." + " " + day + ".";

        return result;
    }

    @Override
    public boolean isAnniversaryToday(Date date) {
        Date today = new Date();
        Calendar todayCal = Calendar.getInstance();
        todayCal.setTime(today);
        int dayToday = todayCal.get(Calendar.DAY_OF_MONTH);
        int monthToday = todayCal.get(Calendar.MONTH);

        Calendar aniv = Calendar.getInstance();
        aniv.setTime(date);
        int dayAniv = aniv.get(Calendar.DAY_OF_MONTH);
        int monthAniv = aniv.get(Calendar.MONTH);

        if (dayToday == dayAniv && monthToday == monthAniv) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int calculateAgeInYears(Date birthday) {
        // TODO - return how many years age the input date 'birthday' was
        Date today = new Date();

        int todayYear = today.getYear();
        int bdYear = birthday.getYear();
        int todayMonth = today.getMonth();
        int bdMonth = birthday.getMonth();

        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        int todayDay = cal.get(Calendar.DAY_OF_MONTH);
        cal.setTime(birthday);
        int bdDay = cal.get(Calendar.DAY_OF_MONTH);

        int age = todayYear - bdYear;

        if (todayMonth < bdMonth) {
            age--;
        }
        if (todayMonth == bdMonth) {
            if (todayDay < bdDay) {
                age--;
            }
        }

        return age;

    }

    @Override
    public int calculateDaysToNextAnniversary(Date date) {
        // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        date.setYear(today.getYear());
        if (!date.after(today)) {
            date.setYear(date.getYear() + 1);
        }
        long differenceMS = date.getTime() - today.getTime();
        long result = TimeUnit.DAYS.convert(differenceMS, TimeUnit.MILLISECONDS);
        return  (int) result;

    }

    public static void main(String[] args) {
        new BirthdayWithJavaUtilDate().run();
    }

    private void run() {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        Date birthdayDate = null;
        try {
            birthdayDate = parseDate(birthdayStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        print("Your birthday: " + printMonthAndDay(birthdayDate));

        if (isAnniversaryToday(birthdayDate)) {
            int ageInYears = calculateAgeInYears(birthdayDate);
            print("Congratulations! Today is your " + ageInYears + "th birthday!");
        } else {
            int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
            print("You have to wait only " + daysLeft + " days for your next birthday.");
        }
    }

    private void print(String line) {
        System.out.println(line);
    }

    private String readInput(String message) {
        System.out.print(message + ": ");
        return input.nextLine();
    }

    private final Scanner input = new Scanner(System.in, "UTF-8");

}
