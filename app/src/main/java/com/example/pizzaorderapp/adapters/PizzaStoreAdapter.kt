package com.example.pizzaorderapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.pizzaorderapp.R
import com.example.pizzaorderapp.datas.Store

class PizzaStoreAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: List<Store>
) : ArrayAdapter<Store>(mContext, resId, mList) {

    var inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null){
            tempRow = inflater.inflate(R.layout.pizza_store_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]
        val storeNameTxt = row.findViewById<TextView>(R.id.pizzaStoreName)
        val logoImg = row.findViewById<ImageView>(R.id.logoImag)
        storeNameTxt.text = data.name

        Glide.with(mContext).load(data.logURL).into(logoImg)
        return row
        




         }
}