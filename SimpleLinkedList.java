package pucese.com.listas;
public class SimpleLinkedList<E> {
	// generar una clase interna 
	public static class Node<E>{
		private E element;
		private Node<E> next;
		public Node(E e, Node<E> n) {
			element=e;
			next=n;
		}

		public E getElement() {
			return element;
		}

		public void setElement(E element) {
			this.element = element;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}
	}// fin de la clase Node
	private Node<E> head=null;
	private Node<E> tail=null;
	private int size=0;// dinamica no sabemos cuando termina
	//private SimpleLinkedList() {
		
	//}
	//metodo para el tamaño
	public int size() {
		return size;
	}//si esta vacia
	public boolean isEmpty() {
		return size==0;
	}
	public E first() {
		if(isEmpty()) return null; 
		
			return head.getElement();
		
			
		}
		public E last() {
			if(isEmpty()) return null; 
				return tail.getElement();
			
				
			}
		public void addFirst(E e) {
			head= new Node<>(e,head);
			if (size==0)
				tail=head;
			size++;
	}
		public void addLast(E e) {
			Node<E> newest=new Node<>(e,null);
			if(isEmpty())
				head=newest;
			else {
				tail.setNext(newest);
				tail=newest;			
			}
			size++;
			
		}
		public E removefirst() {
			if (isEmpty()) return null;
			E e1=head.getElement();
			head =head.getNext();
			size--;
			if(size==0)
				tail=null;
			return e1;
			}
		public void getAll() {
			Node<E> tmp=head;
			while(tmp!=null) {
				System.out.println(tmp.getElement().toString());
				tmp=tmp.getNext();
			}
		}
		
}
