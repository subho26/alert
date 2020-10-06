package com.example.currency;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class CurrencyCalculator {
    public Map<String, Integer> getdistinctCurrencyValue(final String currencyValue) throws JSONException {

        Map<String, Integer> map = new HashMap<>();

        JSONArray jsonarray = new JSONArray(currencyValue);
        for (int i = 0; i < jsonarray.length(); i++) {
            JSONObject jsonobject = jsonarray.getJSONObject(i);
            String currency = jsonobject.getString("currency");
            String amount = jsonobject.getString("amount");
            if (map.containsKey(currency)) {
                int totalAmount = map.get(currency);
                totalAmount = totalAmount + Integer.parseInt(amount);
                map.put(currency, totalAmount);
            } else {
                map.put(currency, Integer.valueOf(amount));
            }
        }
        return map;


    }
}
