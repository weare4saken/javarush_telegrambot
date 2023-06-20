package com.github.HighlandProger.javarushtelegrambot.jrtb.service;

import com.github.HighlandProger.javarushtelegrambot.jrtb.bot.JavaRushTelegramBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class SendBotMessageServiceImpl implements SendBotMessageService {

    private final JavaRushTelegramBot javaRushBot;


    @Autowired
    public SendBotMessageServiceImpl(JavaRushTelegramBot javaRushBot) {
        this.javaRushBot = javaRushBot;
    }


    @Override
    public void sendMessage(String chatID, String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatID);
        sendMessage.enableHtml(true);
        sendMessage.setText(message);

        try {
            javaRushBot.execute(sendMessage);
        }catch (TelegramApiException e){
            e.printStackTrace();
        }


    }
}
