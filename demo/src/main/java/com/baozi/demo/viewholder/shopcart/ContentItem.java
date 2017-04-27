package com.baozi.demo.viewholder.shopcart;

import com.baozi.demo.R;
import com.baozi.treerecyclerview.adpater.ViewHolder;
import com.baozi.treerecyclerview.view.BaseItem;
import com.baozi.treerecyclerview.view.TreeItem;

/**
 * Created by baozi on 2016/12/22.
 */

public class ContentItem extends TreeItem<ShopListBean> {

    @Override
    protected int initLayoutId() {
        return R.layout.item_shopcart_content;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder) {
        viewHolder.setChecked(R.id.cb_ischeck, getData().isCheck());
    }

    @Override
    public void onClick(ViewHolder viewHolder, int position) {
        getData().setCheck(!getData().isCheck());
        viewHolder.setChecked(R.id.cb_ischeck, getData().isCheck());
    }
}
