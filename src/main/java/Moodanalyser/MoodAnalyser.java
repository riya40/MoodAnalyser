package Moodanalyser;
import java.util.*;
import java.lang.*;

public class MoodAnalyser
{
    private String message;

    public MoodAnalyser(){
        this.message = message;

    }
    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analysemood(){
        //exception handling

        try{

            //passing the message
        if (this.message.contains("sad")) {
            return "sad";
        }
        else{
            return "Happy";

        }
        }
        catch(NullPointerException ne){
            return "Happy";
        }
    }


    public static void main( String[] args )
    {

        System.out.println( "moodAnalyser" );
    }


}
