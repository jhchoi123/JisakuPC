package context;

public interface RequestContext {
    String getCommandPath();

    String[] getParameter(String key);

    String[] getParameterKeys();

    Object getRequest();

    void setRequest(Object request);

    String getReferer();

    Object getSessionAttribute(String key);

    void setSessionAttribute(String key, Object value);

    void clearSession();
}
