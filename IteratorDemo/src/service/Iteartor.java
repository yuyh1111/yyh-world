package service;

public interface Iteartor {

    /**
     * 判断是否存在下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     * @return
     */
    Object next();
}
