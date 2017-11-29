package justynachrustna.lesznoguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Ksiądz Waldemar Wojdecki","Dzieje Leszna i Puszczy Kampinoskiej",  R.drawable.books_wojdecki));
        places.add(new Place("Edmund W. Waleriańczyk","Jest takie miejsce na ziemi. Tom 1. Leszno",  R.drawable.books_miejsce_1));
        places.add(new Place("Edmund W. Waleriańczyk","Jest takie miejsce na ziemi. Tom 2. Cukrownia Michałów",  R.drawable.books_miejsce_2));
        places.add(new Place("Edmund W. Waleriańczyk","Jest takie miejsce na ziemi. Tom 3. Pokłosie",  R.drawable.books_miejsce_3));


        PlaceAdapter adapter = new PlaceAdapter(this, places);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Place place=places.get(position);





            }
        });
    }
}