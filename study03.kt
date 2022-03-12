import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View?) {
        val toast = Toast.makeText(this.applicationContext, "클릭", Toast.LENGTH_SHORT)
        toast.show()

        when(v?.id){
            R.id.click -> {
                var img = findViewById<ImageView>(R.id.whiteStar)

                img.visibility = if(img.visibility == View.VISIBLE){
                    View.INVISIBLE // 이미지 없애기
                } else{
                    View.VISIBLE // 이미지 보여주기
                }
            }
        }
    }
}
