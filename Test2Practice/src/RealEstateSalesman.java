public class RealEstateSalesman {
    private RealEstateAgency realEstateAgency;

    public RealEstateSalesman(RealEstateAgency realEstateAgency)
    {
        this.realEstateAgency =realEstateAgency;
    }

    public void setAgency(RealEstateAgency realEstateAgency)
    {
        this.realEstateAgency =realEstateAgency;
    }

    public void displayOffers()
    {
        this.realEstateAgency.showApartmentsList();
    }

}
