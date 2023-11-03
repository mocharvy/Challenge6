package com.programmer.challenge6_ma.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.programmer.challenge6_ma.databinding.MenuItemBinding
import com.programmer.challenge6_ma.item.MenuItem

class MenuAdapter(
    private val menuItems: List<MenuItem>,
    private val onItemClick: (MenuItem) -> Unit
) : RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: MenuItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(menuItem: MenuItem) {
            binding.imgMakanan.setImageResource(menuItem.imageRes)
            binding.txtNamaMakanan.text = menuItem.name
            binding.txtTotalMakanan.text = "Rp. ${menuItem.price}"

            // Menggunakan onClickListener untuk item dengan menggunakan lambda onItemClick
            itemView.setOnClickListener {
                onItemClick(menuItem)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = MenuItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(menuItems[position])
    }

    override fun getItemCount(): Int {
        return menuItems.size
    }
}
