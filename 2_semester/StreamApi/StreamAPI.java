package StreamApiHomework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class StreamAPI {
    @Test
    public void checkTask1() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> sortedList = list.stream()

        // TODO: Применить умножение каждого элемента на 2
        .map(x->x*2)
        .collect(Collectors.toList());
        sortedList.forEach(x -> System.out.println(x));

        Assertions.assertEquals(2, sortedList.get(0));
        Assertions.assertEquals(4, sortedList.get(1));
        Assertions.assertEquals(6, sortedList.get(2));
        Assertions.assertEquals(8, sortedList.get(3));
    }

    @Test
    public void checkTask2() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> sortedList = list.stream()

        // TODO: Отфильтровать элементы, оставив только четные
         .filter(x-> x%2 == 0)
         .collect(Collectors.toList());
         sortedList.forEach(x1 -> System.out.println(x1));



        Assertions.assertEquals(2, sortedList.size());
        Assertions.assertEquals(2, sortedList.get(0));
        Assertions.assertEquals(4, sortedList.get(1));
    }

    @Test
    public void checkTask3() {
        List<String> list = Arrays.asList("Ivanov", "Sidorov", "Antonov", "Kuznecov", "Kulikov", "Ahmetov");
        List<String> sortedList = list.stream()

        // TODO: Отсортировать по алфавиту
         .sorted()
         .collect(Collectors.toList());
         sortedList.forEach(x1 -> System.out.println(x1));

        Assertions.assertEquals("Antonov", sortedList.get(1));
        Assertions.assertEquals("Ivanov", sortedList.get(2));
        Assertions.assertEquals("Kuznecov", sortedList.get(4));
    }

    @Test
    public void checkTask4() {
        List<Student> list = Arrays.asList(
                new Student("Ivan", "Ivanov", 50),
                new Student("Vasya", "Sidorov", 60),
                new Student("Anton", "Antonov", 70),
                new Student("Andrey", "Kuznecov", 80),
                new Student("Oleg", "Kulikov", 10),
                new Student("Ashot", "Ahmetov", 20)
        );
        List<Student> sortedList = list.stream()

                //TODO: Отсортировать по score и по алфавиту, выбрать только тех, у кого score больше или равно 56
                .filter(score -> score.getScore() >= 56)
                .sorted(Comparator.comparing(Student::getScore).reversed())
                /*.sorted(Comparator
                        .comparing(Student::getScore)
                        .thenComparing(Student::getLastName))*/
                .collect(Collectors.toList());
        sortedList.forEach(x1 -> System.out.println(x1));

        Assertions.assertEquals("Kuznecov", sortedList.get(0).getLastName());
        Assertions.assertEquals("Antonov", sortedList.get(1).getLastName());
        Assertions.assertEquals(60, sortedList.get(2).getScore());
    }
}