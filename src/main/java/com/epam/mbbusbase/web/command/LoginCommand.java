package com.epam.mbbusbase.web.command;

import com.epam.mbbusbase.web.Page;

import javax.servlet.http.HttpServletRequest;

import static com.epam.mbbusbase.constant.PageUrlConstatns.LOGIN_PAGE;

public class LoginCommand implements Command{



    @Override
    public Page perform(HttpServletRequest request) {
        return new Page(LOGIN_PAGE);
    }
}
