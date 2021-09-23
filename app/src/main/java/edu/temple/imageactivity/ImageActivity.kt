package edu.temple.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

class ImageActivity : AppCompatActivity() {

    data class ImageObject (val desc: String, val imageSrc: Int)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // define recycler view for menu and selected image/description:
        val selectedImage : ImageView = findViewById(R.id.selectedImage)
        val selectedDesc : TextView = findViewById(R.id.selectedDesc)
        val imageMenu : RecyclerView = findViewById(R.id.imageMenu)

        // declare all image sources and text:
        val allImages : Array<ImageObject> = arrayOf(
            ImageObject("", R.drawable.astronaut_in_space),
            ImageObject("", R.drawable.aurora_borealis),
            ImageObject("", R.drawable.blue_clouds),
            ImageObject("", R.drawable.desert),
            ImageObject("", R.drawable.diving_in_the_ocean),
            ImageObject("", R.drawable.grasslands),
            ImageObject("", R.drawable.high_waterfall),
            ImageObject("", R.drawable.lush_forest),
            ImageObject("", R.drawable.moon),
            ImageObject("", R.drawable.rainbow),
            ImageObject("", R.drawable.rice_fields),
            ImageObject("", R.drawable.sunset_and_tree)
        )

    }
}