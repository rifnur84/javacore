import java.util.HashMap;
import java.util.Map;
/*Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.*/

public class SortAndCount {
    public static void main(String[] args) {
        String [] words = {"A","B","C","A","B","C","D"};
        Map<String,Integer> map = new HashMap<>();
        for (String o: words){
            map.put(o, map.getOrDefault(o,0)+1);
        }
        System.out.println(map.keySet());
        System.out.println(map);
    }
}
