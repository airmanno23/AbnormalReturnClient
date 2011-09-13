
/**
 * ComputingServiceException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package computingservice.client;

public class ComputingServiceException extends java.lang.Exception{
    
    private computingservice.client.ComputingServiceServiceStub.ComputingServiceExceptionE faultMessage;

    
        public ComputingServiceException() {
            super("ComputingServiceException");
        }

        public ComputingServiceException(java.lang.String s) {
           super(s);
        }

        public ComputingServiceException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ComputingServiceException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(computingservice.client.ComputingServiceServiceStub.ComputingServiceExceptionE msg){
       faultMessage = msg;
    }
    
    public computingservice.client.ComputingServiceServiceStub.ComputingServiceExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    