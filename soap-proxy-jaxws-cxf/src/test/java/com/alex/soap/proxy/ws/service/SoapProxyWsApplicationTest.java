package com.alex.soap.proxy.ws.service;


import java.io.StringReader;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.system.OutputCaptureRule;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ws.client.core.WebServiceTemplate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

//import com.alex.soap.proxy.ws.SoapProxyWsApplication;

// not working due to the following error:
// Caused by: java.lang.UnsupportedClassVersionError: com/alex/soap/proxy/ws/service/SayHello has been compiled by a more recent version of the Java Runtime (class file version 61.0), this version of the Java Runtime only recognizes class file versions up to 52.0
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = SoapProxyWsApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class SoapProxyWsApplicationTest {
/* 
    //CHECKSTYLE:OFF
    @Rule
    public OutputCaptureRule output = new OutputCaptureRule(); // SUPPRESS CHECKSTYLE
    //CHECKSTYLE:ON

    private WebServiceTemplate webServiceTemplate = new WebServiceTemplate();

    @LocalServerPort
    private int port;

    @Before
    public void setUp() {
        this.webServiceTemplate.setDefaultUri("http://localhost:" + this.port + "/service/fix");
    }

    @Test
    public void testHelloRequest() {
        // final String request =
        // "<q0:sayHello xmlns:q0=\"http://service.ws.proxy.soap.alex.com/\">Alex</q0:sayHello>";
        String request = "<q0:sayHello xmlns:q0=\"http://service.ws.proxy.soap.alex.com/\"><myname>Alex</myname></q0:sayHello>";

        StreamSource source = new StreamSource(new StringReader(request));
        StreamResult result = new StreamResult(System.out);

        this.webServiceTemplate.sendSourceAndReceiveToResult(source, result);
        assertThat(this.output.toString(),
                   containsString("<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                                  + "<ns2:sayHelloResponse xmlns:ns2=\"http://service.ws.proxy.soap.alex.com/\">"
                                  + "<return>Hello, Welcome to CXF Spring boot Alex!!!</return>"
                                  + "</ns2:sayHelloResponse>"));
    }
*/
}
