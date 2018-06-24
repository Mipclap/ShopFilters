import Products.Tradeable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListMaker {


    /*
    * часа 4 пытался сделать общий метод для создания отфильтрованных по классам листов,
    * чтоб не нужно было делать метод для каждого класса. В итоге получилось немного по-уебански,
    * потом переделаю наверно.
    */


    public List makeCertainList(Tradeable filter) throws IOException {
        //принимаем объект суперкласса Tradeable

        JsonInput inp = new JsonInput();
        List<Tradeable> unfilteredList = inp.inputFromJson();
        List filteredList = new ArrayList<>();

        for (Tradeable a : unfilteredList){

            //если класс объекта из общего листа совпадает с классом переменной из параметров метода,
            //то кидаем этот объект в новый лист

            if(filter.getClass().equals(a.getClass())){
                filteredList.add(a);
            }
        }
    return filteredList;
    }

}
