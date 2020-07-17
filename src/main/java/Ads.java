import java.util.List;

public interface Ads {
    List<Ad> all();

    Ad findById(long id);

    long createAd(Ad adNew);
}
