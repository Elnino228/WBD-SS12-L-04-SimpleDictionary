import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslateServlet", urlPatterns = "/translate")
public class TranslateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary =new HashMap<>();
        dictionary.put("hello","xin chào");
        dictionary.put("how","thế nào");
        dictionary.put("book","sách");
        dictionary.put("computer",",máy tính");

        String search=request.getParameter("txtSearch");
        PrintWriter writer=response.getWriter();
        writer.println("<html>");

        String result=dictionary.get(search);
        if (request!=null) {
            writer.println("Word: "+search);
            writer.println("Result: "+result);
        } else {
            writer.println("Not found");
        }

        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary =new HashMap<>();
        dictionary.put("hello","xin chào");
        dictionary.put("how","thế nào");
        dictionary.put("book","sách");
        dictionary.put("computer",",máy tính");

        String search=request.getParameter("txtSearch");
        PrintWriter writer=response.getWriter();
        writer.println("<html>");

        String result=dictionary.get(search);
        if (request!=null) {
            writer.println("Word: "+search);
            writer.println("Result: "+result);
        } else {
            writer.println("Not found");
        }

        writer.println("</html>");
    }
}
