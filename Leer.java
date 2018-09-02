import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Leer{
    private static final string archivo = "casilla.csv";

    public static void main(String[] args) throws IOException{
	try(
	    Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
	    CSVReader csvReader = new CSVReader(reader);
	    ){

	String [] nextRecord;
	while((nextRecord = csvReader.readNext()) != null){
	    System.out.println(nextRecord[0]);
	    System.out.println(nextRecord[1]);
	    System.out.println(nextRecord[2]);
	    System.out.println(nextRecord[3]);
	    System.out.println(nextRecord[4]);
	}
	}
    }
}

    

