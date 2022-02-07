package LadyList;

public class LadyListCreation {
    public int size;
    private int length;
    private String[] lists;

    public LadyListCreation(int length) {
        lists = new String[length];
    }

    public int getLength() {
        return lists.length;
    }

    public int getSize() {
        return size;
    }

    public String[] getLists() {
        return lists;
    }

    public void add(String element) {
        if (isFull()){
            addListElementToNewList();
        }
        for (int index = 0; index < lists.length; index++) {
            if (lists[index] == null) {
                lists[index] = element;
                size++;
                break;
            }
        }
    }

    private boolean isFull() {
        return size == lists.length;
    }

    public void addListElementToNewList() {
        String[] newLists = new String[lists.length* 2];
        for (int index = 0; index < lists.length; index++) {
            newLists[index] = lists[index];
        }
        lists = newLists;
    }
    public void add(int index,String element) {
       if (isFull()){
           addListElementToNewList();
       }
        lists[index] = element;
        size++;
    }
    public void remove(String element) {
        for (int index = 0; index < lists.length; index++) {
            if (lists[index] == element) {
                lists[index] = null;
                size--;
                for (int newIndex = index; index < lists.length-1; index++) {
                        lists[index] = lists[index + 1];
                        lists[index + 1] = null;
                }
            }
        }
    }
    public void remove(int index) {
                lists[index] = null;
                size--;
                }
            }