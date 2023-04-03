import org.gradle.api.Project
import java.io.FileInputStream
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.*

fun Project.loadProperties(fileName: String): Properties =
    Properties().apply {
        load(FileInputStream(file(fileName)))
    }