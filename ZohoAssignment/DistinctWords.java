package ZohoAssignment;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class DistinctWords {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
	String str;
		InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
         str=br.readLine();
         String[] words=str.split(" ");
         
        List<String> uniqueWords = new ArrayList<String>(Arrays.asList(words));
         
        for(int i=1;i<uniqueWords.size(); i++) {
            for(int j=0;j<i;j++) {
                if(uniqueWords.get(i).equals(uniqueWords.get(j))) {
                    uniqueWords.remove(i);
                    i--;
                    break;
                }
            }
        }
         
        for(String s: uniqueWords) {
            System.out.println(s);
	  }
	}
}
      
		
		



