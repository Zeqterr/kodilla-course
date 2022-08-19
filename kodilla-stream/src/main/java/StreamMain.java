import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify(" PrzyKładoWY tekst DO upięKSZeniA   ", text -> text.toUpperCase()));
        System.out.println(poemBeautifier.beautify(" PrzyKładoWY tekst DO upięKSZeniA   ", text -> text.toLowerCase()));
        System.out.println(poemBeautifier.beautify(" PrzyKładoWY tekst DO upięKSZeniA   ", text -> text.trim()));

        //7.3
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getUserList().stream()
                .filter(s -> s.getSex() == 'm')
                .filter(s -> s.getPosts() >= 1)
                .filter(s -> ChronoUnit.YEARS.between(s.getBirthday(),LocalDate.now()) >= 20)
                .collect(Collectors.toMap(ForumUser::getId, s -> s));
        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}

