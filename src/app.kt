import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLHeadingElement
import kotlin.browser.document

@JsModule("jquery")
external class JQuery() {
    constructor(selector:String)
    constructor(element: HTMLElement)
    fun hide(number:Int):JQuery
}

fun main(args: Array<String>) {
    println("hello derp!")

    document.addEventListener("DOMContentLoaded", {
        val header = document.createElement("h2") as HTMLHeadingElement

        header.innerHTML = "LOLOLO"

        document.body?.appendChild(header)

        JQuery(header).hide(5000)

        JQuery("h1").hide(5000)

    })
}
