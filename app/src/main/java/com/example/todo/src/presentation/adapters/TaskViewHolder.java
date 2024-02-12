package com.example.todo.src.presentation.adapters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todo.R;

class TaskViewHolder extends RecyclerView.ViewHolder{
   TextView title;
   TextView desc;
   TextView id;

   CardView todoItem;
    public TaskViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.tv_task_title);
        desc = itemView.findViewById(R.id.tv_task_description);
        id = itemView.findViewById(R.id.tv_id);
        todoItem = itemView.findViewById(R.id.todo_item);
    }
}
