public class BST<E extends Comparable<E>> {
    private class Node {
        public E e;
        public Node left, right;

        public Node(E e){
            this.e = e;
            this.left = null;
            this.right = null;
        }

        private Node root;
        private int size;

        public int getSize(){
            return size;
        }

        public boolean isEmpty(){
            return size == 0;
        }

        public void add(E e){
            root = add(root, e);
        }

        private Node add(Node node, E e){
            if(node == null){
                size ++;
                return new Node(e);
            }
            else if(e.compareTo(node.e) < 0){
                node.left = add(node.left, e);
            }else if(e.compareTo(node.e) > 0){
                node.right = add(node.right, e);
            }

            return node;
        }
    }
}
