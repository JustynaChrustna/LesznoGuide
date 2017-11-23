package justynachrustna.lesznoguide;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Hotel Julinek", "Julinek 1, 05-084 Leszno, Polska", R.drawable.hotels_julinek));
        places.add(new Place("Apisołtysówka", "Powązki 11a, 05-084 Leszno, Polska", R.drawable.hotels_apisoltysowka));
        places.add(new Place("Agroturystyka Korfowe", "Korfowe 7, 05-085 Kampinos, Polska", R.drawable.hotels_korfowe));
        places.add(new Place("Klub Przystań", "ul. Krótka 2, 05-084 Leszno. Polska", R.drawable.hotels_przystan));
        places.add(new Place("Stajnia Mandra", "Korfowe 8, 05-085 Kampinos, Polska", R.drawable.hotels_mandra));
        places.add(new Place("Agroturystyka Izabella", "Powązki 14, 05-084 Leszno, Polska", R.drawable.hotels_izabella));
        places.add(new Place("Agroturystyka Dom na Górce", "Szymanówek 11, 05-084 Leszno, Polska", R.drawable.hotels_nagorce));
        places.add(new Place("Centrum Szkoleniowo Konsultacyjne BGŻ", "ul. Fabryczna 1, 05-084 Leszno, Polska", R.drawable.hotels_bgz));


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
