package computingservice.control;

import java.io.IOException;
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String wsURL = "http://localhost:8081/ComputingService";
		ComputingServiceServiceStub stub = new ComputingServiceServiceStub(wsURL);
		
		InvokeRequest req = new InvokeRequest();
		req.setMessageType("0");
		req.setRIC("BHP.AX");
		req.setStartTime("00:00:00.000");
		req.setEndTime("23:59:59.999");
		req.setStartDate("01-JAN-2004");
		req.setEndDate("01-DEC-2004");
		req.setUseGMT("1");
		req.setUseCorporateActions("");
		
		InvokeResponse rsp = new InvokeResponse();
		try {
			rsp = stub.invoke(req);
			
		} catch (ComputingServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
