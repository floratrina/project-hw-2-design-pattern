package structural.facade.design.apttern;

public class StatementWriter {

    public void writeHtmlStatement(BankStatement bankStatement, String location) {
        System.out.println("This is the HTML version");
        bankStatement.getHeader().getStatementHeader();
        bankStatement.getFooter().getStatementFooter();
        bankStatement.getBody().getStatementBody();
        System.out.println("------------------------------------");
    }

    public void writePdfStatement(BankStatement bankStatement, String location) {
        System.out.println("This is the PDF version");
        bankStatement.getHeader().getStatementHeader();
        bankStatement.getFooter().getStatementFooter();
        bankStatement.getBody().getStatementBody();
        System.out.println("------------------------------------");
    }
}
