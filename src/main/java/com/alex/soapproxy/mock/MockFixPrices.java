package com.alex.soapproxy.mock;

import javax.annotation.PostConstruct;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

//import io.spring.guides.gs_producing_web_service.Country;
//import io.spring.guides.gs_producing_web_service.Currency;
import de.piratecat.alex.code.fx.Quote;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class MockFixPrices {
	private static final String DEFAULT_QUOTE = "test1";
	private static final Map<String, Quote> fixPrices = new HashMap<>();

	@PostConstruct
	public void initData() {
		Quote quote1 = new Quote();
		quote1.setQuoteId(DEFAULT_QUOTE);
		quote1.setFirstCalculatedAmount(new BigDecimal(132.1));
		quote1.setFirstExchangeRate(new BigDecimal(12.1));
		quote1.setSecondCalculatedAmount(new BigDecimal(132.2));
		quote1.setSecondExchangeRate(new BigDecimal(12.2));
		quote1.setRequestAmount(new BigDecimal(10));
		quote1.setSymbol("TST1");

		fixPrices.put(quote1.getQuoteId(), quote1);
	}

	public Quote getQuote(String arg0) {
		Assert.notNull(arg0, "arg0 must not be null");
		return fixPrices.get(DEFAULT_QUOTE);
	}
}