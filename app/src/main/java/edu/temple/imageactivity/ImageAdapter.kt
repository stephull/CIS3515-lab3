package edu.temple.imageactivity

import android.content.*
import android.view.*
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter (_context : Context, _allImages : ArrayList<MyPicture>) : RecyclerView.Adapter<ImageAdapter.MyViewHolder>() {
    private val context = _context
    private val allImages = _allImages

    // declare new listener
    private lateinit var myListener : OnItemClickListener

    // create interface for your new listener
    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    // mutator (setter) function for listener above
    fun setOnItemClickListener(listener : OnItemClickListener) {
        myListener = listener
    }

    // manually-created class for view holder, includes pictures and text
    class MyViewHolder (itemView : View, listener : OnItemClickListener) : RecyclerView.ViewHolder(itemView) {
        var pictureView : ImageView = itemView.findViewById(R.id.pictureView)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }

    // creates view holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // grid layout list item(s)
        val holderItem = LayoutInflater.from(parent.context).inflate(R.layout.activity_imagemenu, parent, false)
        return MyViewHolder(holderItem, myListener)
    }

    // binds view holder
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.pictureView.setImageResource(allImages[position].src)
    }

    // returns number of items within MyPicture data object
    override fun getItemCount(): Int {
        return allImages.size
    }
}