package com.epam.mbbusbase.factory;

import com.epam.mbbusbase.web.command.*;
import com.epam.mbbusbase.web.command.admin.AdminProfileCommand;
import com.epam.mbbusbase.web.command.driver.DriverProfileCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    private static Map<String, Command> getCommandMap = new HashMap<>();
    private static Map<String, Command> postCommandMap = new HashMap<>();
    private static Command defaultCommand = new NotFoundCommand();

    static {

        //--------- GET commands ----------//
        getCommandMap.put("/", new HomeCommand());
        getCommandMap.put("/login", new LoginCommand());
        getCommandMap.put("/register", new RegistrationCommand());
        getCommandMap.put("/admin_profile", new AdminProfileCommand());
        getCommandMap.put("/driver_profile", new DriverProfileCommand());


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
