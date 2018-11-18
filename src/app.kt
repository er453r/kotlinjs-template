import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLHeadingElement
import kotlin.browser.document

@JsModule("jquery")
external class JQuery() {
    constructor(selector:String)
    constructor(element: HTMLElement)
    fun hide(number:Int):JQuery
}

fun main() {
    println("hello derp 3!")

    document.addEventListener("DOMContentLoaded", {
        val header = document.createElement("h2") as HTMLHeadingElement

        header.innerHTML = "LOLOLO"

        document.body?.appendChild(header)

        JQuery(header).hide(5000)
    })
}
