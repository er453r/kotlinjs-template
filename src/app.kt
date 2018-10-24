import org.w3c.dom.HTMLHeadingElement
import kotlin.browser.document

fun main(args: Array<String>) {
    println("hello derp!")

    document.addEventListener("DOMContentLoaded", {
        val header = document.createElement("h1") as HTMLHeadingElement

        header.innerHTML = "LOLOLO"

        document.body?.appendChild(header)
    })
}
