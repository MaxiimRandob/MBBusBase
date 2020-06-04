package com.epam.mbbusbase.factory;

import com.epam.mbbusbase.web.command.Command;
import com.epam.mbbusbase.web.command.HomeCommand;
import com.epam.mbbusbase.web.command.NotFoundCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    private static Map<String, Command> getCommandMap = new HashMap<>();
    private static Map<String, Command> postCommandMap = new HashMap<>();
    private static Command defaultCommand = new NotFoundCommand();

    static {

        //--------- GET commands ----------//
        getCommandMap.put("/", new HomeCommand());


        //--------- POST commands ----------//

    }

    private CommandFactory() {
    }

    public static Command getCommand(String path, String type) {
        return "GET".equals(type)
                ? getCommand(path)
                : postCommand(path);
    }

    private static Command getCommand(String path) {
        return getCommandMap.getOrDefault(path, defaultCommand);
    }

    private static Command postCommand(String path) {
        return postCommandMap.getOrDefault(path, defaultCommand);
    }
}
