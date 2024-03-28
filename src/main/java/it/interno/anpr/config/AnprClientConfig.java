package it.interno.anpr.config;

import it.interno.anpr.enumeration.WsSecurity;
import it.interno.anpr.ws.e001anprservice.AnprPortTypeE001;
import it.interno.anpr.ws.e002anprservice.AnprPortTypeE002;
import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Lazy;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@ImportResource({ "classpath:cxf.xml" })
@Configuration
public class AnprClientConfig {

    private final AnprWsProperties anprWsProperties;


    public AnprClientConfig(AnprWsProperties anprWsProperties) {
        this.anprWsProperties = anprWsProperties;
    }


    @Bean
    public JAXBDataBinding jaxbDataBinding() {
        return new JAXBDataBinding();
    }

    @Bean
    @Lazy
    public AnprPortTypeE001 anprPortTypeE001(){

        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(AnprPortTypeE001.class);
        factoryBean.setAddress(anprWsProperties.getEndpoint().concat("/anpr-wsE000/AnprServiceE001"));
        this.setFactoryBean(factoryBean);

        return factoryBean.create(AnprPortTypeE001.class);

    }

    @Bean
    @Lazy
    public AnprPortTypeE002 anprPortTypeE002(){

        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(AnprPortTypeE002.class);
        factoryBean.setAddress(anprWsProperties.getEndpoint().concat("/anpr-wsE000/AnprServiceE002"));
        this.setFactoryBean(factoryBean);

        return factoryBean.create(AnprPortTypeE002.class);

    }

    @Bean(name = "SAML_Request")
    public WSS4JOutInterceptor samlRequestInterceptor() {
        WSS4JOutInterceptor interceptor = new WSS4JOutInterceptor();

        Map<String, Object> properties = new HashMap<>();
        properties.put("action", "SAMLTokenUnsigned");
        properties.put("samlPropFile", "saml.properties");
        properties.put("samlCallbackClass", "it.interno.anpr.saml.SAML2CallbackHandler");

        interceptor.setProperties(properties);

        return interceptor;
    }

    private void setFactoryBean(JaxWsProxyFactoryBean factoryBean) {
        factoryBean.setDataBinding(jaxbDataBinding());
        factoryBean.getInInterceptors().add(new LoggingInInterceptor());
        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());

//        factoryBean.getOutInterceptors().add(samlRequestInterceptor());

        Map<String, Object> properties = factoryBean.getProperties();
        if(properties == null){
            properties = new HashMap<>();
        }
        properties.put("ws-security.callback-handler", "it.interno.anpr.wss.ClientKeystorePasswordCallback");

        factoryBean.setProperties(properties);
    }
}
