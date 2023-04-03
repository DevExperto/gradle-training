import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

fun getDate(): String = LocalDate.now().run {
    format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL))
}