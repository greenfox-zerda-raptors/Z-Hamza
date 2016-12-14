package date;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Years;

import java.text.ParseException;
import java.util.Scanner;

public class BirthdayWithJodaTime implements BirthdayCalculator<LocalDate> {

    @Override
    public LocalDate parseDate(String str)  {
        // TODO - return with the parsed date; format is: yyyy-MM-dd
      if(str == null){
          throw new NullPointerException();
      }
          LocalDate result = new LocalDate(str);
            return result;

    }

    @Override
    public String printMonthAndDay(LocalDate date) {
        // TODO - return the date formatted: month & day (MM. dd.)
        String result = date.getMonthOfYear()+"."+" "+date.getDayOfMonth() + ".";

        return result;
    }

    @Override
    public boolean isAnniversaryToday(LocalDate date) {
        // TODO - return with true if today is the same month+day as date

        LocalDate today = new LocalDate();

        if(today.getDayOfMonth() == date.getDayOfMonth() && today.getMonthOfYear() == date.getMonthOfYear()){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int calculateAgeInYears(LocalDate birthday) {
        LocalDate today = new LocalDate();
        if (birthday == null){
            throw new NullPointerException();
        }

        return Years.yearsBetween(birthday, today).getYears();
    }

    @Override
    public int calculateDaysToNextAnniversary(LocalDate date) {
        // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
        DateTime today = DateTime.now();
        int result;

        if(today.getDayOfYear() == date.getDayOfYear()){
            result =0;
        } else if(today.getDayOfYear() > date.getDayOfYear()){
          DateTime dummy = new DateTime(today.getYear()+1, date.getMonthOfYear(), date.getDayOfMonth(), today.getHourOfDay(), today.getMinuteOfHour(), today.getSecondOfMinute()+1);
            Interval time = new Interval(today, dummy);
            result = (int) time.toDuration().getStandardDays();
        } else {
            DateTime end = new DateTime(today.getYear(), date.getMonthOfYear(), date.getDayOfMonth(), today.getHourOfDay(), today.getMinuteOfHour(), today.getSecondOfMinute());
            Interval interval = new Interval(today, end);
            result = (int) interval.toDuration().getStandardDays();
        }
        return result;

    }

    public static void main(String[] args) {
        new BirthdayWithJodaTime().run();
    }

    private void run()  {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        LocalDate birthdayDate = parseDate(birthdayStr);
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
