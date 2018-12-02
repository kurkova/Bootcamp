import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class MainClass {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String result = movieStore.getMovies().entrySet().stream()
                .flatMap(p -> p.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(result);
    }
}

