package example

import javafx.geometry.Pos
import tornadofx.*

class HelloWorld : View() {
    override val root = vbox {
        button("replace with another view").setOnAction {
            replaceWith(Another())
        }
        label("")
        button("open new window, but can't close current").setOnAction {
            Another().openWindow()
        }
    }
}

class HelloWorldStyle : Stylesheet() {
    init {
        root {
            prefWidth = 400.px
            prefHeight = 400.px
            alignment = Pos.CENTER
        }
    }
}

class HelloWorldApp : App(HelloWorld::class, HelloWorldStyle::class)

class Another : View() {
    override val root = hbox {
        label("new window")
    }
}

fun main(args: Array<String>) {
    launch<HelloWorldApp>()
}