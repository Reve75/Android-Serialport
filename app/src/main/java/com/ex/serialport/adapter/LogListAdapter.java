package com.ex.serialport.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.ex.serialport.R;

import java.util.List;


/**
 * Author
 * Created Time 2017/12/14. http://docs.fitfithealth.com.cn/app-debug.apk
 */
public class LogListAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public LogListAdapter(List list) {
        super(R.layout.item_layout, list);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

        helper.setText(R.id.textView, item);

    }

    /**
     * 清空
     */
    public void clean() {
        this.getData().clear();
        notifyDataSetChanged();
    }

}
