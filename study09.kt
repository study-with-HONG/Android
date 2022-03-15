import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import com.example.study08.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity(){
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //// ProgressBar
        // Thread.sleep는 메인스레드의 동작을 멈춰서 다음처럼 서브스레드에서 동작시킴.
        thread(start = true){ // 서브스레드(백그라운드)에서 동작
            Thread.sleep(3000) // 앱 실행되고 3초 후 실행
            runOnUiThread { //메인스레드에서 동작
                showProgressBar(false) // UI관련 코드는 메인에서 동작시킴
            }
        }
        //// SeekBar
        binding.seekBar.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(s: SeekBar?, progress: Int, fromUser: Boolean) {
                binding.sbText.text = "볼륨 : $progress"
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })
        //// RatingBar
        binding.ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fronUser ->
            binding.rbText.text = "${rating}점"
        }
    }
    //// ProgressBar
    fun showProgressBar(show:Boolean){
        if(show){
            binding.progressBar.visibility = View.VISIBLE
            binding.pbText.visibility = View.VISIBLE
        } else{
            binding.progressBar.visibility = View.GONE // 화면에서 사라짐
            binding.pbText.visibility = View.GONE      // 공간차지 X
       }
    }
}
