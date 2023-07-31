package sg.edu.rp.c326.id22015010.p10_demotodolist;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> versionList;

    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        versionList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvVersion = rowView.findViewById(R.id.textViewVersion);

        // Obtain the ToDoItem based on the position
        ToDoItem currentItem = versionList.get(position);

        // Set values to the TextView to display the corresponding information
        tvName.setText(currentItem.getTitle());
        tvVersion.setText(currentItem.toString()); // Use toString() method to display the date

        return rowView;
    }
}