package Link;

class LinkListApp {
	public static void main(String[] args) {
		LinkList theList = new LinkList();  // make list

		theList.insertFirst(22);      // insert 4 items
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.insertFirst(88);

		theList.displayList();              // display list

		Link f = theList.find(44);          // find item
		if( f != null)
			System.out.println("Found link with key " + f.iData);
		else
			System.out.println("Can't find link");

		Link d = theList.delete(66);        // delete item
		if( d != null )
			System.out.println("Deleted link with key " + d.iData);
		else
			System.out.println("Can't delete link");
			
		theList.displayList();              // display list
	}  // end main()
}  // end class LinkListApp
