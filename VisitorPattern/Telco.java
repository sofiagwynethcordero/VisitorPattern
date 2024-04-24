package VisitorPattern;

class Telco implements TelcoSubscription {
    private double promoPrice;
    private String telcoName;
    private boolean unliCallText;

    public Telco(double promoPrice, int price, String telcoName, boolean unliCallText) {
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String getTelcoName() {
        return telcoName;
    }

    @Override
    public double getPromoPrice() {
        return promoPrice;
    }

    @Override
    public boolean getUnliCallText() {
        return unliCallText;
    }
}