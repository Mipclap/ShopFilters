import Products.Tradeable;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class JsonInput {

    public List<Tradeable> inputFromJson() throws IOException {
        //читаем файл и записываем его в массив общего (супер) класса Tradeable
        ObjectMapper mapper = new ObjectMapper();
        Tradeable[] prod = mapper.readValue(new File("C:\\Users\\Vlad\\Desktop\\Projects\\ShopFilters\\SaleList.json"), Tradeable[].class);

        //здесь же решил сразу создать лист, т.к. класс для одной строчки создавать не видел смысла
        return Arrays.asList(prod);
    }
}

