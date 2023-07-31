package sg.edu.rp.c326.id22015010.p10_demotodolist;

import androidx.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ToDoItem {
    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date){
        this.title=title;
        this.date=date;
    }
    public String getTitle(){
        return title;
    }
    public Calendar getDate(){
        return date;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setDate(Calendar date){
        this.date=date;
    }

    public String toString1() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)
                +"/"+date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";
        return str;
    }

    @NonNull
    @Override
    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH) + " " +
                getMonth(date.get(Calendar.MONTH)) + " " +
                date.get(Calendar.YEAR) + " (" +
                getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

        return str;
    }

    private String getMonth(int month) {
        String[] months = new String[]{
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[month];
    }

    private String getDay(int day) {
        String dayOfWeek;

        switch (day) {
            case Calendar.SUNDAY:
                dayOfWeek = "Sunday";
                break;
            case Calendar.MONDAY:
                dayOfWeek = "Monday";
                break;
            case Calendar.TUESDAY:
                dayOfWeek = "Tuesday";
                break;
            case Calendar.WEDNESDAY:
                dayOfWeek = "Wednesday";
                break;
            case Calendar.THURSDAY:
                dayOfWeek = "Thursday";
                break;
            case Calendar.FRIDAY:
                dayOfWeek = "Friday";
                break;
            case Calendar.SATURDAY:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "";
                break;
        }

        return dayOfWeek;
    }
}
