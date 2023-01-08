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
    
    




}
