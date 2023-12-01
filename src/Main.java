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
        blockbusters.add(new Movie("Avengers: Endgame",90000,9000,810000000));


        Iterator<Movie> iterator = blockbusters.iterator();
        Movie actual;
        String report = "";
        while (iterator.hasNext()) {
            actual = iterator.next();
            report += "Titulo: "+ actual.getTitle()+ ", Recaudacion: " + actual.getEarningsProjection()
                    + ", Beneficios: " + actual.getEarningsProjection();
        }

        String jenkinsfile = "pipeline {\n" +
                "    agent any\n" +
                "    stages {\n" +
                "        stage('Movie Report') {\n" +
                "            steps {\n" +
                "                script {\n" +
                "                   echo "+report +"}\n" +
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