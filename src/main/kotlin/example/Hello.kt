package example

import javafx.geometry.Pos
import tornadofx.*

class HelloWorld : View() {
    override val root = hbox {
        button("Open new window").setOnAction {
            replaceWith(Another())
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
        label("new window")
        label("new window")
        label("new window")
    }
}

fun main(args: Array<String>) {
    launch<HelloWorldApp>()
}