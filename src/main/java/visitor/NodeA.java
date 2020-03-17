package visitor;

public class NodeA implements Node{
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "NodeA";
    }
}
