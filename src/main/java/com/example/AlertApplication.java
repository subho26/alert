package com.example;

import com.example.currency.CurrencyCalculator;
import org.json.JSONException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlertApplication {

	public static void main(String[] args) throws JSONException {
		SpringApplication.run(AlertApplication.class, args);
		String str = "[{\"currency\":\"USD\",\"amount\":\"10\"},{\"currency\":\"USD\",\"amount\":\"20\"},{\"currency\":\"USD\",\"amount\":\"30\"},{\"currency\":\"EUR\",\"amount\":\"10\"},{\"currency\":\"INR\",\"amount\":\"10\"},{\"currency\":\"EUR\",\"amount\":\"10\"},{\"currency\":\"INR\",\"amount\":\"60\"},{\"currency\":\"EUR\",\"amount\":\"20\"}]";

		System.out.println(new CurrencyCalculator().getdistinctCurrencyValue(str));
		/*try {
			System.out.println(new CurrencyCalculator().getdistinctCurrencyValue(str));
		} catch (ParseException e) {
			e.printStackTrace();
		}*/
	}

}
