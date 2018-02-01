package com.example.cemil.kotlincustomdialogexample

import android.app.Dialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.custom_view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDialog(view: View) {

        val dialog = Dialog(this)//Dialog çağırıyoruz
        dialog.setTitle("Custom Dialog")//Dialog başlığı

        dialog.setContentView(R.layout.custom_view)//Xml kaynağı yani görüntüsü tasarımı nereden alacağını belirtiyoruz
        dialog.setCancelable(false)//Burada ki false Custumdialog dışına tıkladığımızda Custom'dan çıkılmasını istemediğimizi belirtiyoruz
        dialog.exitBtn.setOnClickListener(View.OnClickListener {
            dialog.dismiss()//dismiss çıkış demektir
            Toast.makeText(this, "Çıkış Butonuna Tıkladınız", Toast.LENGTH_LONG).show()
        })//butona tıklayınca toast çağırıyoruz
        dialog.toastBtn.setOnClickListener(View.OnClickListener {
            dialog.dismiss()
            Toast.makeText(this, "Toast Oluşturuldu :D", Toast.LENGTH_LONG).show()
        })//butona tıklayınca toast çağırıyoruz
        dialog.show()//Custom dialog çağırıyoruz
    }
}
