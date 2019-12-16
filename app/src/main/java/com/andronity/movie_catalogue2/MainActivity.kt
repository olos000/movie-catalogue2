package com.andronity.movie_catalogue2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.andronity.movie_catalogue2.Adapter.CardViewMoviesAdapter
import com.andronity.movie_catalogue2.Fragment.MovieFragment
import com.andronity.movie_catalogue2.Fragment.TvMovieFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_movie.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener =
        object : BottomNavigationView.OnNavigationItemSelectedListener {

            override fun onNavigationItemSelected(@NonNull item: MenuItem): Boolean {
                val fragment: Fragment
                when (item.itemId) {
                    R.id.navigation_movies -> {
                        fragment = MovieFragment()
                        supportFragmentManager.beginTransaction()
                            .replace(
                                R.id.container_layout,
                                fragment
                            )
                            .commit()
                        return true
                    }
                    R.id.navigation_tvshow -> {
                        fragment = TvMovieFragment()
                        supportFragmentManager.beginTransaction()
                            .replace(
                                R.id.container_layout,
                                fragment

                            )
                            .commit()
                        return true
                    }
                }
                return false
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
