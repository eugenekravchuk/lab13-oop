package com.example;

public class Main {
    public static void main(String[] args) {
        CompanyInfoFacade facade = new CompanyInfoFacade();
        String companyInfo = facade.getCompanyInformation(1);
        System.out.println(companyInfo);
    }
}
