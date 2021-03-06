package com.henley.smartadapter.delegate;

import androidx.annotation.NonNull;

/**
 * 适配器的代理相关方法接口
 *
 * @param <DataType> 数据类型的泛型
 * @author Henley
 * @date 2017/8/2 11:52
 */
public interface IAdapterDelegate<DataType> {

    /**
     * 添加{@link ItemViewDelegate}
     *
     * @param delegate {@link ItemViewDelegate}对象
     */
    void addItemViewDelegate(@NonNull ItemViewDelegate<DataType> delegate);

    /**
     * 添加{@link ItemViewDelegate}
     *
     * @param viewType ItemView的类型
     * @param delegate {@link ItemViewDelegate}对象
     */
    void addItemViewDelegate(int viewType, @NonNull ItemViewDelegate<DataType> delegate);

    /**
     * 删除{@link ItemViewDelegate}
     *
     * @param itemType ItemView的类型(SparseArrayCompat的Key)
     */
    ItemViewDelegateManager<DataType> removeDelegate(int itemType);

    /**
     * 删除{@link ItemViewDelegate}
     *
     * @param delegate {@link ItemViewDelegate}对象(SparseArrayCompat的Value)
     */
    ItemViewDelegateManager<DataType> removeDelegate(@NonNull ItemViewDelegate<DataType> delegate);

    /**
     * 是否使用{@link ItemViewDelegateManager}(即{@link ItemViewDelegate}的数量是否大于0)
     */
    boolean useItemViewDelegateManager();
}
