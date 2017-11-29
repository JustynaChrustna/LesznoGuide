package justynachrustna.lesznoguide;

/**
 * Created by Justyna on 22.11.2017.
 */

public class Place {
    private String placeName;
    private String placeDescription;
    private int placeImageResourceId=NO_IMAGE_PROVIDED;
    private String url=null;
    private static final int NO_IMAGE_PROVIDED=-1;


    public Place(String placeName, String placeDescription, int placeImageResourceId, String url) {
        this.placeName = placeName;
        this.placeDescription = placeDescription;
        this.placeImageResourceId=placeImageResourceId;
        this.url=url;

    }
    public Place(String placeName, String placeDescription, int placeImageResourceId) {
        this.placeName = placeName;
        this.placeDescription = placeDescription;
        this.placeImageResourceId=placeImageResourceId;
        this.url=null;

    }
    public String getPlaceDescription() {
        return placeDescription;
    }

    public String getPlaceName() {
        return placeName;
    }

    public int getPlaceImageResourceId() {
        return placeImageResourceId;
    }
    public boolean hasImage(){
        return placeImageResourceId!=NO_IMAGE_PROVIDED;
    }
    public String getUrl() {
        return url;
    }
}
