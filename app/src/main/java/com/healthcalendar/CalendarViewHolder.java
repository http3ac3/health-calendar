package com.healthcalendar;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CalendarViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private final CalendarAdapter.OnItemListener onItemListener;
    public final TextView dayOfMonth;
    public CalendarViewHolder(CalendarAdapter.OnItemListener onItemListener, @NonNull View itemView) {
        super(itemView);
        dayOfMonth = itemView.findViewById(R.id.cellDateText);
        this.onItemListener = onItemListener;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        onItemListener.onItemClick(getAdapterPosition(), (String) dayOfMonth.getText());
    }
}
