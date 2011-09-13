package computingservice.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import computingservice.client.ComputingServiceException;
import computingservice.client.ComputingServiceServiceStub;
import computingservice.client.ComputingServiceServiceStub.InvokeRequest;
import computingservice.client.ComputingServiceServiceStub.InvokeResponse;

/**
 * Servlet implementation class controller
 */
public class controller extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public controller() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        response.setContentType("text/html");
        String wsURL = "http://localhost:8081/ComputingService";
        ComputingServiceServiceStub stub = new ComputingServiceServiceStub(
                wsURL);
        
        String messageType = request.getParameter("messageType");
        String ric = request.getParameter("ric");
        String startTime = request.getParameter("startTime");
        String endTime = request.getParameter("endTime");
        String startDate = request.getParameter("startDate");
        String endDate = request.getParameter("endDate");
        String useGMT = request.getParameter("useGMT");
        String useCA = request.getParameter("useCA");

        InvokeRequest req = new InvokeRequest();
        req.setMessageType(messageType);
        req.setRIC(ric);
        req.setStartTime(startTime);
        req.setEndTime(endTime);
        req.setStartDate(startDate);
        req.setEndDate(endDate);
        req.setUseGMT(useGMT);
        req.setUseCorporateActions(useCA);

        InvokeResponse rsp = new InvokeResponse();
        String result = "";
        try {
            rsp = stub.invoke(req);
            result = rsp.get_return();
        } catch (ComputingServiceException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        String nextJSP = "/index.jsp?url=" + result;
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);
        
    }

}
