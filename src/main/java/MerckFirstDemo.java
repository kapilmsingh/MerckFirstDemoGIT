import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import java.io.IOException;


public class MerckFirstDemo extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) throws Exception {
		Server server = new Server(Integer.valueOf((System.getenv("PORT"))));
		ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
		context.setContextPath("/");
		server.setHandler(context);
		context.addServlet(new ServletHolder(new MerckFirstDemo()), "/*");
        server.start();
        server.join();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.getWriter().print("******************Merck First Demo Get API ******************");
	}
}
