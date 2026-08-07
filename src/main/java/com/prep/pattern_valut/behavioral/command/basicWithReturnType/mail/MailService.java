package com.prep.pattern_valut.behavioral.command.basicWithReturnType.mail;

public class MailService {

    public String sendMail(String senderAddress, String receiverAddress, String message){
        System.out.printf("email sent from %s to %s with the message: %s \n",senderAddress,receiverAddress,message);
        return "Email sent successfully";
    }
}
