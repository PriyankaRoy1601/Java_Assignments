package com.assignment.app;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class BillingSystem {
    private String countryName;
    private String countryLanguage;
    private String customerId;
    private Date billingDate;
    private double amountOutstanding;

    public BillingSystem(String countryName, String customerId, Date billingDate, double amountOutstanding) {
        this.countryName = countryName;
        this.customerId = customerId;
        this.billingDate = billingDate;
        this.amountOutstanding = amountOutstanding;
        
        // Determine country language based on the country name
        this.countryLanguage = getCountryLanguage(countryName);
    }

    public void displayBillingDetails() {
        System.out.println("Country: " + countryName + " (" + countryLanguage + ")");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Billing Date: " + new SimpleDateFormat("yyyy-MM-dd").format(billingDate));

        // Format amount outstanding as currency based on the country
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String formattedAmount = currencyFormatter.format(amountOutstanding);
        System.out.println("Amount Outstanding: " + formattedAmount);
    }

    private String getCountryLanguage(String countryName) {
        switch (countryName) {
            case "US":
                return "English";
            case "Japan":
                return "Japanese";
            default:
                return "Unknown";
        }
    }
    public static void main(String[] args) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            BillingSystem customer1 = new BillingSystem("US", "CUST123", dateFormat.parse("2023-08-15"), 1200.75);
            customer1.displayBillingDetails();

            System.out.println();

            BillingSystem customer2 = new BillingSystem("Japan", "CUST456", dateFormat.parse("2023-08-20"), 98000.0);
            customer2.displayBillingDetails();
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }}








