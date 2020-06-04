package com.epam.mbbusbase.web.command;

import com.epam.mbbusbase.web.Page;

import javax.servlet.http.HttpServletRequest;

public class NotFoundCommand
        implements Command
{
    @Override
    public Page perform(final HttpServletRequest request)
    {
        return null;
    }
}
