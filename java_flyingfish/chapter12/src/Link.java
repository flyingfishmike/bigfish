public class Link {
    Node header;
    int size = 0;
    public void add(Object aa){
        if (header == null){
            header = new Node(aa ,null);
        }
        else {
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(aa,null);
        }
        size++;
    }

    private Node findLast(Node node) {
        if (node.next == null) {
            return node;
        }
        return findLast(node.next);
    }

    public void remove(Object aa){}
    public void modify(Object aa){}
    public int find(Object aa){
        return 1;
    }
}
