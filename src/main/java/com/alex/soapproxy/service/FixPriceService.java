package com.alex.soapproxy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.alex.soapproxy.mock.MockFixPrices;

import de.piratecat.alex.code.fx.GetFixPriceRequest;
import de.piratecat.alex.code.fx.GetFixPriceResponse;

@Endpoint
public class FixPriceService {
    private static final String NAMESPACE_URI = "http://fx.code.alex.piratecat.de/";

    private MockFixPrices mockFixPrices;
    
	@Autowired
	public FixPriceService(MockFixPrices mockFixPrices) {
		this.mockFixPrices = mockFixPrices;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getFixPriceRequest")
	@ResponsePayload
	public GetFixPriceResponse getFixPrice(@RequestPayload GetFixPriceRequest request) {
        System.out.print("AAAAAA");
		GetFixPriceResponse response = new GetFixPriceResponse();
        System.out.print("BBBBBB");
		response.setQuoteObject(mockFixPrices.getQuote(request.getArg0()));

        System.out.print("CCCCCC");

		return response;
	}

}