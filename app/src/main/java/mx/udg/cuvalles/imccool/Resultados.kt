package mx.udg.cuvalles.imccool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_resultados.*

class Resultados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados)

        val intencion = intent

        val imc = intencion.getFloatExtra("imc", 0.0F)
        val a = Math.round(imc * 100) / 100.0
        val sexo = intencion.getStringExtra("gender")
        val age = intencion.getIntExtra("age", 25)

        tvResultadoIMC.text = "$a"
        Log.d("valor_imc", "$imc")
        Log.d("valor_sexo", "$sexo")
        Log.d("valor_edad", "$age")
        val i = interpretaIMC(imc,age,sexo)

        btnRegresar.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }

    fun interpretaIMC(imc: Float, edad: Int, sexo: String) {
        if (sexo == "f")
            when (edad) {
                in 19..24 -> {

                when (imc) {
                        in 18.9..22.1 -> {
                            tvRango.text = "optimo"
                            tvLeyenda.text = "Su peso corporal es Optimo. Buen trabajo"
                        }
                        in 22.2..25.0 -> {
                            tvRango.text = "Bueno"
                            tvLeyenda.text = "Su peso corporal es Bueno. Puede Mejorar"
                        }
                        in 25.1..100.1 -> {
                            tvRango.text = "Malo"
                            tvLeyenda.text = "Su peso corporal es Malo. Debe Ejercitarse"
                        }
                }
            when (edad) {
                in 25..29 -> {
                    when (imc) {
                        in 18.9..22.0 -> {
                            tvRango.text = "Optimo"
                            tvLeyenda.text = "Su peso corporal es Optimo. Buen trabajo"                            }
                            in 22.1..25.4 -> {
                                tvRango.text = "Bueno"
                                tvLeyenda.text = "Su peso corporal es Bueno. Puede Mejorar"
                            }
                            in 25.5..100.1 -> {
                                tvRango.text = "Malo"
                                tvLeyenda.text = "Su peso corporal es Malo. Debe Ejercitarse"
                            }
                        }
                }
            }
            when (edad) {
                in 30..34 -> {
                    when (imc) {
                        in 19.7..22.7 -> {
                            tvRango.text = "Optimo"
                            tvLeyenda.text = "Su peso corporal es Optimo. Buen trabajo"                                }
                                in 22.8..26.4 -> {
                                    tvRango.text = "Bueno"
                                    tvLeyenda.text = "Su peso corporal es Bueno. Puede Mejorar"
                                }
                                in 26.5..100.5 -> {
                                    tvRango.text = "Malo"
                                    tvLeyenda.text = "Su peso corporal es Malo. Debe Ejercitarse"
                                }
                            }
                        }
                    }
                    when (edad) {
                        in 35..39 -> {
                            when (imc) {
                                in 21.0..24.0 -> {
                                    tvRango.text = "Optimo"
                                    tvLeyenda.text = "Su peso corporal es Optimo. Buen trabajo"
                                }
                                in 24.1..27.7 -> {
                                    tvRango.text = "Bueno"
                                    tvLeyenda.text = "Su peso corporal es Bueno. Puede Mejorar"
                                }
                                in 27.8..100.1 -> {
                                    tvRango.text = "Malo"
                                    tvLeyenda.text = "Su peso corporal es Malo. Debe Ejercitarse"
                                }
                            }
                        }
                    }
                    when (edad) {
                        in 40..44 -> {
                            when (imc) {
                                in 22.6..25.6 -> {
                                    tvRango.text = "Optimo"
                                    tvLeyenda.text = "Su peso corporal es Optimo. Buen trabajo"
                                }
                                in 25.7..29.3 -> {
                                    tvRango.text = "Bueno"
                                    tvLeyenda.text = "Su peso corporal es Bueno. Puede Mejorar"
                                }
                                in 29.4..100.1 -> {
                                    tvRango.text = "Malo"
                                    tvLeyenda.text = "Su peso corporal es Malo. Debe Ejercitarse"
                                }
                            }
                        }
                    }
                    when (edad) {
                        in 45..49 -> {
                            when (imc) {
                                in 24.3..27.3 -> {
                                    tvRango.text = "Optimo"
                                    tvLeyenda.text = "Su peso corporal es Optimo. Buen trabajo"
                                }
                                in 27.4..30.9 -> {
                                    tvRango.text = "Bueno"
                                    tvLeyenda.text = "Su peso corporal es Bueno. Puede Mejorar"
                                }
                                in 31.0..100.1 -> {
                                    tvRango.text = "Malo"
                                    tvLeyenda.text = "Su peso corporal es Malo. Debe Ejercitarse"
                                }
                            }
                        }
                    }
                    when (edad) {
                        in 50..54 -> {
                            when (imc) {
                                in 26.6..29.7 -> {
                                    tvRango.text = "Optimo"
                                    tvLeyenda.text = "Su peso corporal es Optimo. Buen trabajo"
                                }
                                in 29.8..33.1 -> {
                                    tvRango.text = "Bueno"
                                    tvLeyenda.text = "Su peso corporal es Bueno. Puede Mejorar"
                                }
                                in 33.2..100.1 -> {
                                    tvRango.text = "Malo"
                                    tvLeyenda.text = "Su peso corporal es Malo. Debe Ejercitarse"
                                }
                            }
                        }
                    }
                    when (edad) {
                        in 55..59 -> {
                            when (imc) {
                                in 27.4..30.7 -> {
                                    tvRango.text = "Optimo"
                                    tvLeyenda.text = "Su peso corporal es Optimo. Buen trabajo"
                                }
                                in 30.8..34.0 -> {
                                    tvRango.text = "Bueno"
                                    tvLeyenda.text = "Su peso corporal es Bueno. Puede Mejorar"
                                }
                                in 34.1..100.1 -> {
                                    tvRango.text = "Malo"
                                    tvLeyenda.text = "Su peso corporal es Malo. Debe Ejercitarse"
                                }
                            }
                        }
                    }
                    when (edad) {
                        in 60..80 -> {
                            when (imc) {
                                in 27.6..31.0 -> {
                                    tvRango.text = "Optimo"
                                    tvLeyenda.text = "Su peso corporal es Optimo. Buen trabajo"
                                }
                                in 31.2..34.4 -> {
                                    tvRango.text = "Bueno"
                                    tvLeyenda.text = "Su peso corporal es Bueno. Puede Mejorar"
                                }
                                in 34.5..100.1 -> {
                                    tvRango.text = "Malo"
                                    tvLeyenda.text = "Su peso corporal es Malo. Debe Ejercitarse"
                                }
                            }
                        }
                    }
                }
                //tvMensaje.text = "$mensaje"
            }
        if (sexo == "m")
            when (edad) {
                in 19..24 -> {
                    when (imc) {
                        in 10.8..14.9 -> {
                            tvRango.text = "Optimo"
                            tvLeyenda.text = "Su peso corporal es Optimo. Buen trabajo"
                        }
                        in 15.0..19.0 -> {
                            tvRango.text = "Bueno"
                            tvLeyenda.text = "Su peso corporal es Bueno. Puede Mejorar"
                        }
                        in 19.1..100.1 -> {
                            tvRango.text = "Malo"
                            tvLeyenda.text = "Su peso corporal es Malo. Debe Ejercitarse"
                        }
                    }
                    when (edad) {
                        in 25..29 -> {
                            when (imc) {
                                in 12.8..16.5 -> {
                                    tvRango.text = "Optimo"
                                    tvLeyenda.text = "Su peso corporal es Optimo. Buen trabajo"
                                }
                                in 16.6..20.3 -> {
                                    tvRango.text = "Bueno"
                                    tvLeyenda.text = "Su peso corporal es Bueno. Puede Mejorar"
                                }
                                in 20.4..100.1 -> {
                                    tvRango.text = "Malo"
                                    tvLeyenda.text = "Su peso corporal es Malo. Debe Ejercitarse"
                                }
                            }
                        }
                    }
                    when (edad) {
                        in 30..34 -> {
                            when (imc) {
                                in 14.5..18.0 -> {
                                    tvRango.text = "Optimo"
                                    tvLeyenda.text = "Su peso corporal es Optimo. Buen trabajo"
                                }
                                in 18.1..21.5 -> {
                                    tvRango.text = "Bueno"
                                    tvLeyenda.text = "Su peso corporal es Bueno. Puede Mejorar"
                                }
                                in 21.6..100.1 -> {
                                    tvRango.text = "Malo"
                                    tvLeyenda.text = "Su peso corporal es Malo. Debe Ejercitarse"
                                }
                            }
                        }
                    }
                    when (edad) {
                        in 35..39 -> {
                            when (imc) {
                                in 16.1..19.4 -> {
                                    tvRango.text = "Optimo"
                                    tvLeyenda.text = "Su peso corporal es Optimo. Buen trabajo"
                                }
                                in 19.5..22.6 -> {
                                    tvRango.text = "Bueno"
                                    tvLeyenda.text = "Su peso corporal es Bueno. Puede Mejorar"
                                }
                                in 22.7..100.1 -> {
                                    tvRango.text = "Malo"
                                    tvLeyenda.text = "Su peso corporal es Malo. Debe Ejercitarse"
                                }
                            }
                        }
                    }
                    when (edad) {
                        in 40..44 -> {
                            when (imc) {
                                in 17.5..20.5 -> {
                                    tvRango.text = "Optimo"
                                    tvLeyenda.text = "Su peso corporal es Optimo. Buen trabajo"
                                }
                                in 20.6..23.6 -> {
                                    tvRango.text = "Bueno"
                                    tvLeyenda.text = "Su peso corporal es Bueno. Puede Mejorar"
                                }
                                in 23.7..100.1 -> {
                                    tvRango.text = "Malo"
                                    tvLeyenda.text = "Su peso corporal es Malo. Debe Ejercitarse"
                                }
                            }
                        }
                    }
                    when (edad) {
                        in 45..49 -> {
                            when (imc) {
                                in 18.6..21.5 -> {
                                    tvRango.text = "Optimo"
                                    tvLeyenda.text = "Su peso corporal es Optimo. Buen trabajo"
                                }
                                in 21.6..24.6 -> {
                                    tvRango.text = "Bueno"
                                    tvLeyenda.text = "Su peso corporal es Bueno. Puede Mejorar"
                                }
                                in 24.7..100.1 -> {
                                    tvRango.text = "Malo"
                                    tvLeyenda.text = "Su peso corporal es Malo. Debe Ejercitarse"
                                }
                            }
                        }
                    }
                    when (edad) {
                        in 50..54 -> {
                            when (imc) {
                                in 19.8..22.7 -> {
                                    tvRango.text = "Optimo"
                                    tvLeyenda.text = "Su peso corporal es Optimo. Buen trabajo"
                                }
                                in 22.8..25.6 -> {
                                    tvRango.text = "Bueno"
                                    tvLeyenda.text = "Su peso corporal es Bueno. Puede Mejorar"
                                }
                                in 25.6..100.1 -> {
                                    tvRango.text = "Malo"
                                    tvLeyenda.text = "Su peso corporal es Malo. Debe Ejercitarse"
                                }
                            }
                        }
                    }
                    when (edad) {
                        in 55..59 -> {
                            when (imc) {
                                in 20.2..23.2 -> {
                                    tvRango.text = "Optimo"
                                    tvLeyenda.text = "Su peso corporal es Optimo. Buen trabajo"
                                }
                                in 23.3..26.2 -> {
                                    tvRango.text = "Bueno"
                                    tvLeyenda.text = "Su peso corporal es Bueno. Puede Mejorar"
                                }
                                in 26.3..100.1 -> {
                                    tvRango.text = "Malo"
                                    tvLeyenda.text = "Su peso corporal es Malo. Debe Ejercitarse"
                                }
                            }
                        }
                    }
                    when (edad) {
                        in 60..80 -> {
                            when (imc) {
                                in 20.3..23.5 -> {
                                    tvRango.text = "Optimo"
                                    tvLeyenda.text = "Su peso corporal es Optimo. Buen trabajo"
                                }
                                in 23.6..26.7 -> {
                                    tvRango.text = "Bueno"
                                    tvLeyenda.text = "Su peso corporal es Bueno. Puede Mejorar"
                                }
                                in 26.8..100.1 -> {
                                    tvRango.text = "Malo"
                                    tvLeyenda.text = "Su peso corporal es Malo. Debe Ejercitarse"
                                }
                            }
                        }
                    }
                }
            }
        }
    }