import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify(" PrzyKładoWY tekst DO upięKSZeniA   ", text -> text.toUpperCase()));
        System.out.println(poemBeautifier.beautify(" PrzyKładoWY tekst DO upięKSZeniA   ", text -> text.toLowerCase()));
        System.out.println(poemBeautifier.beautify(" PrzyKładoWY tekst DO upięKSZeniA   ", text -> text.trim()));
    }
}
