package com.example.topmovies

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.dogsapp_recyclerview_kotlin.MyAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val movies = arrayListOf<movie>()
        movies.add(movie(pic = R.drawable.inc , name = "Inception" , link = "https://www.imdb.com/title/tt1375666/"))
        movies.add(movie(pic = R.drawable.sow , name = "Scent of a Woman" , link = "https://www.imdb.com/title/tt0105323"))
        movies.add(movie(pic = R.drawable.seven , name = "se7en" , link = "https://www.imdb.com/title/tt0114369/"))
        movies.add(movie(pic = R.drawable.dps , name = "Dead Poets Society" , link = "https://www.imdb.com/title/tt0097165/"))
        movies.add(movie(pic = R.drawable.parasite , name = "parasite" , link = "https://www.imdb.com/title/tt6751668/"))
        movies.add(movie(pic = R.drawable.fg , name = "forrest gump " , link = "https://www.imdb.com/title/tt0109830/"))




        val adapter = MyAdapter(this , movies)
        val recycler: RecyclerView = findViewById(R.id.rv)
        recycler.adapter = adapter


    }

    override fun onBackPressed() {
        val exit = exit()
        exit.show(supportFragmentManager , null)

    }
}