package com.leodomprdevs.turismojuizdefora.app.ui.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.leodomprdevs.turismojuizdefora.R
import com.leodomprdevs.turismojuizdefora.app.model.Turismo
import com.leodomprdevs.turismojuizdefora.app.ui.TelaInformacao


class ListaDeTurismoAdapter(
        private val context: Context,
        private val turismos : List<Turismo>


) : RecyclerView.Adapter<ListaDeTurismoAdapter.ViewHolder>() {



        class ViewHolder(view:View): RecyclerView.ViewHolder(view) {

                fun vincula(turismo: Turismo){
                        val textoTurismo = itemView.findViewById<TextView>(R.id.texto_local_turismo)
                        textoTurismo.text = turismo.local
                        val imagemTurismo = itemView.findViewById<ImageView>(R.id.imagem_local_turismo)
                        imagemTurismo.load(turismo.imagem.toString())
                        val dataTurismo = itemView.findViewById<TextView>(R.id.texto_datas_turismo)
                        dataTurismo.text = turismo.datas
                        val horaTurismo = itemView.findViewById<TextView>(R.id.texto_hora_turismo)
                        horaTurismo.text = turismo.horas
                        val avaliacaoTurismo = itemView.findViewById<TextView>(R.id.texto_avaliacao_turismo)
                        avaliacaoTurismo.text = turismo.avaliacao


                }





        }


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

                val inflater = LayoutInflater.from(context)
                val view = inflater.inflate(R.layout.item_lista_turismo, parent, false)
                return ViewHolder(view)
        }



        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                val turismo = turismos[position]
                holder.vincula(turismo)
                holder.itemView.setOnClickListener{
                       val intent = Intent(context, TelaInformacao::class.java)
                        intent.putExtra("turismoLocal", turismo.local)
                        intent.putExtra("turismoEndereco", turismo.endereco)
                        intent.putExtra("turismoDescricao", turismo.descricao)
                        intent.putExtra("turismoUrl", turismo.url)
                        intent.putExtra("imagemUrl", turismo.imagem)


                        context.startActivity(intent)
                }
        }

        override fun getItemCount(): Int = turismos.size

        }

