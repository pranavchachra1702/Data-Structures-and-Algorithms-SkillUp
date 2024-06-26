public class LRUCache extends LinkedHashMap<Integer, Integer>
{
        private final int maxCap;
        
        public LRUCache(int capacity)
        {
            super(capacity, 1.0f, true);
            maxCap = capacity;
        }

        protected boolean removeEldestEntry(Map.Entry eldest) 
        {
            return size() > maxCap;
        }

        public int get(int key) 
        {
            return super.getOrDefault(key, -1);
        }
}
/*class LRUCache 
{
    class Node
    {
        int key;
        int value;

        Node prev;
        Node next;

        Node(int key, int value)
        {
            this.key = key;
            this.value = value;
        }
    }

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    int cap;
    HashMap<Integer, Node> m =new HashMap<>();

    public LRUCache(int capacity) 
    {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) 
    {
        if(m.containsKey(key))
        {
            Node resNode = m.get(key);
            int ans = resNode.value;

            m.remove(key);
            deleteNode(resNode);
            addNode(resNode);

            m.put(key, head.next);
            return ans;
        }

        return -1;
    }
    
    public void put(int key, int value) 
    {
        if(m.containsKey(key))
        {
            Node curr = m.get(key);
            m.remove(key);
            deleteNode(curr);
        }

        if(m.size() == cap)
        {
            m.remove(tail.prev.key);
            deleteNode(tail.prev);
        }

        addNode(new Node(key, value));
        m.put(key, head.next);
    }

    public void addNode(Node newnode)
    {
        Node temp = head.next;

        newnode.next = temp;
        newnode.prev = head;

        head.next = newnode;
        temp.prev = newnode;
    }

    private void deleteNode(Node delnode)
    {
        Node prevv = delnode.prev;
        Node nextt = delnode.next;

        prevv.next = nextt;
        nextt.prev = prevv;
    }
}
*/
    
/**
Refer this also: https://www.geeksforgeeks.org/design-a-data-structure-for-lru-cache/
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
