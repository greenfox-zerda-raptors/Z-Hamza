package date;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Years;

import java.text.ParseException;
import java.util.Scanner;

public class BirthdayWithJodaTime implements BirthdayCalculator<LocalDate> {

    @Override
    public LocalDate parseDate(String str)  {
        // TODO - return with the parsed date; format is: yyyy-MM-dd
        try{
            LocalDate result = new LocalDate(str);
            return result;
        }catch( Exception e) {
            return null;
        }
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

        return Years.yearsBetween(birthday, today).getYears();
    }

    @Override
    public int calculateDaysToNextAnniversary(LocalDate date) {
        // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)

        return -1;
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
