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
        Calendar calendar = Calendar.getInstance();

        calendar.set(2020, Calendar.AUGUST, 1);
        ToDoItem item1 = new ToDoItem("Go for Movie", calendar);
        calendar.set(2020, Calendar.AUGUST, 2);
        ToDoItem item2 = new ToDoItem("Go for haircut", calendar);

        toDoItems.add(item1);
        toDoItems.add(item2);

        // Create an adapter for the ListView
        CustomAdapter adapter = new CustomAdapter(this, R.layout.row, toDoItems);

        // Set the adapter to the ListView
        listView.setAdapter(adapter);
    }
}