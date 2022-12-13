package lesson8;

public interface Dynamic {

    void add(int value);

    void addAt(int index, int value);

    int get(int index);

    void remove();

    void removeAt(int index);

    void set(int index, int value);

    boolean contains(int value);

    int size();

    void clear();

    void print();

    void shrinkSize();
}
