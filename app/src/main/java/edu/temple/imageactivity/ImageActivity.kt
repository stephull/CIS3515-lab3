package edu.temple.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // define recycler view for menu and selected image/description:
        val selectedImage : ImageView = findViewById(R.id.selectedImage)
        val selectedDesc : TextView = findViewById(R.id.selectedDesc)
        val imageMenu : RecyclerView = findViewById(R.id.imageMenu)

        // declare all image sources and text:
        val allImages : Array<MyPicture> = arrayOf(
            MyPicture("Astronaut in Space", R.drawable.astronaut_in_space),
            MyPicture("Aurora Borealis", R.drawable.aurora_borealis),
            MyPicture("Blue Clouds", R.drawable.blue_clouds),
            MyPicture("Desert", R.drawable.desert),
            MyPicture("Diving in the Ocean", R.drawable.diving_in_the_ocean),
            MyPicture("Grasslands", R.drawable.grasslands),
            MyPicture("High Waterfall", R.drawable.high_waterfall),
            MyPicture("Lush Forest", R.drawable.lush_forest),
            MyPicture("Moon", R.drawable.moon),
            MyPicture("Rainbow", R.drawable.rainbow),
            MyPicture("Rice Fields", R.drawable.rice_fields),
            MyPicture("Sunset and Tree", R.drawable.sunset_and_tree)
        )

        // properties of the recycler view + grid layout manager
        val glm = GridLayoutManager(this, 2)
        imageMenu.layoutManager = glm

        // assemble adapter + new layout file (inside adapter file)

        // in the event that the user selects the image from the menu

    }
}