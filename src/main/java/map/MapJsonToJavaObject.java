package map;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Item;
import model.ObjectJson;

import java.net.URL;

/**
 * Парсер JSON, получаемых с вебсервиса
 */
public class MapJsonToJavaObject {

    /**
     * Получение JSON по заданному работодателю и преобразование в объект Java
     *
     * @param url - api работодателя на hh.ru
     * @return Java объект ObjectJson
     */
    public static ObjectJson readJson(URL url) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            return (mapper.readValue(url, ObjectJson.class));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Получение JSON по заданному объявлению и преобразование в объект Java
     *
     * @param url - api объявления на hh.ru
     * @return Java объект Item
     */
    public static Item readJsonItem(URL url) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            return (mapper.readValue(url, Item.class));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
