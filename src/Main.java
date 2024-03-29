import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Movie> blockbusters = new ArrayList<>();

        blockbusters.add(new Movie("Avatar",100000,10000,1000000000));
        blockbusters.add(new Movie("Avengers Endgame",90000,9000,810000000));
        blockbusters.add(new Movie("Avatar The Way of Water", 80000, 8000, 640000000));
        blockbusters.add(new Movie("Titanic", 70000, 7000, 490000000));
        blockbusters.add(new Movie("Star Wars Episode VII  The Force Awakens", 60000, 6000, 360000000));
        blockbusters.add(new Movie("Avengers Infinity War", 50000, 5000, 250000000));
        blockbusters.add(new Movie("Spider-Man No Way Home", 40000, 4000, 160000000));
        blockbusters.add(new Movie("Jurassic World", 30000, 3000, 90000000));
        blockbusters.add(new Movie("The Lion King", 20000, 2000, 40000000));
        blockbusters.add(new Movie("The Avengers", 10000, 1000, 10000000));


        Iterator<Movie> iterator = blockbusters.iterator();
        Movie actual;
        String report = "";
        while (iterator.hasNext()) {
            actual = iterator.next();
            report += "Titulo "+ actual.getTitle()+ " Recaudacion " + actual.getEarningsProjection()
                    + " Beneficios " + actual.getProfitProjection()+" ";
        }

        String jenkinsfile = "pipeline {\n" +
                "    agent any\n" +
                "    stages {\n" +
                "        stage('Report') {\n" +
                "            steps {\n" +
                "                script {\n" +
                "                    echo \""+report+"\"\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}\n";
        File file = new File("C:\\Users\\dazanonr\\Documents\\IntelliJ Projects\\Ejercicios Java Indra\\Integrador 4\\Jenkinsfile");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(jenkinsfile);
        bufferedWriter.close();
    }
}