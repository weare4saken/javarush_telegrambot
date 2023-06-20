package com.github.HighlandProger.javarushtelegrambot.jrtb.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.HighlandProger.javarushtelegrambot.jrtb.command.UnknownCommand.UNKNOWN_MESSAGE;

@DisplayName("Unit-level testing for UnknownCommand")
public class UnknownCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return "/fstwetsdf";
    }

    @Override
    String getCommandMessage() {
        return UNKNOWN_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new UnknownCommand(sendBotMessageService);
    }
}
