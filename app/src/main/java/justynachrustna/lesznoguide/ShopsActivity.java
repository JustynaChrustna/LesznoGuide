package justynachrustna.lesznoguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);


        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Biedronka", "Sochaczewska 68"+"\n"+"05-084 Leszno", R.drawable.biedronka, "https://www.biedronka.pl/pl"));
        places.add(new Place("Lewiatan", "ul. Sochaczewska 62"+"\n"+"05-084 Leszno", R.drawable.lewiatan, "https://www.lewiatan.pl/"));
        places.add(new Place("Centrum ogrodniczo - przemysłowe", "ul. Sochaczewska 21"+"\n"+"05-084 Leszno", R.drawable.ogrodniczy, "http://www.sysiak.com.pl/strona.php?strona=8"));
        places.add(new Place("Kwiaciarnia \"E.W.WINNICCY\"", "ul. Sochaczewska 19"+"\n"+"05-084 Leszno", R.drawable.kwiaciarnia, "https://kwiaciarnia-e-w-winniccy.business.site/"));
        places.add(new Place("Żabka", "ul. Sochaczewska 13"+"\n"+"05-084 Leszno", R.drawable.zabka, "https://www.zabka.pl/"));
        places.add(new Place("Salon Optyczny Optoker", "ul. Księdza Jana Raczkowskiego 2"+"\n"+"05-084 Leszno", R.drawable.optyk, "http://optykbabice.pl/"));
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
