package u8.CastingType;

public class ClassCasting {
    public static void main(String[] args) {


    }
    public static void makeHimDoDrugs(Men p){
        if(p instanceof Adult){
            Adult ad = (Adult) p;
            ad.doesDrugs("adult ");
        }
    }
}
