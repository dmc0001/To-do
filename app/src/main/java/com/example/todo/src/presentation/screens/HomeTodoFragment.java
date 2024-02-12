package com.example.todo.src.presentation.screens;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.todo.R;
import com.example.todo.src.models.Todo;
import com.example.todo.src.presentation.adapters.ClickListener;
import com.example.todo.src.presentation.adapters.TodoAdapter;
import java.util.ArrayList;
import java.util.List;

public class HomeTodoFragment extends Fragment implements ClickListener {


    private TodoAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home_todo, container, false);

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_todo, container, false);

        RecyclerView rvTasks = view.findViewById(R.id.rv_todos);
        rvTasks.setLayoutManager(new LinearLayoutManager(requireContext()));

        // Fetch todos from a more reliable source (network/database)
        // or generate them dynamically based on user actions
        List<Todo> todos = fetchTasks(); // Implement this method

        // Initialize and set the adapter
        adapter = new TodoAdapter(requireContext(), todos,this
        );
        rvTasks.setAdapter(adapter);

        return view;
    }


    private List<Todo> fetchTasks() {
        // Replace this with your logic to fetch or generate tasks
        List<Todo> todos = new ArrayList<>();
        // Add more realistic task descriptions and potentially completion status
        todos.add(new Todo(1, "Visit Grandma", "Check on her and bring some flowers."));
        todos.add(new Todo(2, "Take Grandpa for a ride", "Go to his favorite park for some fresh air."));
        todos.add(new Todo(3, "Go to the gym", "Focus on cardio and weight training."));
        return todos;
    }

    @Override
    public void onItemClicked(Todo todo) {
        Toast.makeText(requireContext(),"Clicked",Toast.LENGTH_LONG).show();
        Navigation.findNavController(getView()).navigate(R.id.action_homeTodoFragment_to_detailsTodoFragment);

    }
}