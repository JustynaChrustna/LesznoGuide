package justynachrustna.lesznoguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Serpe Kuchnia Włoska", "Al.Wojska Polskiego 20D"+"\n"+"05-084 Leszno", R.drawable.restaurants_serpe, "https://www.facebook.com/Sesrpe/"));
        places.add(new Place("Dwie Babeczki", "ul. Sochaczewska 66"+"\n"+"05-084 Leszno", R.drawable.restaurants_babeczki, "https://www.facebook.com/Dwie-Babeczki-245442639000108/"));
        places.add(new Place("Eddie Pizza", "ul. Kochanowskiego 19"+"\n"+"05-084 Leszno", R.drawable.restaurants_eddie, "https://www.facebook.com/eddiepizzaleszno/"));
        places.add(new Place("Bar Czerwony Kapturek", "ul. Sochaczewska 41"+"\n"+"05-084 Leszno", R.drawable.restaurants_kapturek));
        places.add(new Place("PUB 579", "ul. Partyzantów 4"+"\n"+"05-084 Leszno", R.drawable.restaurants_pub));
        places.add(new Place("Hotel Julinek", "Julinek 1"+"\n"+"05-084 Leszno", R.drawable.restaurants_julinek, "http://www.julinek.com.pl/"));
        places.add(new Place("Karczma Zaborów", "ul. Wiosenna 10"+"\n"+"05-083 Zaborów", R.drawable.restaurants_zaborow, "http://www.karczma-zaborow.pl/"));


        PlaceAdapter adapter = new PlaceAdapter(this, places);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Place place=places.get(position);
                String url=places.get(position).getUrl();
                Uri uri= Uri.parse(url);
                Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);





            }
        });
    }
}
