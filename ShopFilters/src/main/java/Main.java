import Products.Clothes;
import Products.Food;
import Products.Knife;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        ListMaker list = new ListMaker();
        List<Food> foodList = (List<Food>) list.makeCertainList(new Food());
        List<Knife> knifeList = (List<Knife>) list.makeCertainList(new Knife());
        List<Clothes> clothesList = (List<Clothes>) list.makeCertainList(new Clothes());
        System.out.println(foodList + " \n " + knifeList + " \n "  + clothesList);


        }
    }