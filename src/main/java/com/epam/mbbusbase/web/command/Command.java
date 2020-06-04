package com.epam.mbbusbase.web.command;

import com.epam.mbbusbase.web.Page;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public interface Command
{
    public Page perform(HttpServletRequest request);
}
