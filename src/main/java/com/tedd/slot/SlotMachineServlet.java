package com.tedd.slot;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import com.google.gson.Gson;

public class SlotMachineServlet extends HttpServlet {

    private final SlotEngine engine = new SlotEngine();
    private final Gson gson = new Gson();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        double bet = Double.parseDouble(req.getParameter("bet"));

        SlotEngine.SpinResult result = engine.spin(bet);

        resp.setContentType("application/json");
        resp.getWriter().write(gson.toJson(result));
    }
}
