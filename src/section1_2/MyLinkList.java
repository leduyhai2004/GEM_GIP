package section1_2;

public class MyLinkList {
    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    public static void printLinkList(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.value);
            current = current.next;
            if (current != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    //thêm phần tử vào đầu LinkList
    public static Node addFirst(Node head, int value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
        }
        return newNode;
    }

    //thêm phần tử vào cuối LinkList
    public static Node addLast(Node node, int value) {
        Node newNode = new Node(value);
        if (node == null) {
            return newNode;
        }
        // Tìm nút cuối cùng của danh sách liên kết
        Node lastNode = node;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        // Gán nút mới vào cuối danh sách liên kết
        lastNode.next = newNode;
        return node;
    }

    //thêm phần tử vào giữa LinkList
    public static Node addMiddle(Node head, int value, int position) {
        if (position == 0) {
            addFirst(head, value);
        }else {
            //tìm vị trí cần thêm
            Node newNode = new Node(value);
            Node current = head;
            int count = 0;
            while (current.next != null) {
                count++;
                if(count == position) {
                //add
                    newNode.next = current.next;
                    current.next = newNode;
                    break;
                }
                current = current.next;
            }
        }

        return head;
    }

    //xóa phần tử đầu tiên khỏi LinkList
    public static Node removeFirst(Node head) {
        if (head == null) {
            return head; // Danh sách rỗng
        }
        return head.next; // Trả về nút tiếp theo của nút đầu tiên
    }
    //xóa phần tử cuối cùng khỏi LinkList
    public static Node removeLast(Node head) {
        if (head == null || head.next == null) {
            return head; // Danh sách rỗng hoặc chỉ có một nút
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next; // Tìm nút trước nút cuối cùng
        }
        current.next = null; // Xóa nút cuối cùng
        return head;
    }

    //xóa phần tử ở giữa LinkList
    public static Node removeMiddle(Node headNode, int index) {
        if(headNode == null || index < 0)
            return null;

        if(index == 0)
            return removeFirst(headNode);

        Node currNode = headNode;
        Node prevNode = null;
        int count = 0;
        boolean bIsFound = false;
        while(currNode != null){
            if(count == index){
                // Remove currNode
                bIsFound = true;
                break;
            }
            prevNode = currNode;
            currNode = currNode.next;
            count++;
        }

        // Remove curr
        if(bIsFound){
            if(prevNode == null){ // Current Node is Last Node
                return null;
            }else{
                if(currNode != null){
                    prevNode.next = currNode.next;
                }
            }
        }

        return headNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;

        printLinkList(n1);

        System.out.println("Thêm phần tử vào đầu danh sách liên kết");
        Node newNode = addFirst(n1, 0);
        printLinkList(newNode);
        System.out.println("Thêm phần tử vào cuối danh sách liên kết");
        Node newNode2 = addLast(newNode, 4);
        printLinkList(newNode2);

        System.out.println("Thêm phần tử vào giữa danh sách liên kết");
        Node newNode3 = addMiddle(newNode2, 5, 2);
        printLinkList(newNode3);
    }
}
