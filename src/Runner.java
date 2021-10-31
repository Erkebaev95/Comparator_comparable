import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        // Создаем массив и формируем список на основе массива
        List<MilitaryPerson> unit = Arrays.asList(
                new MilitaryPerson("Иван", 18, Rank.Рядовой),
                new MilitaryPerson("Саша", 22, Rank.Сержант),
                new MilitaryPerson("Макс", 25, Rank.Старшина),
                new MilitaryPerson("Вова", 33, Rank.Майор),
                new MilitaryPerson("Петя", 50, Rank.Генерал)
        );

        // Создаем объекты и сортируем
        Comparator<MilitaryPerson> nameFilter = new NameFilter();
        unit.sort(nameFilter);
        System.out.println("Сортировка по имени\n" + unit);

        Comparator<MilitaryPerson> ageFilter = new AgeFilter();
        unit.sort(ageFilter);
        System.out.println("Сортировка по возрасту\n" + unit);

        Comparator<MilitaryPerson> rankFilter = new RankFilter();
        unit.sort(rankFilter);
        System.out.println("Сортировка по рангу\n" + unit);
    }
}
