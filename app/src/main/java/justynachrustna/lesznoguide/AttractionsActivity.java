package justynachrustna.lesznoguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Park Rozrywki Julinek", "Julinek 1"+"\n"+"05-084 Leszno", R.drawable.attraction_julinek));
        places.add(new Place("Kościół w Lesznie", "ul. Warszawska 1"+"\n"+"05-084 Leszno", R.drawable.attraction_kosciol));
        places.add(new Place("Kościół w Zaborowie", "ul. Kościelna 1"+"\n"+"05-083 Zaborów", R.drawable.attraction_anna));
        places.add(new Place("Obszar Ochrony Zaborów Leśny", "Zaborów"+"\n"+"05-083 Zaborów", R.drawable.attraction_zaborow));
        places.add(new Place("Kościół Mariawicki w Lesznie ", "ul. Sochaczewska 67"+"\n"+"05-084 Leszno", R.drawable.attraction_kosciol_mariawicki));
        places.add(new Place("Pałac Luszczewskich w Lesznie", "ul. Fabryczna 1"+"\n"+"05-084 Leszno", R.drawable.attraction_palac_leszno));
        places.add(new Place("Pałac w Zaborówku", "Zaborówek"+"\n"+"05-085 Leszno", R.drawable.attraction_palac_zaborowek));
        places.add(new Place("Pałac Goldstandów w Zaborowie", "ul. Kościelna"+"\n"+"05-083 Zaborów", R.drawable.attraction_palac_zaborow));

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

