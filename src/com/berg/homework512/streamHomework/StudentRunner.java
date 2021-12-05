package com.berg.homework512.streamHomework;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 * <p>
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 * <p>
 * Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 * <p>
 * Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 * <p>
 * Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 * <p>
 * Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 */
public class StudentRunner {

    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student("Kate", "Blanshet", 3254, List.of(71, 78, 91, 100)),
                new Student("Petr", "Petrov", 3254, List.of(71, 72, 73, 74, 75)),
                new Student("Nikolay", "Nikolaev", 3254, List.of(85, 86, 87, 88, 81)),
                new Student("Anna", "Alexanova", 3254, List.of(63, 78, 66, 100, 96)),
                new Student("Anna", "Blexanova", 3254, List.of(63, 78, 66, 100, 96)),
                new Student("Sveta", "Svetikova", 3128, List.of(100, 98, 97, 95, 96, 94, 99)),
                new Student("Ivan", "Ivanov", 3128, List.of(78, 79, 80, 81, 82, 83, 84)),
                new Student("Alex", "Alexanov", 3128, List.of(62, 73, 65, 75, 68, 79, 70)),
                new Student("Vadim", "Vadimov", 5468, List.of(64, 74, 67, 76, 69, 77, 72))
        );

        Map<Integer, Double> averageMarkByCourse = averageMarkByCourse(studentList);
        Map<Integer, List<String>> fullNameByCourse = fullNameByCourse(studentList);

        courseObject(studentList);
    }

    private static void courseObject(List<Student> studentList) {
        Map<Integer, Student.StudentRecord> integerStudentRecordMap = studentList.stream()
                .sorted(new StudentFullNameComparator())
                .filter(student -> student.getMarks().size() > 3)
                .collect(Collectors.groupingBy(Student::getCourseNumber,
                        Collectors.collectingAndThen(Collectors.toList(), list -> {
                            List<String> stringList = list.stream().
                                    map(Student::getFulName).
                                    collect(Collectors.toList());
                            Double average = list.stream()
                                    .collect(Collectors.averagingDouble(Student::getAverageStudentMark));
                            return new Student.StudentRecord(stringList, average);
                        })
                ));
        System.out.println("Stream result: ");
        System.out.println(integerStudentRecordMap);
    }

    private static Map<Integer, List<String>> fullNameByCourse(List<Student> studentList) {
        Map<Integer, List<String>> courseAndFullName = studentList.stream()
                .sorted(new StudentFullNameComparator())
                .collect(Collectors.groupingBy(Student::getCourseNumber,
                        Collectors.mapping(Student::getFulName, Collectors.toList())));
        System.out.println(courseAndFullName);
        return courseAndFullName;
    }

    private static Map<Integer, Double> averageMarkByCourse(List<Student> studentList) {
        Map<Integer, Double> averageMarkByCourse = studentList.stream()
                .filter(student -> student.getMarks().size() > 3)
                .collect(Collectors.groupingBy(Student::getCourseNumber,
                        Collectors.averagingDouble(Student::getAverageStudentMark)));
        System.out.println(averageMarkByCourse);
        return averageMarkByCourse;
    }
}
