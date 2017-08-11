package cl.bicevida.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.apache.cxf.common.logging.LogUtils;
import org.apache.cxf.jaxrs.utils.ExceptionUtils;
import org.apache.cxf.jaxrs.utils.JAXRSUtils;
import org.apache.cxf.logging.FaultListener;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.PhaseInterceptorChain;

public class ValidacionException implements ExceptionMapper<WebApplicationException> {

	private static final Logger LOG = LogUtils.getL7dLogger(ValidacionException.class);
	    private static final String ERROR_MESSAGE_START = "Ha ocurrido un error al mapear la información del objeto Json.";
	    private boolean printStackTrace = true;
	    private boolean addMessageToResponse;
	    
	    public Response toResponse(WebApplicationException ex) {
	        
	        Response r = ex.getResponse();
	        if (r == null) {
	            r = Response.serverError().build();
	        }
	        boolean doAddMessage = r.getEntity() != null ? false : addMessageToResponse;
	        
	        
	        Message msg = PhaseInterceptorChain.getCurrentMessage();
	        FaultListener flogger = null;
	        if (msg != null) {
	            flogger = (FaultListener)PhaseInterceptorChain.getCurrentMessage()
	                .getContextualProperty(FaultListener.class.getName());

	        }
	        //String errorMessage = doAddMessage || flogger != null ? buildErrorMessage(r, ex) : null;
	        String errorMessage = doAddMessage || flogger != null ? buildErrorMessageJson(r, ex) : null; 
	        
	            if (flogger == null || !flogger.faultOccurred(ex, errorMessage, msg)) {
	                       	
	            	Level level = printStackTrace ? Level.WARNING : Level.FINE;
	                LOG.log(level, ExceptionUtils.getStackTrace(ex));
	        }
	        
	        if (doAddMessage) {
	            r = JAXRSUtils.copyResponseIfNeeded(r);
//	            r = JAXRSUtils.fromResponse(r).entity(errorMessage).type(MediaType.TEXT_PLAIN).build();
	            r = JAXRSUtils.fromResponse(r).entity(errorMessage).type(MediaType.APPLICATION_JSON).build();
	        }
	        return r;
	    }

	    protected String buildErrorMessage(Response r, WebApplicationException ex) {
	        StringBuilder sb = new StringBuilder();
	        sb.append(ERROR_MESSAGE_START).append(r.getStatus());
	        
	        Throwable cause = ex.getCause();
	        String message = cause == null ? ex.getMessage() : cause.getMessage();
	        if (message == null && cause != null) {
	            message = "exception cause class: " + cause.getClass().getName();
	        }
	        if (message != null) {
	            sb.append(", message: ").append(message);
	        }
	        return sb.toString();
	    }
	    protected String buildErrorMessageJson(Response r, WebApplicationException ex) {
	        StringBuilder sb = new StringBuilder();
	        String com = "\""; 
	        sb.append("{\n");
	        sb.append(com);
	        sb.append("error");
	        sb.append(com);
	        sb.append(":");
            sb.append(com);
	        sb.append(ex.getMessage());
	        sb.append(com);
	        sb.append(",\n"); 
	        sb.append(com);
	        sb.append("statusCode");
	        sb.append(com);
	        sb.append(":");
	        sb.append(r.getStatus());
	        
	        Throwable cause = ex.getCause();
	        String message = cause == null ? ex.getMessage() : cause.getMessage();
	        String message2 = cause == null ? ex.getMessage() : ex.getMessage();
	        if (message == null && cause != null) {
	            message = "Causa del error " + cause.getClass().getName();
	        }
	        	
	         if(ex.getCause() != null){
	            sb.append(",\n");
	            String causa = null;
	            
		            causa = ex.getCause().getMessage().replaceAll("''", "");
		            sb.append(com);
		            sb.append("statusText");
		            sb.append(com);
		            sb.append(":");
		            sb.append(com);
		            
		            causa = ex.getCause().getMessage().replaceAll(com, "");
		            sb.append(causa);
		            sb.append(com);
	        }else{
	        	sb.append(",\n");
	        	sb.append(com);
	            sb.append("statusText");
	            sb.append(com);
	            sb.append(":");
	            sb.append(com);
	            sb.append(ex.getLocalizedMessage());
	            sb.append(com);
	        }
	         
	        sb.append("\n}");
	        return sb.toString();
	    }
	    
	    /**
	     * Control whether to log at WARN or FINE level.
	     * Note this property is ignored if a registered {@link FaultListener} 
	     * has handled the exception
	     * @param printStackTrace if set to true then WARN level is used (default),
	     *        otherwise - FINE level.
	     */
	    public void setPrintStackTrace(boolean printStackTrace) {
	        this.printStackTrace = printStackTrace;
	    }

	    /**
	     * Controls whether to add an error message to Response or not,
	     * @param addMessageToResponse add a message to Response, ignored
	     *        if the captuted WebApplicationException has 
	     *        a Response with a non-null entity
	     */
	    public void setAddMessageToResponse(boolean addMessageToResponse) {
	        this.addMessageToResponse = addMessageToResponse;
	    }

}
