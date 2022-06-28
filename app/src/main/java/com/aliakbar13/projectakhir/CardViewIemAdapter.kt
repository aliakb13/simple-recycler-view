package com.aliakbar13.projectakhirimport android.content.Contextimport android.view.LayoutInflaterimport android.view.Viewimport android.view.ViewGroupimport android.widget.ImageViewimport android.widget.TextViewimport androidx.recyclerview.widget.RecyclerViewimport com.bumptech.glide.Glideimport com.bumptech.glide.request.RequestOptionsclass CardViewIemAdapter(    private val listIem: ArrayList<Iem>,    val listener: (Iem) -> Unit) : RecyclerView.Adapter<CardViewIemAdapter.ViewHolder>() {    inner class ViewHolder(itemView: View) :  RecyclerView.ViewHolder(itemView){        var img: ImageView = itemView.findViewById(R.id.img_iem)        var tvName: TextView = itemView.findViewById(R.id.tv_name_iem)        var tvPrice: TextView = itemView.findViewById(R.id.tv_price_iem)        var tvShortReview: TextView = itemView.findViewById(R.id.tv_review_iem)        fun bindView(iem: Iem, listener: (Iem) -> Unit) {            Glide.with(itemView.context)                .load(iem.photo)                .apply(RequestOptions().override(350,550))                .into(img)            tvName.text = iem.name            tvPrice.text = iem.price            tvShortReview.text = iem.shortReview            itemView.setOnClickListener {                listener(iem)            }        }    }    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.iem_list,parent,false)        return ViewHolder(view)    }    override fun onBindViewHolder(holder: ViewHolder, position: Int) {        holder.bindView(listIem[position], listener)    }    override fun getItemCount() = listIem.size}