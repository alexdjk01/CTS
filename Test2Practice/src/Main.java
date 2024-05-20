//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RealEstateSalesman realEstateSalesman = new RealEstateSalesman( new RealEstateShortTerm());
        realEstateSalesman.displayOffers();

        realEstateSalesman.setAgency(new RealEstateLongTerm());
        realEstateSalesman.displayOffers();

        realEstateSalesman.setAgency(new RealEstateSale());
        realEstateSalesman.displayOffers();

        OnlineContract docxContract = new DocxAdapter( new DocxInterpreter());
        OnlineContract jsonContract = new JsonAdapter( new JsonInterpreter());

        System.out.println(docxContract.retrieveContractDetails());
        System.out.println(jsonContract.retrieveContractDetails());

    }
}