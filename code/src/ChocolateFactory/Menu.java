package ChocolateFactory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 菜单类
 *
 * @function 该类是一个[模板类]，可供动物/植物/工具使用
 * @pattern Iterator模式
 */
public class Menu<T> implements Iterable<T>, Serializable
{
    private List<T> menu;

    /**
     * 构造函数
     */
    public Menu()
    {
        this.menu = new ArrayList<>();
    }

    /**
     * 向菜单中加入一个项目
     *
     * @param item 加入的项目
     */
    public void add(T item)
    {
        for (T t : menu)
        {
            if (t.equals(item))
            {
                return;
            }
        }
        menu.add(item);
    }

    /**
     * 从菜单中移除一个项目
     *
     * @param item 移除的项目
     */
    public void erase(T item)
    {
        menu.remove(item);
    }

    /**
     * 向外提供的迭代器接口
     * 用户可以通过这个函数遍历菜单项
     *
     * @return 迭代器
     */
    @Override
    public Iterator<T> iterator()
    {
        return new MenuIterator(this);
    }

    public int getSize()
    {
        return menu.size();
    }

    /**
     * 迭代器类，实现迭代器模式，供对应的Menu类调用
     */
    class MenuIterator implements Iterator<T>
    {
        private int index = 0;
        private final List<T> items;

        MenuIterator(Menu<T> menu)
        {
            index = 0;
            items = menu.menu;
        }

        /**
         * 是否有下一个对象
         * 重载Iterator<T>实现的方法
         *
         * @return 迭代器是否有下一个
         */
        @Override
        public boolean hasNext()
        {
            return index < menu.size();
        }

        /**
         * 获取下一个对象
         * 重载Iterator<T>实现的方法
         *
         * @return 迭代器的下一个对象
         */
        @Override
        public T next()
        {
            assert index < menu.size();
            return items.get(index++);
        }

        /**
         * 移除
         * 重载Iterator<T>实现的方法
         */
        @Override
        public void remove()
        {
            System.out.print("UnSupported Op");
        }
    }
}
