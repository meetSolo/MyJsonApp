package com.meet_solo.myjsonapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import kotlinx.android.synthetic.main.contact_row.view.*

class ContactAdapter: Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        //Tworzymy OBIEKT z kodu XML
        val layoutInflater = LayoutInflater.from(parent.context)
        val contactRow = layoutInflater.inflate(R.layout.fragment_home, parent, false)
        //nie zwracamy view tylko viewHolder
        return ContactViewHolder(contactRow)
    }

//poniższa metoda aktualizuje widoki
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val name = holder.itemView.name
        val number = holder.itemView.number

        name.setText(ContactDataBase.contactList[position])
        number.setText(ContactDataBase.contactListPhones[position])

    }

    override fun getItemCount(): Int {
return ContactDataBase.contactList.size
    }


}
class ContactViewHolder(view: View): RecyclerView.ViewHolder(view)
