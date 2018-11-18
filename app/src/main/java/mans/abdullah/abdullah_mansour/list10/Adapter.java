package mans.abdullah.abdullah_mansour.list10;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<DataClass>
{
    ImageView image;
    TextView name,number;

    public Adapter(@NonNull Context context, int resource, ArrayList<DataClass> info)
    {
        super(context, resource, info);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item
                    , parent
                    , false);
        }

        image = convertView.findViewById(R.id.image);
        name = convertView.findViewById(R.id.name);
        number = convertView.findViewById(R.id.number);

        DataClass dataClass = getItem(position);

        if (dataClass != null)
        {
            image.setImageResource(dataClass.getImage_url());
            name.setText(dataClass.getName());
            number.setText(dataClass.getNumber());
        }

        return convertView;
    }
}
