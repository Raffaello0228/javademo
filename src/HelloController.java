
    import java.io.IOException;

    public class HelloController extends javax.servlet.http.HttpServlet {
        protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
            doPost(request,response);
        }

        protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

            request.setCharacterEncoding("UTF-8");
            String name = (String) request.getParameter("name");
            request.setAttribute("name",name);
            System.out.println(name);
            request.getRequestDispatcher("index.jsp").forward(request,response);

        }
    }

