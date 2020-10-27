import java.io.*;
import java.util.Scanner;

//Created by Stone Steadman SE :D

public class AI
{
public static void main(String[] args)
{
    char Answer;
    Scanner keyboard;
    keyboard = new Scanner(System.in);
    
    System.out.println("Hello user! Welcome to InterChat. A program that allows you to chat with intergalactic"
        + " beings.");
    System.out.println("...");
    System.out.println("It looks like there are <1> available entities to chat with currently!");
    System.out.println("...");
    
    System.out.println("Would you like to chat with (user):TREEMAN69 ? y/n");
    Answer = keyboard.next().charAt(0);
    
    if(Answer =='y')
    {
        System.out.println("You are now chatting with (user):TREEMAN69.");
        System.out.println("...");
        System.out.println("(user):TREEMAN69 has entered the chat.");
        keyboard.nextLine();
        System.out.println("<TREEMAN69: I am groot!> Enter your response.");
        keyboard.nextLine();
        
        System.out.println("<TREEMAN69: I am groot.> Enter your response.");
        keyboard.nextLine();
        
        System.out.println("<TREEMAN69: I am ... groot.> Enter your response.");
        keyboard.nextLine();
        
        System.out.println("<TREEMAN69: I. Am. Groot.> Enter your response.");
        keyboard.nextLine();
        
        System.out.println("<TREEMAN69: I AM GROOT!!> Enter your response.");
        keyboard.nextLine();
        
        System.out.println("<TREEMAN69: * ** *****> {CENSORED LANGUAGE} Enter your response.");
        keyboard.nextLine();
        
        System.out.println("(user):TREEMAN69 has left the chat.");
        System.out.println("(user):TREEMAN69 has reported your account due to {BULLYING}");
        System.out.println("Upon review of your account, it appears you have violated community guidelines."
            + " Your account is now permanently deactivated. ");
        System.out.println("...");
        System.out.println("ACCOUNT BANNED. <IMMEDIATE LOGOUT>");
        System.out.println("...");
        System.out.println("Thank you for visiting Interchat. <PROGRAM TERMINATED>");
        
    }
        
    else
    {
        System.out.println("Thank you for visiting Interchat. <PROGRAM TERMINATED>");
    }
}
}
