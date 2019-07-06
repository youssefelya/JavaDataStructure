import java.util.ArrayList;

public class MaxHeap {
   private int[] theHeap;
	private int capacity;
	private ArrayList<Integer> list=new ArrayList<Integer>();
	private int pos;
	public MaxHeap() {
		pos=1; capacity=10;
		theHeap=new int[capacity]; 	}
	
	public void insert(int value) {
	if(pos==capacity) { }
	else theHeap[pos++]=value;
	list.add(value);
	int child =pos-1;
	int parent =child/2;
	while(theHeap[parent]<theHeap[child]&&parent>0) {
		int tmp=theHeap[parent];
		theHeap[parent]=theHeap[child];
		theHeap[child]=tmp; 	
		child=parent; 
		parent=child/2;
	}
	}
	public void print() {
		for(int i=1;i<pos;i++) {
			System.out.print(theHeap[i]+" ");
		}
	}	
	
	
	public static void main(String[] args) {
		MaxHeap max=new MaxHeap();
		max.insert(12); max.insert(7);
		max.insert(8); max.insert(10);
		max.insert(20); max.insert(6);
		max.print();
		

	}

}