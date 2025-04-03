package com.example.marketapp;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.marketapp.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements  ItemClickListener{

    //Adapter view
     RecyclerView recyclerView;

     //data source
    List<Item> itemList;

    //adapter
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recyclerView);
        itemList = new ArrayList<>();
        Item item1 = new Item(R.drawable.fruit,"Fruits","Fresh  Fruits");
        Item item2 = new Item(R.drawable.vegitables,"Vege","Fresh  Fege");
        Item item3 = new Item(R.drawable.beverage,"beverage","Fresh  beverage");
        Item item4 = new Item(R.drawable.bread,"bread","Fresh  bread");
        Item item5 = new Item(R.drawable.fruit,"Fruits","Fresh  Fruits");
        Item item6 = new Item(R.drawable.fruit,"Fruits","Fresh  Fruits");
        Item item7 = new Item(R.drawable.fruit,"Fruits","Fresh  Fruits");


        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        myAdapter = new MyAdapter(itemList);
        recyclerView.setAdapter(myAdapter);
        myAdapter.setClickListener(this);

    }

    @Override
    public void onCLick(View v, int adapterPosition) {
        Toast.makeText(this,
                "You choosed" +itemList.get(adapterPosition).getItemName(), Toast.LENGTH_SHORT).show();
    }
}