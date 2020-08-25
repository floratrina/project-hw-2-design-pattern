package structural.facade.design.apttern;

/*
  Facade Design Pattern is a category of Structural pattern.

  The Facade pattern is appropriate when we have a complex system that we want to expose to clients
  in a simplified way.

  Please implement Facade Design Pattern.

  To design this pattern, whatever number of classes needed, please feel free to
  implement those.

 */


public class BankStatement {

    private StatementHeader statementHeader;
    private StatementBody statementBody;
    private StatementFooter statementFooter;


    public BankStatement() {

    }

    public void setStatementBody(StatementBody bankStatementBody) {
        this.statementBody = bankStatementBody;
    }

    public StatementHeader getHeader() {
        return this.statementHeader;
    }

    public void setHeader(StatementHeader statementHeader) {
        this.statementHeader = statementHeader;
    }

    public StatementFooter getFooter() {
        return this.statementFooter;
    }

    public StatementBody getBody() {
        return this.statementBody;
    }

    public void setFooter(StatementFooter statementFooter) {
        this.statementFooter = statementFooter;
    }
}
