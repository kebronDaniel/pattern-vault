package com.prep.pattern_vault.behavioral.command.basicwithreturntype;

import com.prep.pattern_vault.behavioral.command.basicwithreturntype.mail.MailService;

public class SendMailCommand implements Command<String> {

    private final MailService mailService;
    private final SendMailRequest request;

    public SendMailCommand(MailService mailService, SendMailRequest request) {
        this.mailService = mailService;
        this.request = request;
    }

    @Override
    public String execute() {
        return mailService.sendMail(request.senderAddress(), request.receiverAddress(), request.message());
    }
}
