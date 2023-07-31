package sg.edu.rp.c326.id22015010.p10_demotodolist;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
ListView listView;
ArrayList<ToDoItem> ToDoList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        // Create sample ToDoItems
        ArrayList<ToDoItem> toDoItems = new ArrayList<>();

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.YEAR, 2020);
        calendar1.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendar1.set(Calendar.DAY_OF_MONTH, 1);
        ToDoItem item1 = new ToDoItem("Go for Movie", calendar1);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.YEAR, 2020);
        calendar2.set(Calendar.MONTH, Calendar.AUGUST);
        calendar2.set(Calendar.DAY_OF_MONTH, 2);
        ToDoItem item2 = new ToDoItem("Go for haircut", calendar2);

        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(Calendar.YEAR, 2023);
        calendar3.set(Calendar.MONTH, Calendar.JULY);
        calendar3.set(Calendar.DAY_OF_MONTH, 20);
        ToDoItem item3 = new ToDoItem("Finish up C346 worksheet", calendar3);

        toDoItems.add(item1);
        toDoItems.add(item2);
        toDoItems.add(item3);

        // Create an adapter for the ListView
        CustomAdapter adapter = new CustomAdapter(this, R.layout.row, toDoItems);

        // Set the adapter to the ListView
        listView.setAdapter(adapter);
    }
}