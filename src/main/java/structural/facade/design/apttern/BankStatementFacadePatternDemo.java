package structural.facade.design.apttern;

public class BankStatementFacadePatternDemo {

    public static void main(String[] args) {
        BankStatementGeneratorFacade bankStatementGeneratorFacade = new BankStatementGeneratorFacade();
        BankStatementGeneratorFacade.generateStatement(StatementType.HTML, "testLocation1");
        BankStatementGeneratorFacade.generateStatement(StatementType.PDF, "testLocation2");
    }
}
