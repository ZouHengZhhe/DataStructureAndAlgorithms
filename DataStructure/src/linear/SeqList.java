package linear;

/*
 *Author:ZouHeng
 *Des:顺序表
 *Date:2019-08-13 11:43
 */
public class SeqList<T> implements IListDS<T>
{
    private int maxsize;
    private T[] data;
    private int last;



    @Override
    public int getLength()
    {
        return 0;
    }

    @Override
    public void clear()
    {

    }

    @Override
    public boolean isEmpty()
    {
        return false;
    }

    @Override
    public void append(T item)
    {

    }

    @Override
    public void insert(T item, int i)
    {

    }

    @Override
    public T delete(int i)
    {
        return null;
    }

    @Override
    public T getElem(int i)
    {
        return null;
    }

    @Override
    public int locate(T value)
    {
        return 0;
    }
}
