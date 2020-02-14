package ua.org.javaday;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.List.of;
import static java.util.stream.Collectors.filtering;
import static java.util.stream.Collectors.toList;

public class TeeingCollector {
    public static void main(String[] args) {
        var listList = Stream.of("Devoxx", "Voxxed Days", "Code One", "Basel One")
                .collect(Collectors.teeing(
                        filtering(n -> n.contains("xx"), toList()),
                        filtering(n -> n.endsWith("One"), toList()),
                        (var list1, var list2) -> of(list1, list2)));
    }
}
