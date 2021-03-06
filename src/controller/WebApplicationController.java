package controller;

import command.AbstractCommand;
import command.CommandException;
import command.CommandFactory;
import context.RequestContext;
import context.ResponseContext;
import context.WebRequestContext;
import context.WebResponseContext;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WebApplicationController implements ApplicationController {
    @Override
    public RequestContext getRequest(Object request) {
        RequestContext requestContext = new WebRequestContext();

        requestContext.setRequest(request);

        return requestContext;
    }

    @Override
    public ResponseContext handleRequest(RequestContext requestContext) throws ControllerException {
        ResponseContext responseContext = null;

        try {
            AbstractCommand command = CommandFactory.getCommand(requestContext);
            command.init(requestContext);
            responseContext = command.execute(new WebResponseContext());
        } catch (CommandException e) {
            throw new ControllerException(e);
        }

        return responseContext;
    }

    @Override
    public void handleResponse(RequestContext requestContext, ResponseContext responseContext) throws ControllerException {
        HttpServletRequest request = (HttpServletRequest) requestContext.getRequest();
        HttpServletResponse response = (HttpServletResponse) responseContext.getResponse();

        request.setAttribute("data", responseContext.getResult());

        RequestDispatcher dispatcher = request.getRequestDispatcher(responseContext.getTarget());

        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            throw new ControllerException(e);
        }
    }
}
