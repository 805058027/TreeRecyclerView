package com.baozi.demo.viewholder.shopcart;

import com.baozi.demo.R;
import com.baozi.treerecyclerview.adpater.ViewHolder;
import com.baozi.treerecyclerview.view.BaseItem;
import com.baozi.treerecyclerview.view.TreeItemGroup;
import com.baozi.treerecyclerview.helper.ItemHelper;

import java.util.List;

/**
 * Created by baozi on 2016/12/22.
 */

public class TitletTreeItemParent extends TreeItemGroup<StoreBean> {


    @Override
    protected List<? extends BaseItem> initChildsList(StoreBean data) {
        return ItemHelper.createTreeItemList(data.getShopListBeen(), ContentItem.class, this);
    }

    @Override
    protected int initLayoutId() {
        return R.layout.item_shopcart_title;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder) {
        holder.setChecked(R.id.cb_ischeck, getData().isCheck());
    }

    @Override
    public void onClick(ViewHolder viewHolder, int position) {
        boolean b = getData().isCheck();
        getData().setCheck(!b);
        viewHolder.setChecked(R.id.cb_ischeck, !b);
//        for (int i = 0; i < getChildsCount(); i++) {
//            getChilds().get(i).onClick(viewHolder, position);
//        }
    }


    @Override
    public boolean canExpandOrCollapse() {
        return false;
    }
}
