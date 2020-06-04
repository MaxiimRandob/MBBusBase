package com.epam.mbbusbase.web.command.admin;

import com.epam.mbbusbase.web.Page;
import com.epam.mbbusbase.web.command.Command;

import javax.servlet.http.HttpServletRequest;

import static com.epam.mbbusbase.constant.PageUrlConstatns.ADMIN_PROFILE_PAGE;

public class AdminProfileCommand implements Command {
    @Override
    public Page perform(HttpServletRequest request) {
        return new Page(ADMIN_PROFILE_PAGE);
    }
}
