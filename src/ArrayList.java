import java.util.ListIterator;

public class ArrayList {

    private Object[] elementData = new Object[100];
    private int size = 0;

    public boolean addLast(Object element){
        elementData[size++] = element;
        return true;
    }
    public boolean add(int index, Object element){
        for (int i = size; i > index; i--){
            elementData[i] = elementData[i-1];
        }
        elementData[index] = element;
        size++;
        return true;
    }
    public boolean addFirst(Object element){

        return add(0,element);
    }
    public String toString(){
        String str = "[";

        for(int i = 0; i < size; i++){
            str += elementData[i];
            if(i != size-1)
                str += ",";
        }
        return str + "]";
    }
    public Object remove(int index){
        Object removed = elementData[index];

        for(int i = index; i < size; i++) {
            elementData[i] = elementData[i + 1];
        }
        elementData[--size] = null;

        return removed;
    }
    public Object removeFirst(){
        return remove(0);
    }
    public Object removeLast(){
        return remove(size-1);
    }
    public Object get(int index){
        return elementData[index];
    }
    public int size(){
        return size;
    }
    public int indexOf(Object o){
        for(int i = 0; i < size; i++){
            if(o.equals(elementData[i]))
                return i;
        }
        return -1;
    }
    public ListIterator listIterator(){
        return new ListIterator();
    }

    class ListIterator{

        private int nextIndex = 0;

        public Object next(){
            return elementData[nextIndex++];
        }

        public boolean hasNext(){
//            if(nextIndex == size){
//                return false;
//            }
//            return true;
            return nextIndex < size();
        }
        public boolean hasPrevious(){

            return nextIndex > 0;
        }
        public Object previous(){

            return elementData[--nextIndex];
        }
        public void add(Object element){
            ArrayList.this.add(nextIndex++,element);
        }
        public void remove(){
            ArrayList.this.remove(--nextIndex);

        }

    }
}
