package com.alex.soap.proxy.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://service.ws.proxy.soap.alex.com/", name = "FixProxy")
public interface FixProxy {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sayHello",
                    targetNamespace = "http://service.ws.proxy.soap.alex.com/",
                    className = "com.alex.soap.proxy.ws.service.SayHello")
    @WebMethod(action = "urn:SayHello")
    @ResponseWrapper(localName = "sayHelloResponse",
                     targetNamespace = "http://service.ws.proxy.soap.alex.com/",
                     className = "com.alex.soap.proxy.ws.service.SayHelloResponse")
    String sayHello(@WebParam(name = "myname", targetNamespace = "") String myname);
}
