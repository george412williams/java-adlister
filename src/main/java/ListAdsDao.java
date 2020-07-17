import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements Ads {

    private List<Ad> ads;

    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    @Override
    public Ad findById(long id) {
        return ads.get((int)id - 1);
    }

    @Override
    public long createAd(Ad adNew) {
        adNew.setId(ads.size() + 1);
        ads.add(adNew);
        return adNew.getId();
    }

//    todo 3. make sure a listing of all ads is made and sent to index.jsp

    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad(
            1,
            1,
            "playstation for sale",
            "This is a slightly used playstation"
        ));
        ads.add(new Ad(
            2,
            1,
            "Super Nintendo",
            "Get your game on with this old-school classic!"
        ));
        ads.add(new Ad(
            3,
            2,
            "Junior Java Developer Position",
            "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript"
        ));
        ads.add(new Ad(
            4,
            2,
            "JavaScript Developer needed",
            "Must have strong Java skills"
        ));
        return ads;
    }
}
