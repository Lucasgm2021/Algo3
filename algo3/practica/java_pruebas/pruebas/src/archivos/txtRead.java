package archivos;

import java.io.*;

public class txtRead {
    private FileReader file;

    public txtRead (FileReader file){
        this.file =file;
    }
    public void pruebas() throws IOException{

        BufferedReader br = new BufferedReader(this.file);
        String line="";
        while (line!=null){
            if (!line.isEmpty()) {
                System.out.println(line);
            }
            line = br.readLine();
        }
    }

    public void pruebas2(){
        FileWriter f = new FileWriter(this.file.toString());
    }
}
