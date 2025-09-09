class Invoice {
    private final String id;
    private final String customerEmail;
    private final double total;
    public Invoice(String id, String customerEmail, double total) {
        this.id = id; this.customerEmail = customerEmail; this.total = total;
    }
    public String getId() { return id; }
    public String getCustomerEmail() { return customerEmail; }
    public double getTotal() { return total; }
}


