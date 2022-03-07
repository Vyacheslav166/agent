import model.ObjectJson;
import model.Salary;
import service.HhService;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import static map.MapJsonToJavaObject.readJson;


public class Main {

    private static final String URL_API = "https://api.hh.ru/vacancies?employer_id=936465";
    private static final Long MIN_SALARY = 50000L;

    public static void main(String[] args) throws MalformedURLException {
        //получаем ObjectJson из api
        ObjectJson objectJson = readJson(new URL(URL_API));
        //получаем Map<id  объявления, объект зарплаты>
        assert objectJson != null;
        Map<String, Salary> idSalary = HhService.giveSalaryMap(objectJson);
        //получаем список id объявлений, в которых зарплата "от" выше
        List<String> idList = HhService.giveIdItemsOfSalaryFrom(idSalary, MIN_SALARY);
        //используем список id объявлений и совершаем запросы к api данных обявлений для поиска максимальной зарплаты
        Long maxSalary = HhService.giveMaxSalary(idList);
        System.out.println(maxSalary);
    }
}
