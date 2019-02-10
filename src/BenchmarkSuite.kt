import javabenchmarks.*
import kotlinbenchmarks.converted.*

class BenchmarkSuite {

    val results: HashMap<String, Long> = hashMapOf()

    fun executeJavaFasta(){
        val key = "Fasta Java"
        val startTime = System.nanoTime()
        Fasta.execute()
        val endTime = System.nanoTime()
        results[key] = (endTime - startTime)
    }

    fun executeKotlinConvertedFasta(){
        val key = "Fasta Kotlin Converted"
        val startTime = System.nanoTime()
        FastaConverted.execute()
        val endTime = System.nanoTime()
        results[key] = (endTime - startTime)
    }

    fun executeJavaNBody(){
        val key = "NBody Java"
        val nbodyArgs = arrayOf("1")
        val startTime = System.nanoTime()
        NBody.execute(nbodyArgs)
        val endTime = System.nanoTime()
        results[key] = (endTime - startTime)
    }

    fun executeKotlinConvertedNBody(){
        val key = "NBody Kotlin Converted"
        val nbodyArgs = arrayOf("1")
        val startTime = System.nanoTime()
        NBodyConverted.execute(nbodyArgs)
        val endTime = System.nanoTime()
        results[key] = (endTime - startTime)
    }

    fun executeJavaFannkuchRedux(){
        val key = "FannkuchRedux Java"
        val nbodyArgs = arrayOf("1")
        val startTime = System.nanoTime()
        FannkuchRedux.execute(nbodyArgs)
        val endTime = System.nanoTime()
        results[key] = (endTime - startTime)
    }

    fun executeKotlinConvertedFannkuchRedux(){
        val key = "FannkuchRedux Kotlin Converted"
        val nbodyArgs = arrayOf("1")
        val startTime = System.nanoTime()
        FannkuchReduxConverted.execute(nbodyArgs)
        val endTime = System.nanoTime()
        results[key] = (endTime - startTime)
    }

    fun executeJavaBinaryTrees(){
        val key = "BinaryTrees Java"
        val nbodyArgs = arrayOf("1")
        val startTime = System.nanoTime()
        BinaryTrees.execute(nbodyArgs)
        val endTime = System.nanoTime()
        results[key] = (endTime - startTime)
    }

    fun executeKotlinConvertedBinaryTrees(){
        val key = "BinaryTrees Kotlin Converted"
        val nbodyArgs = arrayOf("1")
        val startTime = System.nanoTime()
        BinaryTreesConverted.execute(nbodyArgs)
        val endTime = System.nanoTime()
        results[key] = (endTime - startTime)
    }

    fun executeJavaRegexRedux(){
        val key = "RegexRedux Java"
        val nbodyArgs = arrayOf("1")
        val startTime = System.nanoTime()
        RegexRedux.execute(nbodyArgs)
        val endTime = System.nanoTime()
        results[key] = (endTime - startTime)
    }

    fun executeKotlinConvertedRegexRedux(){
        val key = "RegexRedux Kotlin Converted"
        val nbodyArgs = arrayOf("1")
        val startTime = System.nanoTime()
        RegexReduxConverted.execute(nbodyArgs)
        val endTime = System.nanoTime()
        results[key] = (endTime - startTime)
    }
}