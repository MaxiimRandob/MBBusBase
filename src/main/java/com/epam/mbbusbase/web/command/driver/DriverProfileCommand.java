package com.epam.mbbusbase.web.command.driver;

import com.epam.mbbusbase.web.Page;
import com.epam.mbbusbase.web.command.Command;

import javax.servlet.http.HttpServletRequest;

import static com.epam.mbbusbase.constant.PageUrlConstatns.DRIVER_PROFILE_PAGE;

public class DriverProfileCommand implements Command {
    @Override
    public Page perform(HttpServletRequest request) {
        return new Page(DRIVER_PROFILE_PAGE);
    }
}
