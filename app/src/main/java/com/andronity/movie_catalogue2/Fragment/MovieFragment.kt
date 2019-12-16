package com.andronity.movie_catalogue2.Fragment



import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.andronity.movie_catalogue2.Adapter.CardViewMoviesAdapter
import com.andronity.movie_catalogue2.Data.MoviesData
import com.andronity.movie_catalogue2.Movie
import com.andronity.movie_catalogue2.R


public class MovieFragment : Fragment() {
    private var rvCategory: RecyclerView? = null
    private val list = ArrayList<Movie>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_movie, container, false)


        rvCategory = view?.findViewById(R.id.rv_category)
        rvCategory!!.setHasFixedSize(true)

        list.addAll(MoviesData().listData)
        showRecyclerMovie()

        return view

    }

    private fun showRecyclerMovie() {
        rvCategory?.setLayoutManager(LinearLayoutManager(this.context))
        val cardViewMoviesAdapter = CardViewMoviesAdapter(list)
        rvCategory?.setAdapter(cardViewMoviesAdapter)
    }


}
