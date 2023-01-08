package Audiobook;

import java.util.regex.*;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.util.Date;

public class Control{

    public Control(){
    	
    }


    public boolean isStringEmpty(String string) {
    	return string.equals("");
    }

    public boolean isEMailValid(String e_mail){
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(e_mail);
        if(matcher.matches())
            return true;
        else
            return false;
    }
    
     public String stringFormat(String bookName, String author, String narratorName, String category, int time) {
    	 Integer i;
    	 for(i=bookName.length();i<40;i++) {
    		 bookName += " ";
    	 }
    	 
    	 bookName += author;
    	 for(i=author.length();i<30;i++) {
    		 bookName += " ";
    	 }
    	 bookName += narratorName;
    	 for(i=narratorName.length();i<20;i++) {
    		 bookName += " ";
    	 }
    	 bookName += category;
    	 
    	 for(i=category.length();i<20;i++) {
    		 bookName += " ";
    	 }
    	 
    	 bookName += ""+time+"";
    	 return bookName;
    	 
     }
    




}
