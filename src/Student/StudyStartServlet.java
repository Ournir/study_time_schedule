package Student;

import java.io.IOException;
import java.sql.Timestamp;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Student;
import utils.DBUtil;

/**
 * Servlet implementation class StudyStartServlet
 */
@WebServlet("/start")
public class StudyStartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudyStartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // EntityManegerとつなぐ
        EntityManager em = DBUtil.createEntityManager();

        Student s = new Student();



        // 勉強を開始した時間を取得
        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
        s.setCreated_at(currentTime);

        // インスタンス化してStudentのプロパティに格納
        // EntityManagerを閉じる
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
        em.close();

        // リクエストスコープにStudentのプロパティをセット
        request.setAttribute("Student", s);

        // jspに戻る
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/topPage/index.jsp");
        rd.forward(request, response);

    }



}
