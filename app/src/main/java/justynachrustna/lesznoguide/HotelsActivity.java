package justynachrustna.lesznoguide;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
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
        places.add(new Place("Hotel Julinek", "Julinek 1"+"\n"+"05-084 Leszno", R.drawable.hotels_julinek, "https://www.booking.com/hotel/pl/noclegi-julinek.pl.html?aid=311097;label=noclegi-julinek-LCmNDAfZ%2AYuz5L6Rq6AiHgS106222110809%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap1t1%3Aneg%3Afi%3Atikwd-71241740743%3Alp1011419%3Ali%3Adec%3Adm;sid=03f3ceec613f17b676f199e97de032e2;dest_id=-513228;dest_type=city;dist=0;hapos=1;hpos=1;room1=A%2CA;sb_price_type=total;srepoch=1511994042;srfid=eaf614d561ab34e359c2164ca0f09afa1a8ccbeaX1;srpvid=0f5e9d1c72600273;type=total;ucfs=1&#hotelTmpl"));
        places.add(new Place("Apisołtysówka", "Powązki 11a"+"\n"+"05-084 Leszno", R.drawable.hotels_apisoltysowka, "http://apisoltysowka.mazowsze.pl/"));
        places.add(new Place("Agroturystyka Korfowe", "Korfowe 7"+"\n"+"05-085 Kampinos", R.drawable.hotels_korfowe, "http://www.korfowe.com/"));
        places.add(new Place("Klub Przystań", "ul. Krótka 2"+"\n"+"05-084 Leszno", R.drawable.hotels_przystan, "http://www.klubprzystan-leszno.noclegiw.pl/"));
        places.add(new Place("Stajnia Mandra", "Korfowe 8"+"\n"+"05-085 Kampinos", R.drawable.hotels_mandra, "http://www.stajniamandra.pl/"));
        places.add(new Place("Agroturystyka Izabella", "Powązki 14"+"\n"+"05-084 Leszno", R.drawable.hotels_izabella, "http://www.izabella-powazki.noclegiw.pl/"));
        places.add(new Place("Agroturystyka Dom na Górce", "Szymanówek 11"+"\n"+"05-084 Leszno", R.drawable.hotels_nagorce, "https://www.facebook.com/domnagorcekampinos/"));
        places.add(new Place("Centrum Szkoleniowo Konsultacyjne BGŻ", "ul. Fabryczna 1"+"\n"+"05-084 Leszno", R.drawable.hotels_bgz,"http://www.cskbgzbnpparibas.pl/"));


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
