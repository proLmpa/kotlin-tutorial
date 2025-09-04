package org.example.factory

// Abstract Products
interface Button {
    fun render()
}

interface Checkbox {
    fun check()
}

// Concrete Products
class WindButton : Button {
    override fun render() = println("Windows Button")
}

class WinCheckbox : Checkbox {
    override fun check() = println("Windows Checkbox")
}

class MacButton : Button {
    override fun render() = println("Mac Button")
}

class MacCheckbox : Checkbox {
    override fun check() = println("Mac Checkbox")
}

// Abstract Factory
interface GUIFactory {
    fun createButton() : Button
    fun createCheckbox() : Checkbox
}

// Concrete Factories
class WinFactory : GUIFactory {
    override fun createButton() : Button = WindButton()
    override fun createCheckbox(): Checkbox = WinCheckbox()
}

class MacFactory : GUIFactory {
    override fun createButton() : Button = MacButton()
    override fun createCheckbox(): Checkbox = MacCheckbox()
}

// Client
fun main() {
    val os = System.getProperty("os.name").lowercase()
    val factory: GUIFactory = if ("win" in os) WinFactory() else MacFactory()

    val button = factory.createButton()
    val checkbox = factory.createCheckbox()

    button.render()
    checkbox.check()
}