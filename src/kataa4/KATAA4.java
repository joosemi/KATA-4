package kataa4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class KATAA4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String nameFile = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\KATAA4\\Data\\email.txt";
        ArrayList<String> mailArray = MailListReader.reader(nameFile);
        
        Histogram<String> histo = MailHistogramBuilder.build(mailArray);
        new HistogramDisplay(histo).execute();
    }
}
