package visitor;

public class VisitorA implements Visitor {
    public void visit(NodeA nodeA) {
        String operationObject = nodeA.operationA();
        System.out.println("具体访问者visitorA处理具体功能的节点对象："+operationObject);
    }

    public void visit(NodeB nodeB) {
        String operationObject = nodeB.operationB();
        System.out.println("具体访问者visitorA处理具体功能的节点对象："+operationObject);
    }
}
