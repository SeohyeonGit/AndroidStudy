package com.example.androidstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


// 유저 환영 문구
fun userData(userName: String, userGrade: Int, userMajor: String): Unit{

    if(userGrade == 1){
        println("$userMajor 학과 신입생 $userName 님, 안녕하세요!")
    } else{
        println("$userMajor 학과 $userGrade 학년 $userName 님, 안녕하세요!")
    }

}


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 앱 테스트 문구
        val welcomeCode = "Hello World!!"
        println(welcomeCode)

        val userMajor: String = "정보통신"
        val userGrade : Int = 3
        val userName : String = "김서현"

        userData(userMajor, userGrade, userName)

    }
}