package it.interno.anpr.saml;

import it.interno.anpr.dto.RoleHandler;
import org.apache.wss4j.common.crypto.Crypto;
import org.apache.wss4j.common.crypto.CryptoFactory;
import org.apache.wss4j.common.crypto.CryptoType;
import org.apache.wss4j.common.ext.WSSecurityException;
import org.apache.wss4j.common.saml.SAMLCallback;
import org.apache.wss4j.common.saml.bean.*;
import org.apache.wss4j.common.saml.builder.SAML2Constants;
import org.joda.time.DateTime;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SAML2CallbackHandler implements  CallbackHandler {

    private Crypto crypto;

    public SAML2CallbackHandler() throws WSSecurityException {

        //crypto = CryptoFactory.getInstance("/u01/app/oracle/config/domains/anpr/TEST_Keystore.properties");
        crypto = CryptoFactory.getInstance("C:\\u01\\app\\oracle\\config\\domains\\anpr\\TEST_Keystore.properties");
        CryptoType cryptoType = new CryptoType(CryptoType.TYPE.ALIAS);
        cryptoType.setAlias("699999-EN-0000");
        crypto.getX509Certificates(cryptoType);
    }

    @Override
    public void handle(Callback[] callbacks) throws IOException {

        for (int i = 0; i < callbacks.length; i++) {
            if (callbacks[i] instanceof SAMLCallback) {
                SAMLCallback callback = (SAMLCallback) callbacks[i];
                callback.setIssuer("XS");

                DateTime now = new DateTime();
                DateTime limit = now.plusMinutes(5);
                SubjectBean subjectBean =
                        new SubjectBean(
                                "UtenteFederato", null, "urn:oasis:names:tc:SAML:2.0:cm:bearer"
                        );

                SubjectConfirmationDataBean subjectConfirmationData = new SubjectConfirmationDataBean();
                subjectConfirmationData.setNotAfter(limit);
                subjectConfirmationData.setNotBefore(now);
                subjectBean.setSubjectConfirmationData(subjectConfirmationData);
                callback.setSubject(subjectBean);

                AuthenticationStatementBean authenticationStatementBean = new AuthenticationStatementBean();
                authenticationStatementBean.setSessionNotOnOrAfter(limit);
                authenticationStatementBean.setAuthenticationInstant(now);
                authenticationStatementBean.setAuthenticationMethod("https://www.spid.gov.it/SpidL2");
                SubjectLocalityBean subjectLocality = new SubjectLocalityBean();
                subjectLocality.setIpAddress(InetAddress.getLocalHost().getHostAddress());
                authenticationStatementBean.setSubjectLocality(subjectLocality);
                List<AuthenticationStatementBean> authenticationStatementData = new ArrayList<>();
                authenticationStatementData.add(authenticationStatementBean);
                callback.setAuthenticationStatementData(authenticationStatementData);

                // Attribute definitions
                AttributeBean ipPostazione = new AttributeBean();
                ipPostazione.setQualifiedName("IpPostazione");
                ipPostazione.setNameFormat(SAML2Constants.ATTRNAME_FORMAT_UNSPECIFIED);
                List<Object> ipPostazioneValue = new ArrayList<>();
                ipPostazioneValue.add("10.10.10.10");
                ipPostazione.setAttributeValues(ipPostazioneValue);

                AttributeBean idEnte = new AttributeBean();
                idEnte.setQualifiedName("IdEnte");
                idEnte.setNameFormat(SAML2Constants.ATTRNAME_FORMAT_UNSPECIFIED);
                List<Object> idEnteValue = new ArrayList<>();
                idEnteValue.add("699999");
                idEnte.setAttributeValues(idEnteValue);

                AttributeBean role = new AttributeBean();
                role.setQualifiedName("Role");
                role.setNameFormat(SAML2Constants.ATTRNAME_FORMAT_UNSPECIFIED);
                List<Object> roleValue = new ArrayList<>();
                roleValue.add(RoleHandler.getRole().substring(1));
                role.setAttributeValues(roleValue);

                List<AttributeBean> attributeList = new ArrayList<AttributeBean>();
                attributeList.add(ipPostazione);
                attributeList.add(idEnte);
                attributeList.add(role);

                AttributeStatementBean attrBean = new AttributeStatementBean();
                attrBean.setSamlAttributes(attributeList);
                callback.setAttributeStatementData(Collections.singletonList(attrBean));



                // Data for signer
                callback.setIssuerCrypto(crypto);
                callback.setIssuerKeyName("699999-EN-0000");
                callback.setIssuerKeyPassword("B6EA0DEB");
                callback.setSignAssertion(true);

            }
        }
    }
}
