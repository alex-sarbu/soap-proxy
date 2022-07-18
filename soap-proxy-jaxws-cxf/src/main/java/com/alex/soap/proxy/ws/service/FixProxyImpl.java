package com.alex.soap.proxy.ws.service;

import java.util.logging.Logger;

@javax.jws.WebService(serviceName = "FixProxyService", portName = "FixProxyPort",
                    targetNamespace = "http://service.ws.proxy.soap.alex.com/",
                    endpointInterface = "com.alex.soap.proxy.ws.service.FixProxy")
public class FixProxyImpl implements FixProxy {

    private static final Logger LOG = Logger.getLogger(FixProxyImpl.class.getName());

    public java.lang.String sayHello(java.lang.String myname) {
        LOG.info("Executing operation sayHello" + myname);
        try {
            return "Hello, Welcome to CXF Spring boot " + myname + "!!!";

        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
