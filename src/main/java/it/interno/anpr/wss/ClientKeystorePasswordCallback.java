package it.interno.anpr.wss;

import org.apache.wss4j.common.ext.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;

/** Callback handler per la gestione della password dei Keystore
 * @author gferraro
 *
 */
public class ClientKeystorePasswordCallback implements CallbackHandler {

	/** Impostazione della password del Keystore
	 * 
	 */
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		for (int i = 0; i < callbacks.length; i++) {
			WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];
			pc.setPassword("B6EA0DEB");
		}
		return;
	}
}
