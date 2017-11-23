package justynachrustna.lesznoguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Justyna on 23.11.2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Place currentPlace = getItem(position);
        TextView placeNameTextView = (TextView) listItemView.findViewById(R.id.place_name_text_view);
        placeNameTextView.setText(currentPlace.getPlaceName());
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        miwokTextView.setText(currentPlace.getPlaceDescription());
        ImageView imageView= (ImageView) listItemView.findViewById(R.id.place_image);
        if(currentPlace.hasImage()){
            imageView.setImageResource(currentPlace.getPlaceImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }



        return listItemView;
    }
}
