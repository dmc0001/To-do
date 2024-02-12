package com.example.todo.src.presentation.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todo.R;
import com.example.todo.src.models.Todo;

import java.util.List;


public class TodoAdapter extends RecyclerView.Adapter<TaskViewHolder> {
    private Context context;
    private List<Todo> todos;
    private ClickListener listener;

    public TodoAdapter(Context context, List<Todo> tasks, ClickListener listener) {
        this.context = context;
        this.todos = tasks;
        this.listener = listener;


    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TaskViewHolder(LayoutInflater.from(context).inflate(R.layout.todo_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        holder.title.setText(todos.get(position).getTitle());
        holder.desc.setText(todos.get(position).getDesc());
        holder.id.setText(String.valueOf(todos.get(position).getId()));
        holder.todoItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClicked(todos.get(position));
            }
        });

    }
    /*@Override
    public void onClick(View v) {
        if (listener != null) {
            int position = getAdapterPosition();
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position);
            }
        }
    }*/


    @Override
    public int getItemCount() {
        return todos.size();
    }
}
