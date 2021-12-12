package yvg68.measurer.kotlin_spec
//my first comment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //сохраняет тек состояние при повороте экране и при нехватке памяти
        setContentView(R.layout.activity_main) // запускает файл activity_main.xml
    }

}