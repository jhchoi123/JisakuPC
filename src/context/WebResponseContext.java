package context;

import javax.servlet.http.HttpServletResponse;

public class WebResponseContext implements ResponseContext {
    private Object result;
    private String target;

    private HttpServletResponse response;

    public WebResponseContext() {}

    @Override
    public void setResult(Object bean) {
        this.result = bean;
    }

    @Override
    public Object getResult() {
        return result;
    }

    @Override
    public void setTarget(String transferInfo) {
        this.target = "/WEB-INF/jsp/" + transferInfo + ".jsp";
    }

    @Override
    public String getTarget() {
        return target;
    }

    @Override
    public void setResponse(Object response) {
        this.response = (HttpServletResponse) response;
    }

    @Override
    public Object getResponse() {
        return response;
    }
}