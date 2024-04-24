package VisitorPattern;


import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo {
    private Map<String, String> dataAllowance;

    public TelcoAllowance() {
        dataAllowance = new HashMap<>();
        dataAllowance.put("Smart", "15 GB for ₱500.00");
        dataAllowance.put("Globe", "10 GB for ₱450.00");
        dataAllowance.put("Ditto", "8 GB for ₱400.00");
    }

    @Override
    public String showAllowance(String telcoName, double price) {
        return dataAllowance.getOrDefault(telcoName, "No data allowance details found for " + telcoName);
    }
}
