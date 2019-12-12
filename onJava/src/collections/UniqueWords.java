package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("SetOperations.java"));
        Set<String> words = new TreeSet<>();
        for (String line : lines){
            for(String word : line.split("\\W+")){
                if(word.trim().length()>0){
                    words.add(word);
                }
            }
        }
        System.out.println(words);
    }
}
