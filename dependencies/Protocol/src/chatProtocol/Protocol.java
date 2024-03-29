package chatProtocol;

public class Protocol {

    public static final String SERVER = "localhost";
    public static final int PORT = 1234;

    public static final int LOGIN = 1;
    public static final int LOGOUT = 2;
    public static final int POST = 3;
    public static final int REGISTER = 5;

    public static final int DELIVER = 1;
    public static final int UPDATE = 4;
    public static final int CONECTADO = 6;
    public static final int DESCONECTADO = 7;

    public static final int ERROR_NO_ERROR = 0;
    public static final int ERROR_LOGIN = 1;
    public static final int ERROR_LOGOUT = 2;
    public static final int ERROR_POST = 3;
    public static final int ERROR_UPDATE = 4;
    public static final int ERROR_REGISTER = 5;
  
}


