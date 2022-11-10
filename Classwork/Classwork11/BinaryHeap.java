import java.util.ArrayList;


/*
 Now we do the Heap itself, composed of an ArrayList of HeapNodes, using the ArrayList allows us to 
 expand the Heap as we need, still letting us use the HeapNode class as the data items in the Heap Array
 */
public class BinaryHeap{

    private ArrayList<HeapNode> heap;
    private int size;

    BinaryHeap(){
        heap = new ArrayList<HeapNode>();
        size = 0;
    }

    //Traversal helper which does indexing operations we need to use to find things in the heap
    public HeapNode getParent(int index){
        return heap.get((index - 1)/2);
    }

    public HeapNode getChild(int index, char child){
        int result = (index*2)+1;
        //make sure we are case sensitive
        if(Character.toUpperCase(child) == 'R'){
            result++;
        }
        return heap.get(result);
    }

    //This prints the array values and left to the observer to figure which HeapNode is which, in terms of parent/child
    public void print(){
        System.out.println();
        for (int i = 0; i < size; i++){
            System.out.print("[" + heap.get(i).getKey() + "]");
        }
    }

    //ArrayList has a nice add method that makes insertion easy, but we do have to deal with the primitive to Object situation
    public void insert(int value){
        heap.add(new HeapNode(value));
        bubbleUp(size);
        size++;
    }

    //Here is the bubbleUp method, it swaps the parent and child when the child 
    public void bubbleUp(int index){
        if (index == 0){
            return;
        }
        int parentIndex = (index-1)/2;
        if(heap.get(parentIndex).getKey() < heap.get(index).getKey()){
            HeapNode temp = heap.get(index);
            heap.set(index, heap.get(parentIndex));
            heap.set(parentIndex, temp);
            bubbleUp(parentIndex);
        }
    }

    public int getParentIndex(int index){
        return (index-1)/2;
    }

    public int getChildIndex(int index, char child){
        int result = (index * 2)-1;
        if (child == 'R'){
            result++;
        }
        return result;
    }

    public int delete(){
        int val = heap.get(0).getKey();
        HeapNode newRoot = heap.remove(size-1);
        size--;

        heap.set(0, newRoot);

        trickleDown(0);
        return val;

    }


    public void trickleDown(int index){
        int lChildIndex = getChildIndex(index, 'L');
        int rChildIndex = getChildIndex(index, 'R');

        int swapIndex = (lChildIndex > rChildIndex) ? lChildIndex : rChildIndex;

        if (swapIndex >= size){
            return;
        }

        if (heap.get(index).getKey() < heap.get(swapIndex).getKey()){
            HeapNode temp = heap.get(index);
            heap.set(index, heap.get(swapIndex));
            heap.set(swapIndex, temp);
            trickleDown(swapIndex);
        }

    }

    public static void main(String[] args){
        

        BinaryHeap heap = new BinaryHeap();
        heap.insert(2000);
        heap.insert(1000);
        heap.insert(500);
        heap.insert(3000);
        heap.insert(1234);
        heap.insert(2129);
        heap.insert(1800);
        heap.insert(700);
        heap.insert(1350);
        heap.insert(9800);
        heap.insert(1760);
        heap.insert(5280);
        heap.insert(876);
        heap.insert(4500);

        heap.print();
        
        System.out.println();
        System.out.println("Deleting the root: " + heap.delete());
        heap.print();
        
        System.out.println();
        System.out.println("Deleting the root: " + heap.delete());
        heap.print();

        System.out.println();
        System.out.println("Deleting the root: " + heap.delete());
        heap.print();

        System.out.println();
        System.out.println("Deleting the root: " + heap.delete());
        heap.print();

        System.out.println();
        System.out.println("Deleting the root: " + heap.delete());
        heap.print();


    }
}