package visitor;

public class NodeB implements Node{
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "nodeB";
    }
}
