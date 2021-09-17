package com.sm.witherquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.json.JSONException;
import org.json.JSONObject;

    public class PaymentsUtil extends AppCompatActivity {

    private static JSONObject getBaseRequest() throws JSONException {
        return new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
    }

        private static JSONObject getGatewayTokenizationSpecification() throws JSONException {
            return new JSONObject() {{
                put("type", "PAYMENT_GATEWAY");
                put("parameters", new JSONObject() {{
                    put("gateway", "example");
                    put("gatewayMerchantId", "BCR2DN6TT7MPHFCN");
                }});
            }};
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments_util);

    }
}