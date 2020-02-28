package com.example.persona2;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;




import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new MoviesAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        Movie movie = new Movie("Rp. 500,000", "Bayar Kos (10/1/20) ", "Pengeluaran");
        movieList.add(movie);

        movie = new Movie("Rp. 3.000,000", "Bayar Utang (18/1/20) ", "Pengeluaran");
        movieList.add(movie);

        movie = new Movie("Rp. 47.000,000", "Gaji (05/1/20) ", "Pendapatan");
        movieList.add(movie);

        movie = new Movie("Rp. 120,000", "Uang Makan (13/1/20) ", "Pengeluaran");
        movieList.add(movie);


        movie = new Movie("Rp. 3.000,000", "Bayar Utang (18/1/20) ", "Pengeluaran");
        movieList.add(movie);
        movie = new Movie("Rp. 47.000,000", "Gaji (05/1/20) ", "Pendapatan");
        movieList.add(movie);
        movie = new Movie("Rp. 3.000,000", "Bayar Utang (18/1/20) ", "Pengeluaran");
        movieList.add(movie);
        movie = new Movie("Rp. 47.000,000", "Gaji (05/1/20) ", "Pendapatan");
        movieList.add(movie);
        movie = new Movie("Rp. 120,000", "Uang Makan (13/1/20) ", "Pengeluaran");
        movieList.add(movie);
        movie = new Movie("Rp. 47.000,000", "Gaji (05/1/20) ", "Pendapatan");
        movieList.add(movie);
        movie = new Movie("Rp. 3.000,000", "Bayar Utang (18/1/20) ", "Pengeluaran");
        movieList.add(movie);
        movie = new Movie("Rp. 47.000,000", "Gaji (05/1/20) ", "Pendapatan");
        movieList.add(movie);
        movie = new Movie("Rp. 120,000", "Uang Makan (13/1/20) ", "Pengeluaran");
        movieList.add(movie);
        movie = new Movie("Rp. 47.000,000", "Gaji (05/1/20) ", "Pendapatan");
        movieList.add(movie);
        movie = new Movie("Rp. 120,000", "Uang Makan (13/1/20) ", "Pengeluaran");
        movieList.add(movie);






        mAdapter.notifyDataSetChanged();
    }
}