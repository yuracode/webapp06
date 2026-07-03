package chapter03;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UranaiServlet")
public class UranaiServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, 
        HttpServletResponse response) throws ServletException, IOException {
        // リクエスト/レスポンスで文字化けしないようにUTF-8を使用
        request.setCharacterEncoding("UTF-8");

        // 運勢候補からランダムで1つ選ぶ
        String [] luckArray = {"大吉", "中吉", "小吉", "末吉", "凶"};
        int index = (int)(Math.random() * luckArray.length);
        String luck = luckArray[4];

        // 現在日時を「yyyy年MM月dd日 HH時mm分ss秒」形式で表示用に整形
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒");
        String nowFormatted = now.format(formatter);
        
        // HTMLとして結果を返す
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<p>" + nowFormatted + "</p>");
        out.println("<p>今日の運勢は" + luck + "です。</p>");
    }
}
