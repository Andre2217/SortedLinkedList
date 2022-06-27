
public class LikedListSorted {
	Node first;
	Node last;

	public LikedListSorted() {
		first = null;
		last = null;
	}

	public void Add(int num) {
		Node fresh = new Node(num);

		if (first == null) {
			first = fresh;
			last = fresh;
		} else if (fresh.num < first.num) {
			fresh.next = first;
			first = fresh;
		} else if (fresh.num > last.num) {
			last.next = fresh;
			last = fresh;
		} else {
			Node previous = null;
			Node current = first;

			while (current != null && fresh.num > current.num) {
				previous = current;
				current = current.next;
			}
			previous.next = fresh;
			fresh.next = current;
		}
	}

	public void takeFromEnd() {
		if (first != null) {
			if (first == last) {
				first = null;
				last = null;
			} else {
				Node current = first;

				while (current.next != last) {
					current = current.next;
				}
				last = current;
				last.next = null;
			}
		}
	}

	public void takeFromBeginning() {
		if (first != null) {
			if (first == last) {
				first = null;
				last = null;
			} else {
				first = first.next;
			}
		}
	}

	public void Show() {
		Node current = first;

		while (current != null) {
			System.out.print(current.num + " ");
			current = current.next;
		}
		System.out.println();
	}
}
