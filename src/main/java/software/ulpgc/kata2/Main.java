package software.ulpgc.kata2;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("G://Otros ordenadores/Mi portátil/Año_3/1ºSemestre/IS2/Práctica/title.basics.tsv/title.basics.tsv");
        FileTitleLoader loader = new FileTitleLoader(file, new TsvTitleDeserializer());
        List<Title> titles = loader.load();
        for (Title title : titles) {
            System.out.println(title);
        }
    }
}
