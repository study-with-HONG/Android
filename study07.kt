import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioGroup
import android.widget.TextView
import com.example.sample11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    /*  build.gradle(:app)에 추가
            buildFeatures{
                viewBinding true
            }
    */
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 기본 방법
//        setContentView(R.layout.activity_main)
//
//        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
//        val tv = findViewById<TextView>(R.id.textView)
//
//        radioGroup.setOnCheckedChangeListener { groupId, btnId ->
//            Log.d("RadioButton", "radio 버튼 클릭")
//            when (btnId) {
//                R.id.radio1 -> tv.text = "안녕하세요"
//                R.id.radio2 -> tv.text = "감사해요"
//                R.id.radio3 -> tv.text = "잘 있어요"
//                R.id.radio4 -> tv.text = "다시 만나요"
//            }
//        }

        // binding 방법
        setContentView(binding.root)

        binding.radioGroup.setOnCheckedChangeListener { groupId, btnId ->
            Log.d("RadioButton", "radio 버튼 클릭")
            when (btnId) {
                R.id.radio1 -> binding.textView.text = "안녕하세요"
                R.id.radio2 -> binding.textView.text = "감사해요"
                R.id.radio3 -> binding.textView.text = "잘 있어요"
                R.id.radio4 -> binding.textView.text = "다시 만나요"
            }
        }
    }
}
