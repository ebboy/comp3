package testejsp;

import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "ServletTest", urlPatterns = {"/formtest"})
public class ServletTest extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String campo1 = request.getParameter("campo1");
        PrintWriter outCampo1 = response.getWriter();
        outCampo1.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\" dir=\"ltr\">\n" +
                "    <head>\n" +
                "        <meta charset=\"utf-8\">\n" +
                "        <title></title>\n" +
                "    </head>\n" +
                "    <body>\n" +
                campo1 +
                "        \n"  +
                "    </body>\n" +
                "</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
