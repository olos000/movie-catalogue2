package com.andronity.movie_catalogue2.Adapter



import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andronity.movie_catalogue2.Movie
import com.andronity.movie_catalogue2.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.moviecardview.view.*


class CardViewMoviesAdapter(val listMovie: List<Movie>?) : RecyclerView.Adapter<CardViewMoviesAdapter.CardViewViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewMoviesAdapter.CardViewViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.moviecardview, parent, false)
        return CardViewViewHolder(view)
    }


    override fun getItemCount(): Int = listMovie?.size ?:0

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(movie: Movie){
            with(itemView){
                Glide.with(itemView.context)
                    .load(movie.photo)
                    .apply(RequestOptions().override(350, 550))
                    .into(img_photo)

                txt_name.text = movie.name
                txt_deskripsi.text = movie.description


            }
        }

    }


    override fun onBindViewHolder(holder: CardViewMoviesAdapter.CardViewViewHolder, position: Int) {
        holder.bind(listMovie!![position])
    }

}




