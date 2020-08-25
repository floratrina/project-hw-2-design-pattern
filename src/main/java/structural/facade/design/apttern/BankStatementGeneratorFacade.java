package structural.facade.design.apttern;

public class BankStatementGeneratorFacade {

    public static void generateStatement(StatementType type, String location){

        if(type==null){
            System.out.println("Null exception");
        }

        BankStatement statement = new BankStatement();
        statement.setStatementBody(new StatementBody());
        statement.setHeader(new StatementHeader());
        statement.setFooter(new StatementFooter());

        StatementWriter statementWriter = new StatementWriter();

        switch(type) {
            case HTML:
                statementWriter.writeHtmlStatement(statement, location);
                break;
            case PDF:
                statementWriter.writePdfStatement(statement, location);
                break;
        }

    }
}
