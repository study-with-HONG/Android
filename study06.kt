import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import com.example.sample05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    /*  build.gradle(:app) > android{}에 추가
            buildFeatures{
                viewBinding true
            }
    */
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // textView 전광판 효과 나타내기
//        setContentView(R.layout.activity_main)
//        val tv = findViewById<TextView>(R.id.textView)
//        tv.isSelected = true

        // editText 실시간 입력
        setContentView(binding.root)
        binding.editText.addTextChangedListener {
            Log.d("EditText", "실시간 입력 : ${it.toString()}")
        }
    }
}
