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
        when(v?.id){
            R.id.click -> {
                var img = findViewById<ImageView>(R.id.whiteStar)

                img.visibility = if(img.visibility == View.VISIBLE){
                    val toast = Toast.makeText(this.applicationContext, "사라졌다", Toast.LENGTH_SHORT)
                    toast.show()
                    View.INVISIBLE // 이미지 없애기
                } else{
                    val toast = Toast.makeText(this.applicationContext, "나타났다", Toast.LENGTH_SHORT)
                    toast.show()
                    View.VISIBLE // 이미지 보여주기
                }
            }
        }
    }
}
