public class Node{
    Object element;
    Node next;
    int visit = 0;
    Node parent = null;
    int lvl = -1;

    public Node(Object elem, Node n){
        element = elem;
        next = n;
    }

    //add method for adjecency List
    public void add(Object element){
        Node n = this;
        if(n.next == null) n.next = new Node(element, null);
        else{
            for(; n.next!= null; n=n.next); //finding last Node
            n.next = new Node(element, null);
        }
    }
}