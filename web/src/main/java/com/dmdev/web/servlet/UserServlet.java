package com.dmdev.web.servlet;

import com.dmdev.service.service.UserService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet
public class UserServlet extends HttpServlet {

    private final UserService userService = new UserService();

    protected void doGet (HttpServletRequest req) {
        userService.getUser(1L);
    }
}
