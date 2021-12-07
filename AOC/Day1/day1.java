import java.io.*;
import java.util.ArrayList;

/**
 * day1
 */
public class day1 {

    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        FileReader fReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fReader);
        String line = bReader.readLine();
        int next= 0;
        int count=0;
        int windowSum=0;
        ArrayList <Integer> list = new ArrayList<Integer>();
        while(line!=null){
            list.add(Integer.parseInt(line));
            line = bReader.readLine();
        }
        for(int i=0;i<list.size()-3;i++){
            windowSum= list.get(i)+list.get(i+1)+list.get(i+2);
            next = list.get(i+1)+list.get(i+2)+list.get(i+3);
            if(next>windowSum){
                count++;
            }
        }
        System.out.println(count);
    }
}