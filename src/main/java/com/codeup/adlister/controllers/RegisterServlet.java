package com.codeup.adlister.controllers;

import com.codeup.adlister.models.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODOne: show the registration form
        response.sendRedirect("/register");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO: ensure the submitted information is valid
        // TODO: create a new user based off of the submitted information
        // TODOne: if a user was successfully created, send them to their profile

        //new user
        User user = new User(

        );
        //need to get the profile? or can just redirect, does user carry over - check correct file placement
        response.sendRedirect("/profile");
    }
}
