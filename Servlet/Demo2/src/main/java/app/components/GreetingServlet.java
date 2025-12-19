package app.components;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicInteger;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GreetingServlet extends HttpServlet {
    private AtomicInteger counter = new AtomicInteger();

    @Override
    protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
        String pinfo = request.getPathInfo();
        String name = pinfo != null ? pinfo.substring(1) : "Chutiya";
        int count = counter.incrementAndGet();
        var application = super.getServletContext();
        String page = application.getRealPath("/WEB-INF/template/welcome.html");
        String content = Files.readString(Path.of(page))
            .replace("|Visitor_name|" , name)
            .replace("|Visitor_count|" , String.valueOf(count));
        response.setContentType("text/html");
        response.getWriter().write(content);  
    }

}