package Audiobook;

import java.util.ArrayList;
import java.util.regex.*;
import java.util.Date;

public class User{
	private int ssn;
    private String name;
    private String surname;
    private String e_mail;
    private String phoneNumber;
    private int balance;
    private int password;
    private Date birthday;
    

    public User(int ssn, String name, String surname, String e_mail, String phoneNumber, int balance, int password,
			Date birthday) {
		this.ssn = ssn;
		this.name = name;
		this.surname = surname;
		this.e_mail = e_mail;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
		this.password = password;
		this.birthday = new Date();
	}
public User() {
		// TODO Auto-generated constructor stub
	}
	/*
	public boolean isThereCharacter(String num) { yaþ bilgisi eklememiþiz
    	for(int i = 0 ; i< num.length(); i++)
    		if(num.charAt(i) < '0' || num.charAt(i) > '9') {
    			return true;
    		}
    	return false;
    }

    public boolean isAgeValid(int age){
        if(age > 0 && age < 120 )
            return true;
        else
            return false;
    }
    */
    public boolean isStringEmpty(String string) {
    	return string.equals("");
    }

    public boolean isPhoneValid(String phoneNumber){
        if(phoneNumber.length() == 11) {
            for(int i = 0; i < 11 ; i++)
                if(phoneNumber.charAt(i) > '9')
                    return false;
            return true;
        }
        else
            return false;
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


    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
