import java.util.ArrayList;

public class MyApp {
    public static void main(String[] args) {
    Main one = new Main("apple", "iphone 12",
            "ios", "128", "black", "2", "699.00");
    Main two = new Main("samsung", "galaxy note",
            "android", "256", "mystic bronze", "3", "349.00");
    Main three = new Main("apple" , "iphone 28",
            "iosiosios","120", "170","rainbow" ,"3.00");
        Main four = new Main("apple" , "iphone 28",
                "andriod","120", "170","rainbow" ,"3.00");
        System.out.println(".....full inventory.....");
    one.show();
two.show();
three.show();
        System.out.println(".....andriod inventory.....");
        ArrayList<Main> getAndriod=new ArrayList<>();
        getAndriod.add(two);
        getAndriod.add(four);
        for(Main andriod :getAndriod){
            andriod.show();

            System.out.println("....apple inventory....");
            ArrayList<Main> getApple=new ArrayList<>();
            getApple.add(one);
            getApple.add(three);
            for(Main apple : getApple){
                apple.show();
            }
        }
}
}
