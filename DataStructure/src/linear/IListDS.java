package linear;

/*
 *Author:ZouHeng
 *Des:线性表
 *Date:2019-08-13 11:31
 */
public interface IListDS<T>
{
    int getLength();            //求长度
    void clear();               //清空操作
    boolean isEmpty();          //判断线性表是否为空
    void append(T item);        //附加操作
    void insert(T item,int i);  //插入操作
    T delete(int i);            //删除
    T getElem(int i);           //根据索引获取表中元素
    int locate(T value);        //按值查找
}
