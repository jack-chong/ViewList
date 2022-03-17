package com.jack.testapp

import org.junit.Test

import org.junit.Assert.*
import java.io.File

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    companion object {
        var count = 0
    }


    @Test
    fun addition_isCorrect() {

        val file = File("/Users/keke/Downloads/configuration")
        recursion(file)


        println("执行完成")
        println(count)
    }

    fun recursion(file: File) {
        if (file.exists()) {
            if (file.isDirectory) {
                if (file.listFiles()?.count { it.name != ".DS_Store" && !it.isDirectory}?: 0 > 36) {
                    println(file.absolutePath)
                }
                file.listFiles()?.forEach {
                    if (it.isDirectory) {
                        recursion(it)
                    }else{
                        count++
                        if (it.name.endsWith(".webp")) {
                            val it1 = it
                            it.name.removeSuffix(".webp").toIntOrNull()?.also {
                                if (it % 2 == 0) {
                                    it1.delete()
                                }
                            }
                        }
                    }
                }
            }else{


            }
        }
    }

}