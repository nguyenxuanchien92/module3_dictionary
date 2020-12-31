import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/translate")

public class TranslateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String word = req.getParameter("txtSearch");

        boolean result = checkWord(word);
        if(result){
            resp.sendRedirect("https://translate.google.com.vn/?hl=en&tab=wT&sl=en&tl=vi&op=translate");
        }else {
            req.setAttribute("result","Not found!");
            req.getRequestDispatcher("dictionary.jsp").forward(req,resp);
        }
    }

    private boolean checkWord(String word) {
        if (! word.equals(""))
            return true;
        return false;
    }
}
