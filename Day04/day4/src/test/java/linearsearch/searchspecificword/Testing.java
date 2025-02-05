package linearsearch.searchspecificword;

import linearsearch.searchforaspecificword.SearchWord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing {
    String[] sentences = {"Java is a versatile programming language that is widely used for building robust, scalable applications.",
            "It is platform-independent, which means you can run Java programs on any device that has the Java Virtual Machine (JVM) installed.",
            "Java is object-oriented, which makes it easy to manage and scale large projects.",
            "It provides strong memory management, exception handling, and a secure runtime environment.",
            "Java supports multithreading, allowing the execution of multiple threads simultaneously.",
            "Automatic garbage collection helps manage memory efficiently by removing unused objects.",
            "Java's rich standard library provides a wide range of utilities, from data structures to networking."};
String op="Java supports multithreading, allowing the execution of multiple threads simultaneously.";
    @Test
    void f(){
        Assertions.assertEquals(op, SearchWord.searchForWord(sentences,"multithreading"));
    }
}
