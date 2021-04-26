import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        Comparator<String> comparator = new ComparadorPorTamanho();
        //Collections.sort(palavras, comparator);
        palavras.sort(comparator);
        System.out.println(palavras);

//        for(String p : palavras){
//            System.out.println(p);
//        }
        Consumer<String> consumer = new ImprimeNaLinha();
        palavras.forEach(consumer);
    }
}

class ImprimeNaLinha implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String string1, String string2) {
        if(string1.length() < string2.length())
            return -1;
        if(string1.length() > string2.length())
            return 2;
        return 0;
    }
}