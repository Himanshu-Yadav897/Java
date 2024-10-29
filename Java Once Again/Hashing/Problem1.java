import java.util.*;

public class Problem1 {

    static class HashMap<k, v> {
        private class Node {
            k key;
            v value;

            public Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> bucket[];

        @SuppressWarnings("unchecked")
        HashMap(k key, v value) {
            this.n = 0;
            this.N = 4;
            this.bucket = new LinkedList[4];
            for (int i = 0; i < N; i++) {
                this.bucket[i] = new LinkedList<>();
            }
        }

        private int hashFunction(k key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        public int SearchInLL(k key, int bi) {
            LinkedList<Node> ll = bucket[bi];
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (key == node.key) {
                    return di;
                }
                di++;
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        public void ReHash() {
            LinkedList<Node> oldBuck[] = bucket;
            bucket = new LinkedList[2 * N];
            N = 2 * N;

            for (int i = 0; i < N; i++) {
                bucket[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(i);
                    put(node.key, node.value);
                }
            }

        }

        public void put(k key, v value) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) {
                Node node = bucket[bi].get(di);
                node.value = value;
            } else {
                bucket[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                ReHash();
            }

        }

        public boolean containsKey(k key){
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di != -1){
                return true;
            }
            else{
                return false;
            }
        }

        public v remove(k key){
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di != -1){
                Node node = bucket[bi].remove(di);
                n--;
                return node.value;
            }else{
                return null;
            }
        }

        public v get(k key){
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di != -1){
                Node node = bucket[bi].get(di);
                return node.value;
            }else{
                return null;
            }
        }

        public ArrayList<k> keySet(k key){
            ArrayList<k>  arr = new ArrayList<>();
            for(int i = 0; i<N; i++){
                LinkedList<Node> node = bucket[i];
                for (Node node2 : node) {
                    arr.add(node2.key);
                }
            } 

            return arr;
        }
    }

    public static void main(String[] args) {

    }
}
