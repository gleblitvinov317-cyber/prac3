package task1;

public class Cartoteca {
    private Node head;
    private int size = 0;

    public Cartoteca() {
    }
    public void add(Person val){
        Node nd = new Node(val);
        if (size == 0){
            head = nd;
            size++;
        }else{
            nd.setPrev(head);
            head = nd;
            size++;
        }
    }
    public void del(Person val){
        Node nd = new Node(val);
        if (size == 0){
            System.out.println("Список пуст");
        }else if (size == 1){
            if(nd.equals(head)){
                head = null;
                size--;
                System.out.println("Удаление произошло успешно");
            }
        }else{
            Node prev = head;
            Node tek = head.getPrev();
            if(nd.equals(head)){
                head = tek;
                size--;
                System.out.println("Удаление произошло успешно");
            }else{
                while (tek != null){
                    if(tek.equals(nd)){
                        prev.setPrev(tek.getPrev());
                        tek.setPrev(null);
                        size--;
                        System.out.println("Удаление произошло успешно");
                        break;
                    }
                    prev = tek;
                    tek = tek.getPrev();
                }
            }
        }
    }
    public void clear(){
        head = null;
        size = 0;
    }
    public Person find(int id){
        Node tek = head;
        if(id >= size || id < 0){
            throw new IllegalArgumentException("Индекс все списка");
        }
        for (int i = 0; i < id; i++){
            tek = tek.getPrev();
        }
        return tek.getVal();
    }
    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }
    @Override
    public String toString(){
        if(size == 0){
            return "Список пуст";
        }
        StringBuilder sb = new StringBuilder();
        Node nd = head;
        sb.append("{");
        while (nd.getPrev() != null){
            sb.append(nd.getVal());
            sb.append(", ");
            nd = nd.getPrev();
        }
        sb.append(nd.getVal());
        sb.append("}");
        return sb.toString();
    }
}
