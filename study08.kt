import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.TextView
import com.example.study08.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    /*  build.gradle(:app)에 추가
            buildFeatures{
                viewBinding true
            }
    */
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 방법1 -> checkbox가 여러개면 모두 listener해줘야 함, 번거로움
//        setContentView(R.layout.activity_main)
//        val tv = findViewById<TextView>(R.id.textView)
//        val spring = findViewById<CheckBox>(R.id.checkBox1)
//
//        spring.setOnCheckedChangeListener { checkBox, isChecked ->
//            if (isChecked) {
//                Log.d("checkBox", "봄 선택")
//                tv.text = "봄"
//            } else {
//                Log.d("checkBox", "봄 선택 취소")
//                tv.text = ""
//            }
//        }
        // 방법 2 -> CompoundButton : checkbox가 여러 개일 때 사용
        setContentView(binding.root)
        binding.checkBox1.setOnCheckedChangeListener(listner)
        binding.checkBox2.setOnCheckedChangeListener(listner)
        binding.checkBox3.setOnCheckedChangeListener(listner)
        binding.checkBox4.setOnCheckedChangeListener(listner)
    }
    // 방법2
    val listner by lazy { CompoundButton.OnCheckedChangeListener { checkBox, isChecked ->
        val tv = findViewById<TextView>(R.id.textView)

        if(isChecked){
            when(checkBox.id){
                R.id.checkBox1 -> tv.append("봄")
                R.id.checkBox2 -> tv.append("여름")
                R.id.checkBox3 -> tv.append("가을")
                R.id.checkBox4 -> tv.append("겨울")
            }
        } else{
            when(checkBox.id){
                R.id.checkBox1 -> {
                    var str = tv.text
                    for(i in 0 until str.length){
                        if(str.substring(i, i+1) == "봄"){
                            str = str.substring(0, i) + str.subSequence(i+1, str.length)
                            break
                        }
                    }
                    tv.text=str
                }
                R.id.checkBox2 -> {
                    var str = tv.text
                    for(i in 0 until str.length){
                        if(str.substring(i, i+2) == "여름"){
                            str = str.substring(0, i) + str.subSequence(i+2, str.length)
                            break
                        }
                    }
                    tv.text=str
                }
                R.id.checkBox3 -> {
                    var str = tv.text
                    for(i in 0 until str.length){
                        if(str.substring(i, i+2) == "가을"){
                            str = str.substring(0, i) + str.subSequence(i+2, str.length)
                            break
                        }
                    }
                    tv.text=str
                }
                R.id.checkBox4 -> {
                    var str = tv.text
                    for(i in 0 until str.length){
                        if(str.substring(i, i+2) == "겨울"){
                            str = str.substring(0, i) + str.subSequence(i+2, str.length)
                            break
                        }
                    }
                    tv.text=str
                }
            }
        }
    } }
}
