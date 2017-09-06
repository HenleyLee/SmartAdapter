package com.liyunlong.smartadapter.demo.delegate;

import com.liyunlong.smartadapter.common.ViewHolder;
import com.liyunlong.smartadapter.delegate.ItemViewDelegate;
import com.liyunlong.smartadapter.demo.ChatMessage;
import com.liyunlong.smartadapter.demo.R;

/**
 * @author liyunlong
 * @date 2017/8/2 14:28
 */
public class MessageCommonItemDelagate implements ItemViewDelegate<ChatMessage> {

    @Override
    public int getItemLayoutID() {
        return R.layout.item_chat_msg_common;
    }

    @Override
    public boolean isForViewType(ChatMessage data, int position) {
        return true;
    }

    @Override
    public void convert(ViewHolder holder, ChatMessage data, int position) {
        holder.setText(R.id.chat_common_content, data.getContent());
        holder.setText(R.id.chat_common_name, data.getName());
        holder.setImageResource(R.id.chat_common_icon, data.getIcon());
    }
}
