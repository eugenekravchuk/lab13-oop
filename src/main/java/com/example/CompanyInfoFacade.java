package com.example;

public class CompanyInfoFacade {
    private CompanyDatabase database;
    private CompanyAPI api;
    private CompanyFileReader fileReader;

    public CompanyInfoFacade() {
        this.database = new CompanyDatabase();
        this.api = new CompanyAPI();
        this.fileReader = new CompanyFileReader();
    }

    public String getCompanyInformation(int companyId) {
        String name = database.getCompanyNameById(companyId);
        String ceo = database.getCompanyCEOById(companyId);
        String marketValue = api.fetchMarketValue(name);
        String employeeCount = fileReader.getEmployeeCount(companyId);

        return String.format("Company: %s\nCEO: %s\nMarket Value: %s\nEmployees: %s",
                             name, ceo, marketValue, employeeCount);
    }
}

