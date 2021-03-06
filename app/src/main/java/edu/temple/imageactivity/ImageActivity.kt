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
        val selectedImg : ImageView = findViewById(R.id.selectedImage)
        val selectedImgText : TextView = findViewById(R.id.selectedImageText)
        val imageMenu : RecyclerView = findViewById(R.id.imageMenu)

        // call grid layout manager and image data object
        imageMenu.layoutManager = GridLayoutManager(this@ImageActivity, 3)
        val allImages = createImageArray()

        // assemble adapter
        val adapter = ImageAdapter(this@ImageActivity, allImages)
        imageMenu.adapter = adapter

        // call click listener from adapter class
        adapter.setOnItemClickListener(object : ImageAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                val item = allImages[position]
                selectedImg.setImageResource(item.src)
                selectedImgText.text = item.desc
            }
        })
    }

    // declare all image sources and text
    private fun createImageArray(): ArrayList<MyPicture> {
        return arrayListOf(
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
    }
}