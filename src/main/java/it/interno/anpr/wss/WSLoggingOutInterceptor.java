package it.interno.anpr.wss;

import it.interno.anpr.util.Utils;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.interceptor.SoapOutInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;

import javax.xml.soap.SOAPMessage;
import java.io.FileOutputStream;

/** Interceptor per il logging del messaggio inviato (Request) 
 * @author gferraro
 *
 */
public class WSLoggingOutInterceptor extends AbstractSoapInterceptor
{

    public WSLoggingOutInterceptor ()
    {
		super(Phase.POST_PROTOCOL_ENDING);
		this.addAfter(SoapOutInterceptor.class.getName());
    }

    /* (non-Javadoc)
     * @see org.apache.cxf.interceptor.Interceptor#handleMessage(org.apache.cxf.message.Message)
     */
    @Override
    public void handleMessage ( SoapMessage message ) throws Fault
    {
        try
        {
			SOAPMessage soapMsg = message.getContent(SOAPMessage.class);
			if (soapMsg == null) {
			} else {
				String xmlformatted = Utils.prettySOAPMessageAsString(soapMsg);
	            FileOutputStream os = new FileOutputStream ("message_out.xml");
				os.write(xmlformatted.getBytes());;
	            os.close ( );
			}
        }

        catch ( Exception ex )
        {
            ex.printStackTrace ( );
        }

    }

}
