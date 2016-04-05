/*
 * This base of this source code was originally taken from Apache's OpenNLP Documentation.
 * Development by Imballinst (imballinst.github.io)
 */

/**
 *
 * @author Imballinst
 */
import java.util.ArrayList;

/**
 *
 * @author Imballinst
 */
public class NewClass {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        IndonesianPOSTagger ipostag = new IndonesianPOSTagger();
        String teks = "Indonesia / Amerika senang bermain voli, basket, dan sepakbola.";
        ArrayList<String[]> str = ipostag.doPOSTag(teks);
        int n = str.size();
        for(int i=0; i<n; i++)
          System.out.println(str.get(i)[0]+"/"+str.get(i)[1]); 
    }
}