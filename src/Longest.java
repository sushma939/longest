import java.util.*;

public class Longest {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String string = in.nextLine();

        String word = "", small = "", large="";
        String[] words = new String[100];
        int length = 0;
        string = string + " ";

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) != ' '){
                word = word + string.charAt(i);
            }
            else{
                words[length] = word;
                length++;
                word = "";
            }
        }

        small = large = words[0];

        for(int k = 0; k < length; k++){


            if(small.length() > words[k].length())
                small = words[k];
            if(large.length() < words[k].length())
                large = words[k];
        }

        System.out.println("Largest string is : " + large);
    }
}


