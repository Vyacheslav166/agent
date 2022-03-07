package service;

import model.Item;
import model.ObjectJson;
import model.Salary;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static map.MapJsonToJavaObject.readJsonItem;

/**
 * Сервис
 */
public class HhService {

    /**
     * Получение Map с ключом - id объявления и значением - объектом Salary
     *
     * @param objectJson Java объект с данными по объявлениям
     * @return Map с ключом - id объявления и значением - объектом Salary
     */
    public static Map<String, Salary> giveSalaryMap(ObjectJson objectJson) {
        List<Item> itemList = objectJson.getItems();
        Map<String, Salary> idSalary = new HashMap<>();
        for (Item item : itemList) {
            String id = item.getId();
            Salary salary = item.getSalary();
            idSalary.put(id, salary);
        }
        return idSalary;
    }

    /**
     * Отбирает объявления с зарплатой "от" выше заданной
     *
     * @param idSalary Map с ключом - id объявления и значением - объектом Salary
     * @param minSalary минимальная зарплата "от"
     * @return список id объявлений, имеющих зарплату "от" выше заданной
     */
    public static List<String> giveIdItemsOfSalaryFrom (Map<String, Salary> idSalary, Long minSalary) {
        List<String> idList = new ArrayList<>();
        for (Map.Entry<String,Salary> entry : idSalary.entrySet()) {
            String id = entry.getKey();
            Salary salary = entry.getValue();
            if (salary != null) {
                Long from = salary.getFrom();
                if (from >= minSalary) {
                    idList.add(id);
                }
            }
        }
        return idList;
    }

    /**
     * Поиск максимальной зарплаты "от" среди объявлений, id которых переданы в списке
     *
     * @param idList - список id объявлений
     * @return максимальную зарплату "от"
     * @throws MalformedURLException
     */
    public static Long giveMaxSalary (List<String> idList) throws MalformedURLException {
        Long maxSalary = 0L;
        for (String id : idList) {
            Item item = readJsonItem(new URL("https://api.hh.ru/vacancies/" + id));
            Salary salary = item.getSalary();
            if (salary != null) {
                Long from = salary.getFrom();
                if (from > maxSalary) {
                    maxSalary = from;
                }
            }
        }
        return maxSalary;
    }
}
