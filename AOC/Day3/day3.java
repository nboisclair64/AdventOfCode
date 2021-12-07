import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * day3
 */
public class day3 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("day3.txt");
        Scanner reader = new Scanner(file);
        ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
        String line = null;
        while(reader.hasNextLine()){
            line = reader.nextLine();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<12;i++){
                list.add(i, Integer.parseInt(String.valueOf(line.charAt(i))));
            }
            array.add(list);
            
        }
        ArrayList<Integer> currentVal;
        int[] gamma = new int[12];
        int[] episilon = new int[12];
        String g="";
        String e="";
        int zeroCount = 0;
        int onesCount =0;
        for(int i=0;i<12;i++){
            for(int j=0;j<1000;j++){
                currentVal = array.get(j);
                if(currentVal.get(i)==0){
                    zeroCount++;
                }
                else if(currentVal.get(i)==1){
                    onesCount++;
                }
            }
            System.out.println(zeroCount);
            if(zeroCount>=onesCount){
                g = g+String.valueOf(0);
                e=e+String.valueOf(1);
            }
            else{
                g=g+String.valueOf(1);
                e=e+String.valueOf(0);
            }
            zeroCount=0;
            onesCount=0;
        }
        System.out.println((Integer.parseInt(g,2))*(Integer.parseInt(e,2)));
        

    }
}