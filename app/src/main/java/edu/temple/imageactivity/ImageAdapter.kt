package edu.temple.imageactivity

import android.content.*
import android.view.*
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter (private val context : Context, private val allImages : ArrayList<MyPicture>) : RecyclerView.Adapter<ImageAdapter.MyViewHolder>() {

    // manually-created class for view holder, includes pictures and text
    class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        var pictureView : ImageView = itemView.findViewById(R.id.pictureView)
    }

    // creates view holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // grid layout list item(s)
        val holderItem = LayoutInflater.from(parent.context).inflate(R.layout.activity_imagemenu, parent, false)
        return MyViewHolder(holderItem)
    }

    // binds view holder
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.pictureView.setImageResource(allImages[position].imageSrc)
    }

    // returns number of items within MyPicture data object
    override fun getItemCount(): Int {
        return allImages.size
    }
}