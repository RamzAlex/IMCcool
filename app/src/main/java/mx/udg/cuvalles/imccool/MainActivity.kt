package mx.udg.cuvalles.imccool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resultados.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var edad: Int = 20
    var peso: Int = 81
    var altura: Int = 175
    var sexo: String = "f"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekAltura.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1 <= 100) {
                    seekAltura.setProgress(100)
                    tvAltura.text = "100"
                    altura = 100
                } else {
                    tvAltura.text = "$p1"
                    altura = p1
                }
                //tvAltura.text = "$p1"
                //TODO("Not yet implemented")
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                //TODO("Not yet implemented")
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                //   TODO("Not yet implemented")
            }
        })

        btnEdadMenos.setOnClickListener(this)
        btnEdadMas.setOnClickListener(this)
        btnPesoMenos.setOnClickListener(this)
        btnPesoMas.setOnClickListener(this)
        imBtnFemenino.setOnClickListener(this)
        btnCalcular.setOnClickListener(this)

        tvEdad.text = "$edad"
        tvPeso.text = "$peso"

    }

    override fun onClick(p0: View?) {
        when (p0!!.id) {
            R.id.btnEdadMenos -> {
                edad--
                tvEdad.text = "$edad"
            }
            R.id.btnEdadMas -> {
                edad++
                tvEdad.text = "$edad"
                /* var imc = calculaIMC(peso, altura)
              var intencion = Intent(PackageContext this,cr)*/
            }
            R.id.btnPesoMenos -> {
                peso--
                tvPeso.text = "$peso"
            }
            R.id.btnPesoMas -> {
                peso++
                tvPeso.text = "$peso"
            }
            R.id.imBtnFemenino -> sexo = "f"
            R.id.imBtnMasculino -> sexo = "m"
            R.id.btnCalcular -> {
                val imc = calculaIMC(peso, altura, sexo)
                val intencion = Intent(this, Resultados::class.java)
                intencion.putExtra("imc", imc)
                intencion.putExtra("gender", sexo)
                intencion.putExtra("age", edad)
                startActivity(intencion)
            }
        }
    }


    fun calculaIMC(peso: Int, altura: Int, sexo: String): Float {
        val pesoF = peso.toFloat()
        val alturaF = altura.toFloat()/100
        var imc = pesoF / (alturaF*alturaF)

        return imc.toFloat()
    }
}