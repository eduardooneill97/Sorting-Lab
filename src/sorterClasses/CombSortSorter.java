package sorterClasses;

public class CombSortSorter<E> extends AbstractSorter<E>{

	//Worst Case: O(n*n)
	
	public CombSortSorter(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void auxSort() {
		int gap = arr.length;
		double shrink = 1.3;
		boolean sorted = false;
		
		while(!sorted) {
			gap = (int) (gap/shrink);
			if(gap>1)
				sorted = false;
			else {
				gap = 1;
				sorted = true;
			}
			
			for(int i = 0; i + gap<arr.length; i++) {
				if(cmp.compare(arr[i], arr[i+gap])>0) {
					super.swapArrayElements(i, i+gap);
					sorted = false;
				}
			}
		}
		
	}

}
