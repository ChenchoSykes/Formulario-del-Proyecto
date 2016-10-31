package Hola;

/**
 *
 * @author EMMANUEL
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;

public class ServletFormulario extends HttpServlet {
    String nombre, apellido,correo, edad;
    

    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        nombre = peticion.getParameter("nombres");
        apellido = peticion.getParameter("apellidos");
        correo = peticion.getParameter("correo");
        edad = peticion.getParameter("edad");
        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Respuesta al Formulario del Servlet</title></head>");
        out.println("<body>");
        out.println("<p><h1><center>Su Nombre es:<B>" + nombre + "</B> </center></h1></p><br>");
        out.println("<p><h1><center>Su Apellido es:<B>" + apellido + "</B> </center></h1></p><br>");
        out.println("<p><h1><center>Su Edad es:<B>" + edad + "</B> </center></h1></p><br>");
        out.println("<p><h1><center>Su Correo es:<B>" + correo + "</B> </center></h1></p><br>");
        out.println("hoy es " + new Date());
        out.println("</body></html>");
        out.close();
    }
}
