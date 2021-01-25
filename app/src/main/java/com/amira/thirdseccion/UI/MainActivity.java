package com.amira.thirdseccion.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amira.thirdseccion.R;
import com.amira.thirdseccion.Adapter.catAdapter;
import com.amira.thirdseccion.pojo.cat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements contract {
   RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
     super.onCreate( savedInstanceState );
     setContentView( R.layout.activity_main );

     rv = findViewById( R.id.rv_items );
     presenter p = new presenter( this );
     p.passDataToContract();

     rv.setLayoutManager( new LinearLayoutManager( this  ) );
    }

 @Override
 public void passData(ArrayList<cat>cats) {
  catAdapter catAdapter=new catAdapter(  cats );
  rv.setAdapter( catAdapter );
 }
}
