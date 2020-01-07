import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-amber")
public class HelloWorldServlet extends HttpServlet {
    private String ul = "<ul>" +
            "<li> amber </li>" +
            "<li> jones </li>" +
            "</ul>";

    private static int counter = 0;
    private String name = "";


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) {

        try {
            res.setContentType("text/html");
            PrintWriter writer = res.getWriter();

            if(req.getParameter("konami") != null){
                String code = req.getParameter("konami");
                if(code.equals("codeup"));
                this.counter = 0;
            }


            if(req.getParameter("name") != null){
                name = req.getParameter("name");
                writer.printf("<h1>Hello %s , count: %d</h1>", name, ++counter);
            }
            else writer.printf("<h1>Hello World , count: %d</h1>", ++counter);
        } catch(IOException ex) {
            System.out.printf("ERROR: %s\n", ex);
        }
    }


}
