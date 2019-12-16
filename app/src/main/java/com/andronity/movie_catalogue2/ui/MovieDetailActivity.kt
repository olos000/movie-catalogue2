package com.andronity.movie_catalogue2.ui


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.andronity.movie_catalogue2.R
import kotlinx.android.synthetic.main.moviecardview.*

class MovieDetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_MOVIE =" extra_movie"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val selectedVilm = intent.getParcelableExtra<com.andronity.movie_catalogue2.Movie>(EXTRA_MOVIE)

        if (selectedVilm != null) {
            val imgFoto =img_photo
            selectedVilm.photo?.let { imgFoto.setImageResource(it.toInt()) }
            imgFoto.setScaleType(ImageView.ScaleType.CENTER_CROP)

            val txtJudul = txt_name
            txtJudul.setText(selectedVilm.name)

            val txtDeskripsi = txt_deskripsi
            txtDeskripsi.setText(selectedVilm.description)

        }
    }
}
