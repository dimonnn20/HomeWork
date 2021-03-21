package eu.senla.task11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main (String [] args) throws IOException {
        String path = "/Users/User/IdeaProjects/eu.senla/src/eu/senla/task11/CPU";
        List <CPU> list = null;
        list = Files.lines(Paths.get(path))
                .map(s -> s.split(","))
                .map(s-> Arrays.stream(s).map(String::trim).toArray(String []::new))
                .map(strArr -> {
                    Double frequency = Double.parseDouble(strArr[1]);
                    String model = strArr[0];
                    CPU cpu = new CPU(model, frequency);
                    return cpu;
                })
                .collect(Collectors.toList());
                System.out.println(list);

        //SORTED
        System.out.println("SORTED");
        list.stream()
                .sorted(new myComparator())
                .forEach(System.out::println);


                // FILTER, COUNT
        System.out.println("FILTERED, COUNTED");
        System.out.println("Amount of the CPUs with the frequency more than 2Ghz is =  " + list.stream()
        .filter(s -> s.getfrequency()>2)
        .peek(System.out::println)
        .count());

        // SKIP, LIMIT
        System.out.println("SKIP 3, LIMIT 4");
        list.stream()
                .skip(3)
                .limit(4)
                .forEach(System.out::println);

        //FINDFIRST
        System.out.print("FINDFIRST = ");
        System.out.println(list.stream()
        .sorted(new myComparator())
        .findFirst());

        //FINDANY
        System.out.print("FIND ANY = ");
        System.out.println(list.stream()
        .findAny());

        //MIN
        System.out.print("MINIMUM = ");
        System.out.println(list.stream()
        .min(new myComparator()));
        //MAX
        System.out.print("MAXIMUM = ");
        System.out.println(list.stream()
                .max(new myComparator()));

        //DISTINCT
        System.out.println("DISTINCT: ");
        list.stream()
                .distinct()
                .map(s -> s.getModel())
                .forEach(System.out:: println);

        //toArray
        System.out.println("toArray: ");
        String [] array = list.stream()
                .map(s-> s.getModel())
                .toArray(String[]::new);
        Arrays.stream(array)
                .forEach(System.out:: println);

        // AllMatch
        System.out.print("Are the all CPUs with frequency more than 1 Ghz = ");
        System.out.println(list.stream()
        .allMatch(w-> w.getfrequency()>=1));


        // Anymatch
        System.out.print("Is there any CPUs with frequency more than 2.5 Ghz = ");
        System.out.println(list.stream()
        .anyMatch(w-> w.getfrequency()>2.5));

        // NoneMatch
        System.out.print("No CPU with the frequency lower 1 Ghz = ");
        System.out.println(list.stream()
                .noneMatch(w-> w.getfrequency()<1));

    }



}
