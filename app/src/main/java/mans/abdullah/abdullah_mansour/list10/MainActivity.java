package mans.abdullah.abdullah_mansour.list10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ListView listView;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.main_listview);


        ArrayList<DataClass> ar = new ArrayList<>();

        ar.add(new DataClass(R.drawable.image , "Amany" , "01118101402"));
        ar.add(new DataClass(R.drawable.coffee , "Amany" , "01118101402"));
        ar.add(new DataClass(R.drawable.coding , "Amany" , "01118101402"));
        ar.add(new DataClass(R.drawable.edituser , "Amany" , "01118101402"));
        ar.add(new DataClass(R.drawable.image , "Amany" , "01118101402"));
        ar.add(new DataClass(R.drawable.coffee , "Amany" , "01118101402"));
        ar.add(new DataClass(R.drawable.coding , "Amany" , "01118101402"));
        ar.add(new DataClass(R.drawable.edituser , "Amany" , "01118101402"));

        adapter = new Adapter(getApplicationContext() , R.layout.list_item, ar);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                DataClass dataClass = adapter.getItem(position);
                adapter.remove(dataClass);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.delete_item :
                Toast.makeText(getApplicationContext(), "aaaa clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.details_item :
                Toast.makeText(getApplicationContext(), "details clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
