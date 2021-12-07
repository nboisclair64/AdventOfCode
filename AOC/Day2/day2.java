import java.io.*;

/**
 * day2
 */
public class day2 {

    public static void main(String[] args) throws IOException {
        File file = new File("day2.txt");
        FileReader fReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fReader);
        String line=bReader.readLine();
        int Hcount=0;
        int Dcount=0;
        int aim=0;
        while(line!=null){
            String[] content = line.split(" ");
            if(content[0].compareTo("forward")==0){
                Hcount = Hcount + Integer.parseInt(content[1]);
                Dcount = Dcount + (aim*Integer.parseInt(content[1]));
            }
            else if(content[0].compareTo("down")==0){
                aim = aim + Integer.parseInt(content[1]);
            }
            else if(content[0].compareTo("up")==0){
                aim = aim - Integer.parseInt(content[1]);
            }
            line = bReader.readLine();
        }
        System.out.println(Hcount * Dcount);
    }
}