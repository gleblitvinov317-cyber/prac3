package task1;

import java.util.Objects;

public class Node {
    private Node prev;
    private Person val;

    public Node() {
    }

    public Node(Person val) {
        this.val = val;
    }

    public Node getPrev() {
        return prev;
    }

    public Person getVal() {
        return val;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setVal(Person val) {
        this.val = val;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Node)) return false;
        Node nd = (Node) o;
        return getVal().equals(nd.getVal());
    }
    @Override
    public int hashCode(){
        return Objects.hash(prev, val.hashCode());
    }
}
